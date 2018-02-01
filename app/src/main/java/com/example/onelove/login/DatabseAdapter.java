package com.example.onelove.login;

/**
 * Created by onelove on 10/3/2016.
 */
public class DatabseAdapter {
    static final String DATABASE_NAME = "login.db";
    static final int DATABASE_VERSION = 1;
    public static final int NAME_COLUMN = 1;
    static final String DATABASE_CREATE = "create table " + "LOGIN" + "( "
            + "ID" + " integer primary key autoincrement,"
            + "USERNAME  text,PASSWORD text); ";
    public SQLiteDatabase db;
    private final Context context;
    private DataBaseHelper dbHelper;
}
