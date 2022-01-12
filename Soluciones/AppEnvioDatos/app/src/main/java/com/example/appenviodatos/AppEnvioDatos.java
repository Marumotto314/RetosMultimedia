package com.example.appenviodatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AppEnvioDatos extends AppCompatActivity {

    EditText tx;
    private static final int SECONDARY_ACTIVITY_TAG = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appenviodatos);
    }

    public void onPulsame(View v) {

        tx=(EditText)findViewById(R.id.editText1);
        String texto = tx.getText().toString();

        if (texto.length()<1) {
            Context c = getApplicationContext();
            Toast t = Toast.makeText(c, R.string.msgtst, Toast.LENGTH_LONG);
            t.show();
        }
        else {


            //almacenamos en la variable texto el nombre escrito en la caja de texto
            Intent i = new Intent(this, SegundaActividad.class);

            //añadimos al intent un atributo extra de clave “nombre” y de valor el nombre almacenado en la
            //variable texto
            i.putExtra("nombre", texto);
            startActivityForResult(i,SECONDARY_ACTIVITY_TAG);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String respuesta;
        if ((resultCode == RESULT_CANCELED) ||
                (data.getStringExtra("respuesta").isEmpty()))
            respuesta = getResources().getString(R.string.antipatico);
        else
            respuesta = data.getStringExtra("respuesta");
        Context contexto = getApplicationContext();
        Toast.makeText(contexto, respuesta, Toast.LENGTH_LONG).show();
    } // onActivityResult

}