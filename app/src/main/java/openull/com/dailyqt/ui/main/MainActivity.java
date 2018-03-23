package openull.com.dailyqt.ui.main;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.content.SharedPreferences;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import org.jetbrains.annotations.Nullable;
import java.util.List;
import openull.com.dailyqt.R;
import openull.com.dailyqt.databinding.ActivityMainBinding;
import openull.com.dailyqt.model.Content;
import openull.com.dailyqt.ui.base.BaseActivity;
import openull.com.dailyqt.ui.register.RegisterActivity;

/**
 * Created by eastroots92 on 2018-03-21.
 */

public class MainActivity extends BaseActivity<Contract.Presenter> implements Contract.View {

    private ActivityMainBinding binding;
    private RecyclerView.Adapter contentAdapter;


    private List<Content> contents;

    @Override
    protected Contract.Presenter buildPresenter() {
        return new MainPresenter(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        presenter.init();
    }

    @Override
    public void startInit() {
        contentChecker();
        setDday();
        registerListener();

    }

    private void registerListener() {
        binding.tabBarMain.writeButton.setOnClickListener(__->{

            boolean isTodayRegister = validateRegister();
            startRegister(isTodayRegister);

        });
    }

    private void startRegister(boolean isTodayRegister) {
        if (isTodayRegister){
//            TODO : validateRegister 에서 만약 하루에 한번 체크를 하게 된다면 여기에 제제 안내 Alert 해야함.
        }else{
            startActivity(new Intent(MainActivity.this, RegisterActivity.class));
        }
    }

    private boolean validateRegister() {
//        TODO : DB에서 오늘 글 작성한 것이 있는 지 확인. (아직 고민 중. 하루에 한번만 쓰게 할 것인지 여러번 쓰게 할것인지.)
        return false;
    }

    private void setDday() {
        SharedPreferences pref = getSharedPreferences("userData", MODE_PRIVATE);
        long userDate = pref.getLong("userDate",0);
        int dDay = presenter.calcDate(userDate);
    }

    private void contentChecker() {
//        TODO : 리싸이클러 뷰, Content DB를 통해 데이터가 있으면 리사이클러 뷰를 동작한다.



        int contentCount = 1;
        if( contentCount != 0){
            initContent();
        }else{
            initNoContent();
        }
    }

    private void initNoContent() {
        binding.mainRecyclerView.setVisibility(View.GONE);
    }

    private void initContent() {
        binding.mainLinearLayout.setVisibility(View.GONE);
        initContentList();
    }

    private void initContentList() {

        binding.mainRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        contentAdapter = new ContentAdapter(contents);
        binding.mainRecyclerView.setAdapter(contentAdapter);

    }
}
