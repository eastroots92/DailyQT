package openull.com.dailyqt.db;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import java.util.List;

import openull.com.dailyqt.model.Content;

/**
 * Created by eastroots92 on 2018. 3. 24..
 */

@Dao
public interface ContentDao {
    @Query("Select * FROM content")
    List<Content> getAllContent();

    @Query("SELECT * FROM content WHERE id = :contentId LIMIT 1 ")
    List<Content> getContent(String id);

}
