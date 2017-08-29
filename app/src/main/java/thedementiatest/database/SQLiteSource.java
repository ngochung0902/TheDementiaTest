package thedementiatest.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import thedementiatest.object.User;

import java.util.ArrayList;

/**
 * Created by MyPC on 03/08/2017.
 */
public class SQLiteSource {
    private SQLiteOpenHelper sqLiteOpenHelper;
    private SQLiteDatabase sqLiteDatabase;
    private String[] allColumns = {SQLite.COLUMN_ID,SQLite.COLUMN_NAME,SQLite.COLUMN_ISPERSON,SQLite.COLUMN_DATEOFBIRTH,SQLite.COLUMN_LEVELOFEDUCATION,SQLite.COLUMN_SEX,SQLite.COLUMN_ETHNICITY,SQLite.COLUMN_AGE,SQLite.COLUMN_COUNT,SQLite.COLUMN_TEXTCOUNT,SQLite.COLUMN_WORK};
    private Context context;

    public SQLiteSource(Context context) {
        this.context = context;
        sqLiteOpenHelper = new SQLite(context);
    }

    public void open() throws SQLiteException
    {
        sqLiteDatabase = sqLiteOpenHelper.getWritableDatabase();
    }
    public void close() throws SQLiteException
    {
        sqLiteOpenHelper.close();
    }
    // add new note to dairy
    public void add(String name, String isperson, String birthday, String levelofeducation, String sex, String ethnicity, String age,String work,String count,String textcount)
    {

        ContentValues values = new ContentValues();
        values.put(SQLite.COLUMN_NAME, name);
        values.put(SQLite.COLUMN_ISPERSON, isperson);
        values.put(SQLite.COLUMN_DATEOFBIRTH,birthday);
        values.put(SQLite.COLUMN_LEVELOFEDUCATION, levelofeducation);
        values.put(SQLite.COLUMN_SEX, sex);
        values.put(SQLite.COLUMN_ETHNICITY, ethnicity);
        values.put(SQLite.COLUMN_AGE,age);
        values.put(SQLite.COLUMN_COUNT,count);
        values.put(SQLite.COLUMN_TEXTCOUNT,textcount);
        values.put(SQLite.COLUMN_WORK, work);
        // insert
        sqLiteDatabase.insert(SQLite.TABLE_NAME,null,values);
    }
    // delete note
    public void deleteNote(int id)
    {
        sqLiteDatabase.delete(SQLite.TABLE_NAME, SQLite.COLUMN_ID + "=" + id,null);
    }

    public void updateNote(int id){
//        sqLiteDatabase.update(SQLite.TABLE_NAME,SQLite.COLUMN_ID + "=" + id,);
        ContentValues  values = new ContentValues();
//        values.put();
    }

//    public void updatephone(int id, String new_phone){
//        ContentValues values = new ContentValues();
//        values.put(SQLite.COLUMN_PHONE, new_phone);
//        int ret =sqLiteDatabase.update(SQLite.TABLE_NAME,values,SQLite.COLUMN_ID + "=" + id, new String[]{phone});
//        if (ret==0){
//            Log.i("update data","update that bai");
//        }
//        else {
//            Log.i("update data","update thanh cong");
//        }
//    }

    public ArrayList<User> getAllContacts()
    {
        ArrayList<User> arr = new ArrayList<User>();

        Cursor cursor = sqLiteDatabase.query("user",allColumns,null,null,null,null,null);

        if(cursor == null)
        {
            return null;
        }
        // having notes
        cursor.moveToFirst();

        while(!cursor.isAfterLast())
        {
            User model = cursorToModel(cursor);
            arr.add(model);
            cursor.moveToNext();
        }
        return arr;
    }

    // get NoteModel from cursor
    private User cursorToModel(Cursor cursor)
    {
        User model = new User();
        model.id = cursor.getInt(0);
        model.name = cursor.getString(1);
        model.person = cursor.getString(2);
        model.dateofbirth = cursor.getString(3);
        model.levelofeducation = cursor.getString(4);
        model.sex = cursor.getString(5);
        model.ethnicity = cursor.getString(6);
        model.age = cursor.getString(7);
        model.count = cursor.getString(8);
        model.textcount = cursor.getString(9);
        model.work = cursor.getString(10);

        return model;
    }
}
