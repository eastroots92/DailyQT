package openull.com.dailyqt.ui.splash;

import android.content.Intent;
import android.content.SharedPreferences;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.util.Log;

import org.jetbrains.annotations.Nullable;

import openull.com.dailyqt.R;
import openull.com.dailyqt.databinding.ActivitySplashBinding;
import openull.com.dailyqt.ui.base.BaseActivity;
import openull.com.dailyqt.ui.intro.step1.IntroStep1Activity;
import openull.com.dailyqt.ui.main.MainActivity;

/**
 * Created by eastroots92 on 2018-03-21.
 */

public class SplashActivity extends BaseActivity<Contract.Presenter> implements Contract.View{

    private ActivitySplashBinding binding;

    @Override
    protected Contract.Presenter buildPresenter() {
        return new SplashPresenter(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash);

        presenter.init();
    }

    @Override
    public void changeActivity(Boolean isCurrent) {
        if (isCurrent){
            startActivity(new Intent(SplashActivity.this, MainActivity.class));

        }else{
            startActivity(new Intent(SplashActivity.this, IntroStep1Activity.class));
        }
        finish();
    }

    @Override
    public Boolean checkingUserData() {
        SharedPreferences pref = getSharedPreferences("userData", MODE_PRIVATE);
        String userName = pref.getString("userName","");

        if (userName != ""){
            return true;
        }else{
            return false;
        }
    }
}
