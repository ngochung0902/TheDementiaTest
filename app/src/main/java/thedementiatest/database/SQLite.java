package thedementiatest.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by MyPC on 03/08/2017.
 */
public class SQLite extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "user.db";
    public static final String TABLE_NAME = "user";
    // columns
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_ISPERSON = "isperson";
    public static final String COLUMN_DATEOFBIRTH = "dateofbirth";
    public static final String COLUMN_LEVELOFEDUCATION = "levelofeducation";
    public static final String COLUMN_SEX = "sex";
    public static final String COLUMN_ETHNICITY = "ethnicity";
    public static final String COLUMN_AGE = "age";
    public static final String COLUMN_COUNT= "count";
    public static final String COLUMN_TEXTCOUNT = "textcount";
    public static final String COLUMN_WORK = "work";
    // DB info
    public static final int DATABASE_VERSION = 1;
    private static final String CREATE_DATABASE = "CREATE TABLE "   + TABLE_NAME + "( "
            + COLUMN_ID + " INTEGER PRIMARY KEY  autoincrement,"
            + COLUMN_NAME + " text not null,"
            + COLUMN_ISPERSON + " text not null, "
            + COLUMN_DATEOFBIRTH+" text not null,"
            + COLUMN_LEVELOFEDUCATION + " text not null,"
            + COLUMN_SEX + " text not null, "
            + COLUMN_ETHNICITY+" text not null,"
            + COLUMN_AGE+" text not null,"
            + COLUMN_COUNT + " text not null, "
            + COLUMN_TEXTCOUNT+" text not null,"
            + COLUMN_WORK + " text);";
    public SQLite(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_DATABASE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXIST " + TABLE_NAME);
        onCreate(db);
    }
}
