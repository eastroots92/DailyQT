package openull.com.dailyqt.ui.register;

import android.content.Context;
import android.widget.Spinner;

/**
 * Created by eastroots92 on 2018-03-22.
 */

interface Contract {
    interface View {

        void startInit();

        Context getContext();
    }

    interface Presenter {

        void init();

        void initBibleForm(Spinner startBook, Spinner finishBook);
    }

}
