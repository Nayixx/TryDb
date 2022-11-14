package com.example.testarray;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper{

    public DBHelper(Context context) {
        super(context,"Test.db",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table answerTbl(set_name primary key, One Text, Two Text, Three Text, Four Text, Five Text, Six Text, Seven Text, Eight Text, Nine Text, Ten Text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists answerTbl");
    }

    public boolean insertData(String set_name, String One, String Two, String Three, String Four, String Five, String Six, String Seven, String Eight, String Nine, String Ten){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues val = new ContentValues();
        val.put("set_name", set_name);
        val.put("One", One);
        val.put("Two", Two);
        val.put("Three", Three);
        val.put("Four", Four);
        val.put("Five", Five);
        val.put("Six", Six);
        val.put("Seven", Seven);
        val.put("Eight", Eight);
        val.put("Nine", Nine);
        val.put("Ten", Ten);
        long result = db.insert("answerTbl", null, val);
        if (result == 1) {
            return false;
        }else{
            return true;
        }
    }
}
