package cruso.umg.gt.umgappparqueo;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Mario on 26/07/2017.
 */

public class DBParqueo extends SQLiteOpenHelper{
    public DBParqueo(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public DBParqueo(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table usuario (id integer primary key autoincrement, usuario text, contrasena text)");
        db.execSQL("insert into usuario value('admin','admin')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("create table usuario (id integer primary key autoincrement, usuario text, contrasena text)");
        db.execSQL("insert into usuario value('admin','admin')");
    }
}
