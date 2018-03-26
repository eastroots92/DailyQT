package openull.com.dailyqt.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import openull.com.dailyqt.model.Content;

/**
 * Created by eastroots92 on 2018. 3. 25..
 */


@Database(entities = {Content.class}, version = 1)
public abstract class ContentDatabase extends RoomDatabase {

    public abstract ContentDao getContentDao();

}
