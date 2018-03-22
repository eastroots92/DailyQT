package openull.com.dailyqt.ui.main;

import java.util.Date;

/**
 * Created by eastroots92 on 2018-03-21.
 */

public class MainPresenter implements Contract.Presenter {
    private Contract.View view;

    public MainPresenter(Contract.View view) { this.view = view; }

    @Override
    public void init() {
        view.startInit();
    }

    @Override
    public int calcDate(long userDate) {
//        TODO : DDAY 계산 후 Data 리턴
        int dDay = 0;
        Date date = new Date(System.currentTimeMillis());
        long day = date.getTime();
        return dDay;
    }
}
