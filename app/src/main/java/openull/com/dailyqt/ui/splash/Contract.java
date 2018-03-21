package openull.com.dailyqt.ui.splash;

/**
 * Created by eastroots92 on 2018-03-21.
 */

interface Contract {
    interface View {

        void changeActivity(Boolean isCurrent);

        Boolean checkingUserData();
    }

    interface Presenter {
        void init();

    }
}