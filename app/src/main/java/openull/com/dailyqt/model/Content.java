package openull.com.dailyqt.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.ColorInt;

/**
 * Created by eastroots92 on 2018-03-23.
 */

@Entity
public class Content {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "title")
    private String title;

    @ColumnInfo(name = "content")
    private String content;

    @ColumnInfo(name = "date")
    private long date;

    @ColumnInfo(name = "startBible")
    private String startBible;

    @ColumnInfo(name = "startChapter")
    private int startChapter;

    @ColumnInfo(name = "startVers")
    private int startVers;

    @ColumnInfo(name = "finishBible")
    private String finishBible;

    @ColumnInfo(name = "finishChapter")
    private int finishChapter;

    @ColumnInfo(name = "finishVers")
    private int finishVers;

    @ColumnInfo(name = "qtDate")
    private int qtDate;

    public Content(String title, String content, long date, String startBible, int startChapter, int startVers, String finishBible, int finishChapter, int finishVers, int qtDate) {
        this.title = title;
        this.content = content;
        this.date = date;
        this.startBible = startBible;
        this.startChapter = startChapter;
        this.startVers = startVers;
        this.finishBible = finishBible;
        this.finishChapter = finishChapter;
        this.finishVers = finishVers;
        this.qtDate = qtDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String getStartBible() {
        return startBible;
    }

    public void setStartBible(String startBible) {
        this.startBible = startBible;
    }

    public int getStartChapter() {
        return startChapter;
    }

    public void setStartChapter(int startChapter) {
        this.startChapter = startChapter;
    }

    public int getStartVers() {
        return startVers;
    }

    public void setStartVers(int startVers) {
        this.startVers = startVers;
    }

    public String getFinishBible() {
        return finishBible;
    }

    public void setFinishBible(String finishBible) {
        this.finishBible = finishBible;
    }

    public int getFinishChapter() {
        return finishChapter;
    }

    public void setFinishChapter(int finishChapter) {
        this.finishChapter = finishChapter;
    }

    public int getFinishVers() {
        return finishVers;
    }

    public void setFinishVers(int finishVers) {
        this.finishVers = finishVers;
    }

    public int getQtDate() {
        return qtDate;
    }

    public void setQtDate(int qtDate) {
        this.qtDate = qtDate;
    }
}
