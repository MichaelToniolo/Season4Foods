package com.example.season4foods;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class BancoController {
    private SQLiteDatabase db;
    private DbHelper banco;

    public BancoController(Context context){
        banco = new DbHelper(context);
    }

    public String insereDado(String id, String Nome){
        ContentValues valores;
        long resultado;


        db = banco.getWritableDatabase();
        valores = new ContentValues();
        valores.put(DbHelper.IG_ID, id);
        valores.put(DbHelper.IG_NOME, Nome);


        resultado = db.insert(DbHelper.INGREDIENTE, null, valores);
        db.close();


            return(null);

    }


    public Cursor carregaDados(){
        Cursor cursor;
        String[] campos =  {banco.IG_ID,banco.IG_NOME};
        db = banco.getReadableDatabase();
        cursor = db.query(banco.INGREDIENTE, campos, null, null, null, null, null, null);

        if(cursor!=null){
            cursor.moveToFirst();
        }
        db.close();
        return cursor;
    }
}
