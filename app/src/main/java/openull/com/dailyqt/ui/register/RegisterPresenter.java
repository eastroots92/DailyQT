package openull.com.dailyqt.ui.register;

/**
 * Created by eastroots92 on 2018-03-22.
 */

public class RegisterPresenter implements Contract.Presenter {
    private Contract.View view;

    public RegisterPresenter(Contract.View view) {
        this.view = view;
    }

    @Override
    public void init() {
        view.startInit();
    }
}
