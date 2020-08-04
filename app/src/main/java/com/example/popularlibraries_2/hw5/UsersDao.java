package com.example.popularlibraries_2.hw5;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import io.reactivex.Single;

@Dao
public interface UsersDao {
    @Query("SELECT * FROM users_base")
    Single<List<Users>> getAll();
    @Insert
    Single<Long> insert(Users users);
//    @Update
//    Single<Integer> update();
//    @Delete
//    Single<Integer> delete();
}
