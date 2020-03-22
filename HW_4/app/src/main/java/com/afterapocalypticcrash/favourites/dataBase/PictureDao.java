package com.afterapocalypticcrash.favourites.dataBase;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

import io.reactivex.Flowable;

@Dao
public interface PictureDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(PictureBD pic);

    @Query("SELECT * FROM favourites")
    Flowable<List<PictureBD>> getFavouriteList ();

    @Delete
    void deletePic (PictureBD pic);

}
