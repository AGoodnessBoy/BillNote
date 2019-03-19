package ink.moming.note.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BillDbHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "bill.db";
    private static final int DATABASE_VERSION = 1;


    public BillDbHelper(@Nullable Context context) {
        super(context, DATABASE_NAME,null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        final String SQL_CREATE_MOVIE_TABLE =
                "CREATE TABLE " + BillContract.BillEntry.TABLE_NAME +" ("+
                        BillContract.BillEntry._ID+
                        " INTEGER PRIMARY KEY AUTOINCREMENT, "+
                        BillContract.BillEntry.COLUMN_BILL_NAME+
                        " TEXT NOT NULL, "+
                        BillContract.BillEntry.COLUMN_BILL_COUNT+
                        " INTEGER NOT NULL, "+
                        BillContract.BillEntry.COLUMN_BILL_REST+
                        " INTEGER NOT NULL, "+
                        BillContract.BillEntry.COLUMN_BILL_TYPE+
                        " TEXT NOT NULL, "+
                        BillContract.BillEntry.COLUMN_BILL_DATE+
                        " INTEGER NOT NULL, "+
                        BillContract.BillEntry.COLUMN_BILL_NUMBER+
                        " REAL NOT NULL, "+
                        BillContract.BillEntry.COLUMN_MONTHLY_TAG+
                        " INTEGER NOT NULL, "+
                        BillContract.BillEntry.COLUMN_RETURN_TAG+
                        " INTEGER NOT NULL, "+
                        " UNIQUE (" + BillContract.BillEntry.COLUMN_BILL_NAME+ ") ON CONFLICT REPLACE);";
        db.execSQL(SQL_CREATE_MOVIE_TABLE);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
