package openull.com.dailyqt.ui.register;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import org.jetbrains.annotations.Nullable;

import openull.com.dailyqt.R;
import openull.com.dailyqt.databinding.ActivityRegisterBinding;
import openull.com.dailyqt.ui.base.BaseActivity;

/**
 * Created by eastroots92 on 2018-03-22.
 */

public class RegisterActivity extends BaseActivity<Contract.Presenter> implements Contract.View {

    private ActivityRegisterBinding binding;

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
    }

    private void toolbarManager() {
        backButtonListener();
    }

    private void backButtonListener() {
        binding.toolbarRegister.textViewBack.setOnClickListener(__->{
            finish();
        });
    }
}
