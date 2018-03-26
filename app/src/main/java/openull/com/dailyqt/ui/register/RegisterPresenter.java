package openull.com.dailyqt.ui.register;


import android.arch.persistence.room.Room;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import openull.com.dailyqt.R;
import openull.com.dailyqt.db.ContentDatabase;
import openull.com.dailyqt.model.Content;


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
    public void setContentData(ContentDatabase contentDB, ContentData contentData) {
        String title = contentData.getTitle();
        String contnet = contentData.getContent();
        long date = contentData.getDate();
        String startBible = contentData.getStartBible();
        int startChapter = contentData.getStartChapter();
        int startVers = contentData.getStartVers();
        String finishBible = contentData.getFinishBible();
        int finishChapter = contentData.getFinishChapter();
        int finishVers = contentData.getFinishVers();
        int qtDate = contentData.getQtDate();

        contentDB.getContentDao().insertContents(new Content(title,contnet,date,startBible,startChapter,startVers,finishBible,finishChapter,finishVers,qtDate));

    }



}
