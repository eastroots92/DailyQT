package openull.com.dailyqt.model;

import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by eastroots92 on 2018. 3. 24..
 */

public interface ContentDao {

    @Query("SELECT * FROM content")
    List<Content> getAllUsers();

    @Insert
    void insertAll(Content... contents);

}
