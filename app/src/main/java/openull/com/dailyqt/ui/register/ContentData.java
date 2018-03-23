package openull.com.dailyqt.ui.register;

/**
 * Created by eastroots92 on 2018-03-22.
 */

public class ContentData {

    private String title;
    private String content;
    private long date = 0;
    private String startBible;
    private int startChapter = 0;
    private int startVers = 0;
    private String finishBible ;
    private int finishChapter = 0;
    private int finishVers = 0;
    private int qtDate = 0;

    public int getQtDate() {
        return qtDate;
    }

    public void setQtDate(long date) {
        long myDate = date;
        long today = getDate();
//  TODO :  제일중요!!! Dday 계산하는 것 넣어야합니다!!!!!!!!!! 현재 이거 할 차례
//        https://www.youtube.com/watch?v=CTBiwKlO5IU    40:57
        this.qtDate = qtDate;
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

    public boolean isSubmit() {
        boolean isReady = true;

        if(getTitle() == ""){
            isReady = false;
        }

        if(getContent() == ""){
            isReady = false;
        }

        if(getDate() == 0){
            isReady = false;
        }

        if(getStartChapter() == 0){
            isReady = false;
        }

        if(getStartVers() == 0){
            isReady = false;
        }

        if(getFinishChapter() == 0){
            isReady = false;
        }

        if(getFinishVers() == 0){
            isReady = false;
        }

        if(getStartBible() == ""){
            isReady = false;
        }

        if(getFinishBible() == ""){
            isReady = false;
        }

        return isReady;
    }
}
