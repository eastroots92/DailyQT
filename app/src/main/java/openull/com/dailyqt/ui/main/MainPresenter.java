package openull.com.dailyqt.ui.main;

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
}
