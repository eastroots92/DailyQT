package openull.com.dailyqt.ui.main;

import android.content.SharedPreferences;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import org.jetbrains.annotations.Nullable;

import openull.com.dailyqt.R;
import openull.com.dailyqt.databinding.ActivityMainBinding;
import openull.com.dailyqt.ui.base.BaseActivity;

/**
 * Created by eastroots92 on 2018-03-21.
 */

public class MainActivity extends BaseActivity<Contract.Presenter> implements Contract.View {

    private ActivityMainBinding binding;

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
    }

    private void setDday() {
        SharedPreferences pref = getSharedPreferences("userData", MODE_PRIVATE);
        long userDate = pref.getLong("userDate",0);
        int dDay = presenter.calcDate(userDate);
    }

    private void contentChecker() {
//        TODO : 리싸이클러 뷰, Content DB를 통해 데이터가 있으면 리사이클러 뷰를 동작한다.
        int contentCount = 0;
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
    }
}
