package openull.com.dailyqt.ui.content;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import org.jetbrains.annotations.Nullable;

import openull.com.dailyqt.R;
import openull.com.dailyqt.databinding.ActivityContentBinding;
import openull.com.dailyqt.ui.base.BaseActivity;

/**
 * Created by eastroots92 on 2018-03-22.
 */

public class ContentActivity extends BaseActivity<Contract.Presenter> implements Contract.View {

    private ActivityContentBinding binding;

    @Override
    protected Contract.Presenter buildPresenter() {
        return new ContentPresenter(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_content);
        presenter.init();
    }

    @Override
    public void startInit() {

    }
}
