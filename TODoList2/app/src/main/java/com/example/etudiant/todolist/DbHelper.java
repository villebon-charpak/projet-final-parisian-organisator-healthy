package com.example.etudiant.todolist;

import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper
private static final String DB_NAME = "ToDo" ;
private static final String TABLE_NAME = "ItemsToDo" ;
private static final String COLUMN_NAME = "Items" ;
private static final int DB_VERSION = 1 ;


public DbHelper(context context){
    super (context, DB_NAME, null, DB_VERSION);

}
@Override
public void oncreate (SQListDatabase db)
