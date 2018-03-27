package openull.com.dailyqt.ui.intro.step2;

import android.content.Context;
import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;


/**
 * Created by eastroots92 on 2018-03-21.
 */

public class IntroStep2Presenter implements Contract.Presenter{

    private Contract.View view;

    public IntroStep2Presenter(Contract.View view) {
        this.view = view;
    }

    @Override
    public void init() {
        view.startInit();
    }

}
