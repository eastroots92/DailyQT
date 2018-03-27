package openull.com.dailyqt.ui.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.jetbrains.annotations.Nullable;

import openull.com.dailyqt.R;

/**
 * Created by eastroots92 on 2018-03-21.
 */

public abstract class BaseActivity<T> extends AppCompatActivity {
    protected T presenter;

    protected abstract T buildPresenter();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        presenter = buildPresenter();
        super.onCreate(savedInstanceState);

        this.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    @Override
    public void setContentView(int layoutResID) {super.setContentView(layoutResID); }

    @Override
    public void finish() {
        super.finish();
        this.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

}
