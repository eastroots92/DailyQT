package openull.com.dailyqt.ui.splash;

import android.util.Log;

/**
 * Created by eastroots92 on 2018-03-21.
 */

public class SplashPresenter implements Contract.Presenter {
    private Contract.View view;
    private Boolean isCurrent;

    public SplashPresenter(Contract.View view)  {
        this.view = view;
    }

    @Override
    public void init() {
        activityManager();
    }

    private void activityManager() {
        thread.start();
    }

    Thread thread = new Thread(new Runnable(){
        @Override
        public void run() {
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            isCurrent = view.checkingUserData();
            view.changeActivity(isCurrent);
        }
    });
}
