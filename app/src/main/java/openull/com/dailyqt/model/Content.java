package openull.com.dailyqt.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by eastroots92 on 2018-03-23.
 */

@Entity
public class Content {
    
    private int id;

    private String title;
    private String content;
    private long date;
    private String startBible;
    private int startChapter;
    private int startVers;
    private String finishBible;
    private int finishChapter;
    private int finishVers;
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
