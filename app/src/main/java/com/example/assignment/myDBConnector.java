package com.example.assignment;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class myDBConnector extends SQLiteOpenHelper
{

    // terms for the structure of the database and columns of the table
    private static  int DB_VERSION = 1;
    private static  String DB_NAME = "Registration.db";
    private static  String TABLE_Users = "Users";
    private static  String COLUMN_ID = "UsersID";
    private static  String COLUMN_Name = "Name";
    private static  String COLUMN_UserName = "UserName";
    private static  String COLUMN_Password = "Password";

    // constructor for creating database
    public myDBConnector(Context context, String name,
                         SQLiteDatabase.CursorFactory factory, int version)
    {
        super (context, DB_NAME, factory, DB_VERSION);
    }

    // creating registration table
    @Override
    public void onCreate(SQLiteDatabase db)
    {

        // formulate a statement for a query that creates a table
        String CREATE_table = " CREATE TABLE " +
                TABLE_Users + " ( " +
                COLUMN_ID + " INTEGER PRIMARY KEY, " +
                COLUMN_Name + " varchar(100), " +
                COLUMN_UserName + " varchar(100), " +
                COLUMN_Password + " varchar(100) " + " ); ";

        // executing query
        db.execSQL(CREATE_table);



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    }

    public void addNewUser(String name, String userName, String Password)
    {
        ContentValues values = new ContentValues();
        values.put(COLUMN_Name, name);
        values.put(COLUMN_UserName, userName);
        values.put(COLUMN_Password, Password);

        SQLiteDatabase db = this.getWritableDatabase();

        db.insert(TABLE_Users, null, values);
        db.close();
    }

    // method for checking login details in registration table
    public boolean checkLogin(String username, String password)
    {
        boolean result = false;

        String query = "Select * FROM " + TABLE_Users + " WHERE " +
                COLUMN_UserName + " = \"" + username + "\"";

        SQLiteDatabase db = this.getWritableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        if (cursor.moveToFirst())
        {
            if (cursor.getString(3).equals(password))
            {
                result = true;
            }
        }
        else
        {
            result = false;
        }

        cursor.close();
        db.close();
        return result;
    }

    // method to find user
    public String findUser(String userName)
    {
        String s = null;

        String query = "SELECT * FROM " + TABLE_Users +
                " WHERE " + COLUMN_UserName + " = \"" + userName + "\"";

        SQLiteDatabase db = this.getWritableDatabase();

        Cursor cursor = db. rawQuery(query, null);

        if (cursor.moveToFirst())
        {
            s = Integer.parseInt(cursor.getString(0)) +
                    cursor.getString(1) +
                    cursor.getString(2) +
                    cursor.getString(3);
        }

        cursor.close();
        db.close();
        System.out.println(s);
        return s;
    }

}
