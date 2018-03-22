package openull.com.dailyqt.ui.register;


import android.widget.ArrayAdapter;
import android.widget.Spinner;

import io.realm.Realm;
import openull.com.dailyqt.R;
import openull.com.dailyqt.model.QTData;


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

    @Override
    public void saveQtData(ContentData contentData) {
        Realm.init(view.getContext());
        Realm qtData_realm = Realm.getDefaultInstance();

        qtData_realm.executeTransaction(new Realm.Transaction(){

            @Override
            public void execute(Realm realm) {

                QTData qtData = realm.createObject(QTData.class);

                qtData.title = contentData.getTitle();
                qtData.content = contentData.getContent();
                qtData.date = contentData.getDate();
                qtData.startBible = contentData.getStartBible();
                qtData.startChapter = contentData.getStartChapter();
                qtData.startVers = contentData.getStartVers();
                qtData.finishBible = contentData.getFinishBible();
                qtData.finishChapter = contentData.getFinishChapter();
                qtData.finishVers = contentData.getFinishVers();

            }
        });
    }


}
