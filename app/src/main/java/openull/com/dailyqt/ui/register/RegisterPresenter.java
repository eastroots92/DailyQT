package openull.com.dailyqt.ui.register;


import android.widget.ArrayAdapter;
import android.widget.Spinner;

import openull.com.dailyqt.R;


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

    @Override
    public void initBibleForm(Spinner startBook, Spinner finishBook) {

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(view.getContext(),
                R.array.bible, R.layout.spinner_layout);
        adapter.setDropDownViewResource(R.layout.spinner_item);

        startBook.setAdapter(adapter);
        finishBook.setAdapter(adapter);

    }



}
