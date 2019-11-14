package com.example.season4foods;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {
    SQLiteDatabase db;

    private static final String DATABASE_NOME = "database.db";
    private static final int DATABASE_VERSION=201;

    public static final String INGREDIENTES = "ingredientes";

    public static final String IG_NOME = "lksjadlkajdlkj";
    public static final String IG_ID = "ig_id";
    private static final String IG_MES = "ig_mes";
    private static final String IG_DESC = "ig_desc";

    public DbHelper(Context context){
        super(context,DATABASE_NOME, null,DATABASE_VERSION);
    }
    ;


    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE " + INGREDIENTES + "("
                + IG_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + IG_NOME + " TEXT, "
                + IG_DESC + " TEXT, "
                + IG_MES + " TEXT);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS "+INGREDIENTES);
        onCreate(db);
    }

    //Passando texto da Activity Main para Receitas.
    public void insertReceita(String nome)
    {

        db=this.getWritableDatabase();
        ContentValues valores = new ContentValues();
        valores.put(IG_NOME,"aa_nome");

        long resultado = db.insert(DbHelper.INGREDIENTES,null,valores);
        db.close();
    }






}
