package com.example.ejemplo1.entidades;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Usuario.class}, version = 1)
public abstract class AppDataBase extends RoomDatabase {
    public abstract IUsuarioDao iUsuarioDao();

    private static AppDataBase db = null;

    public static AppDataBase getDB(Context context) {
        if (db == null) {
           db = Room.databaseBuilder(context,
                    AppDataBase.class, "peliculasdb").build();
        }

        return db;
    }
}
