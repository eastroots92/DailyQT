package openull.com.dailyqt.ui.intro.step1;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import org.jetbrains.annotations.Nullable;

import openull.com.dailyqt.R;
import openull.com.dailyqt.databinding.ActivityIntroStep1Binding;
import openull.com.dailyqt.ui.base.BaseActivity;
import openull.com.dailyqt.ui.intro.step2.IntroStep2Activity;

/**
 * Created by eastroots92 on 2018-03-21.
 */

public class IntroStep1Activity extends BaseActivity<Contract.Presenter> implements Contract.View {
    private ActivityIntroStep1Binding binding;

    @Override
    protected Contract.Presenter buildPresenter() {
        return new IntroStep1Presenter(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_intro_step1);

        presenter.init();
    }

    @Override
    public void startInit() {
        binding.introNextButton.setVisibility(View.GONE);
        presenter.waitTime();
        nextButtonManager();
    }

    @Override
    public void showButton() {
        binding.introNextButton.setVisibility(View.VISIBLE);

    }
    private void nextButtonManager() {
        binding.introNextButton.setOnClickListener(__->{
            startActivity(new Intent(IntroStep1Activity.this, IntroStep2Activity.class));
            finish();
        });
    }
}
