package openull.com.dailyqt.ui.main;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

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

    }
}
