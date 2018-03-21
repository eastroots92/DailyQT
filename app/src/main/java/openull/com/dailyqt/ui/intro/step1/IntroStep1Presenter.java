package openull.com.dailyqt.ui.intro.step1;

import android.os.Handler;

/**
 * Created by eastroots92 on 2018-03-21.
 */

public class IntroStep1Presenter implements Contract.Presenter {


    private Contract.View view;

    public IntroStep1Presenter(Contract.View view) {
        this.view = view;
    }

    @Override
    public void init() {
        view.startInit();
    }

    @Override
    public void waitTime() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                view.showButton();
            }
        },2000);

    }


}
