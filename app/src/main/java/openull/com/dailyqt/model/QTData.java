package openull.com.dailyqt.model;

import io.realm.RealmObject;

/**
 * Created by eastroots92 on 2018-03-22.
 */

public class QTData extends RealmObject {

    public String title;
    public String content;
    public long date ;
    public String startBible;
    public int startChapter;
    public int startVers ;
    public String finishBible ;
    public int finishChapter ;
    public int finishVers ;

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public long getDate() {
        return date;
    }

    public String getStartBible() {
        return startBible;
    }

    public int getStartChapter() {
        return startChapter;
    }

    public int getStartVers() {
        return startVers;
    }

    public String getFinishBible() {
        return finishBible;
    }

    public int getFinishChapter() {
        return finishChapter;
    }

    public int getFinishVers() {
        return finishVers;
    }
}
