package openull.com.dailyqt.ui.register;

import android.app.AlertDialog;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.jetbrains.annotations.Nullable;

import java.util.Date;

import openull.com.dailyqt.R;
import openull.com.dailyqt.databinding.ActivityRegisterBinding;
import openull.com.dailyqt.ui.base.BaseActivity;

/**
 * Created by eastroots92 on 2018-03-22.
 */

public class RegisterActivity extends BaseActivity<Contract.Presenter> implements Contract.View {

    private ActivityRegisterBinding binding;
    private ContentData contentData ;

    @Override
    protected Contract.Presenter buildPresenter() {
        return new RegisterPresenter(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_register);
        presenter.init();
    }

    @Override
    public void startInit() {
        toolbarManager();
        inputFormManager();
    }

    @Override
    public Context getContext() {

        return RegisterActivity.this;
    }

    private void inputFormManager() {
        titleFormManager();
        bibleFormManager();
    }

    private void bibleFormManager() {
        presenter.initBibleForm(binding.startBook,binding.finishBook);
        startBibleManager();
        finishBibleManager();
    }

    private void startBibleManager() {
        startBookListener();
        startChapterListener();
        startVersListener();
    }

    private void startVersListener() {
        EditText startVers = binding.startVers;

        startVers.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

                String value = startVers.getText().toString();
                binding.finishVers.setText(value);
                                
                return true;
            }
        });
    }

    private void startChapterListener() {
        EditText startChapter = binding.startChapter;

        startChapter.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

                String value = startChapter.getText().toString();
                binding.finishChapter.setText(value);
                binding.startVers.requestFocus();

                return true;
            }
        });
    }

    private void startBookListener() {
        Spinner startBook = binding.startBook;
        startBook.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // finishBook에 설정
                int bookId = (int) startBook.getItemIdAtPosition(position);
                binding.finishBook.setSelection(bookId);
                
                focusOnStartChapter();
            }

            private void focusOnStartChapter() {
                String title = binding.editTextTitle.getText().toString();
                if(title.length() <= 0 ){
                    binding.editTextTitle.requestFocus();
                }else{
                    binding.startChapter.requestFocus();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void finishBibleManager() {
        finishChapterListener();
    }

    private void finishChapterListener() {
        EditText finishChapter = binding.finishChapter;

        finishChapter.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

                binding.finishVers.requestFocus();

                return true;
            }
        });

    }


    private void titleFormManager() {
        editTextEnter();
    }

    private void editTextEnter() {
        EditText inputFinish = binding.editTextTitle;

        inputFinish.setOnEditorActionListener(new TextView.OnEditorActionListener(){

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                boolean handled = false;

                setContentFocus();
                handled = true;

                return handled;
            }

            private void setContentFocus() {
                EditText editTextContent = binding.editTextContent;
                editTextContent.requestFocus();
            }
        });

    }

    private void toolbarManager() {
        backButtonListener();
        registerButtonListener();
    }

    private void registerButtonListener() {
        binding.toolbarRegister.textViewSubmit.setOnClickListener(__->{
            setContentData();
            boolean isRegisterReady = isRegisterReady();
            RegisterManger(isRegisterReady);
        });
    }

    private void RegisterManger(boolean isRegisterReady) {
        if(isRegisterReady){
            presenter.saveQtData(contentData);
            Toast.makeText(this, "말씀이 등록 되었습니다.", Toast.LENGTH_SHORT).show();
            finish();
        }else{
            Toast.makeText(this, "아직 입력되지 않은 내용이 있습니다.", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean isRegisterReady() {
        return contentData.isSubmit();
    }

    private void setContentData() {
        Date today = new Date(System.currentTimeMillis());

        String title = binding.editTextTitle.getText().toString();
        String content = binding.editTextContent.getText().toString();
        String startBible = binding.startBook.getSelectedItem().toString();
        String finishBible = binding.finishBook.getSelectedItem().toString();
        long date = today.getTime();

        int startChapter = isNullCheck(binding.startChapter.getText().toString());
        int startVers = isNullCheck(binding.startVers.getText().toString());
        int finishChapter = isNullCheck(binding.finishChapter.getText().toString());
        int finishVers = isNullCheck(binding.finishVers.getText().toString());

        contentData = new ContentData();

        contentData.setTitle(title);
        contentData.setContent(content);
        contentData.setStartBible(startBible);
        contentData.setFinishBible(finishBible);
        contentData.setDate(date);
        contentData.setStartChapter(startChapter);
        contentData.setStartVers(startVers);
        contentData.setFinishChapter(finishChapter);
        contentData.setFinishVers(finishVers);
    }

    private int isNullCheck(String i) {
        int value = 0;

        if (i.length() > 0){
            value = Integer.parseInt(i);
        }

        return value;
    }

    private void backButtonListener() {
        binding.toolbarRegister.textViewBack.setOnClickListener(__->{
            finish();
        });
    }
}
