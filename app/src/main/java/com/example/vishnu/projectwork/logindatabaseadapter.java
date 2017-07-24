package com.example.vishnu.projectwork;

/**
 * Created by vishn on 4/16/2017.
 */

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import static android.R.attr.password;

public class logindatabaseadapter
{
    static final String DATABASE_NAME = "login.db";
    //assigning a database name.
    static final int DATABASE_VERSION = 1;
    //In the database file, the version is stored at byte offset 60 in the database header
    // of the database file, in the field 'user cookie'.
    public static final int NAME_COLUMN = 1;


    // Create public field for each column in your table.
// SQL Statement to create a new database.
    static final String DATABASE_CREATE = "create table "+"LOGIN"+
            "( " +"ID"+" integer primary key autoincrement,"+ "USERNAME text,PASSWORD text); ";


    // Variable to hold the database instance
    public SQLiteDatabase db;


    // Context of the application using the database.
    private final Context context;
    // Database open/upgrade helper
    private dbhelper dbHelper;
    public logindatabaseadapter(Context _context)
    {
        context = _context;
        dbHelper = new dbhelper(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public logindatabaseadapter open() throws SQLException
            //throwing exception to and the predifined classes catch the exception
    {
        db = dbHelper.getWritableDatabase();

        return this;
    }
    public void close()
    {
        db.close();
    }

    public SQLiteDatabase getDatabaseInstance()
    {
        return db;
    }

    public void insertEntry(String userName,String password)
    {
        ContentValues newValues = new ContentValues();
// Assign values for each row.
        newValues.put("USERNAME", userName);
        newValues.put("PASSWORD",password);

// Insert the row into your table
        db.insert("LOGIN", null, newValues);
///Toast.makeText(context, "Reminder Is Successfully Saved", Toast.LENGTH_LONG).show();
    }
    public int deleteEntry(String UserName)
    {
//String id=String.valueOf(ID);
        String where="USERNAME=?";
        int numberOFEntriesDeleted= db.delete("LOGIN", where, new String[]{UserName}) ;
// Toast.makeText(context, "Number fo Entry Deleted Successfully : "+numberOFEntriesDeleted, Toast.LENGTH_LONG).show();
        return numberOFEntriesDeleted;
    }
    public String getSinlgeEntry(String userName)
    {
        Cursor cursor=db.query("LOGIN", null, " USERNAME=?", new String[]{userName}, null, null, null);
        if(cursor.getCount()<1) // UserName Not Exist
        {
            cursor.close();
            return "NOT EXIST";
        }
        cursor.moveToFirst();
        String password= cursor.getString(cursor.getColumnIndex("PASSWORD"));
        cursor.close();
        return password;
    }



    public String updateEntry(String userName) {
        ContentValues updatedValues = new ContentValues();
// Assign values for each row.
        updatedValues.put("USERNAME", userName);
        updatedValues.put("PASSWORD",password);

        String where="USERNAME = userName";
        db.update("LOGIN",updatedValues, where, new String[]{userName});
        return userName;
    }
}



