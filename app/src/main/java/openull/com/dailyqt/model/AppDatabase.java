package openull.com.dailyqt.model;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by eastroots92 on 2018. 3. 24..
 */

@Database(entities = {Content.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract ContentDao contentDao();

}
