package openull.com.dailyqt.ui.intro.step2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;

import org.jetbrains.annotations.Nullable;

import java.util.Date;

import openull.com.dailyqt.R;
import openull.com.dailyqt.databinding.ActivityIntroStep2Binding;
import openull.com.dailyqt.ui.base.BaseActivity;
import openull.com.dailyqt.ui.intro.step1.IntroStep1Activity;
import openull.com.dailyqt.ui.main.MainActivity;

/**
 * Created by eastroots92 on 2018-03-21.
 */

public class IntroStep2Activity extends BaseActivity<Contract.Presenter> implements Contract.View {
    private ActivityIntroStep2Binding binding;

    @Override
    protected Contract.Presenter buildPresenter() {
        return new IntroStep2Presenter(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_intro_step2);

        presenter.init();
    }

    @Override
    public void startInit() {
        inputNameManager();
    }

    private void inputNameManager() {
        editTextChecker();
    }

    private void editTextChecker() {
        binding.introNameFormEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                setOnButton(s);
            }


            @Override
            public void afterTextChanged(Editable s) {

            }

            private void setOnButton(CharSequence s) {
                if(s.length() != 0){
                    binding.introNameFormUnderBar.setBackgroundColor(Color.rgb(28,28,28));
                    binding.linearLayoutButton.setBackgroundColor(Color.rgb(28,28,28));
                    buttonClickListener();
                }else{
                    binding.introNameFormUnderBar.setBackgroundColor(Color.rgb(184,184,184));
                    binding.linearLayoutButton.setBackgroundColor(Color.rgb(184,184,184));
                }

                if(s.length() != 10){
//                    TODO : 최대 입력 가능 수는 10글자. 초과 시 Alert 띄우고 글자 9글자로 지우기.
                }
            }

            private void buttonClickListener() {
                binding.linearLayoutButton.setOnClickListener(__->{

                    String userName = binding.introNameFormEditText.getText().toString();
                    setUserData(userName);
                    startActivity(new Intent(IntroStep2Activity.this, MainActivity.class));
                    finish();
                });
            }

            private void setUserData(String userName) {
                Date date = new Date(System.currentTimeMillis());
                long day = date.getTime();

                SharedPreferences sharedPref = getSharedPreferences("userData", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("userName",userName);
                editor.putLong("userDate",day);
                editor.commit();
            }
        });
    }
}
