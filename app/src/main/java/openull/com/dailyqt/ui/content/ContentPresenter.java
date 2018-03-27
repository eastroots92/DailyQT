package openull.com.dailyqt.ui.content;

/**
 * Created by eastroots92 on 2018-03-22.
 */

public class ContentPresenter implements Contract.Presenter{

    private Contract.View view;

    public ContentPresenter(Contract.View view) {
        this.view = view;
    }

    @Override
    public void init() {
        view.startInit();
    }
}
