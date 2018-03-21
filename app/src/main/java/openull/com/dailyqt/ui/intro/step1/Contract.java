package openull.com.dailyqt.ui.intro.step1;

/**
 * Created by eastroots92 on 2018-03-21.
 */

interface Contract {
    interface View {
        void startInit();

        void showButton();
    }

    interface Presenter {

        void init();

        void waitTime();
    }
}