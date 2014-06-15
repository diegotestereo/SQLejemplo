package com.example.sqlejemplo;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// creo lbase de datos DBUsuarios
      UsuariosSQLiteHelper usdbh = new UsuariosSQLiteHelper(this, "DBUsuarios", null, 1);
      SQLiteDatabase bd =usdbh.getWritableDatabase();
      //insertare 5 datos   
      if(bd!=null){
    	  for(int i=1;i<=5;i++){
    		  //creo los datos
    		  
    		  int codigo=i ;
    		  String usuario="usuario_"+i;
    		  //inserto dato en la tabla usuarios
    		 bd.execSQL("INSERT INTO Usuarios (codigo,nombre) VALUES ("+codigo+","+usuario+")");
    		 bd.close(); 
    		  
    	  }
    	  
      } 
      
      
        
    }



}
