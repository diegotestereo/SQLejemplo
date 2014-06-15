package com.example.sqlejemplo;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {
 EditText eTxt_Codigo,eTxt_Nombre;
 Button btn_Ins,btn_Act,btn_Elim;
	
	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        levantarXML();
        botones();
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

	private void botones() {
		btn_Act.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		btn_Elim.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
			
				
			}
		});
		
		
		btn_Ins.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	private void levantarXML() {
		btn_Act=(Button) findViewById(R.id.btn_Act);
		btn_Ins=(Button) findViewById(R.id.btn_Ins);
		btn_Elim=(Button) findViewById(R.id.btn_Elim);
		
		eTxt_Codigo=(EditText) findViewById(R.id.eTxt_Codigo);
		eTxt_Nombre=(EditText) findViewById(R.id.eTxt_Nombre);
	
		
	}

 

}
