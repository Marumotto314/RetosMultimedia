package com.example.appenviodatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SegundaActividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);

        //almacena en la variable nombre el valor del atributo extra con clave “nombre” enviado desde la
        //actividad principal
        String nombre = getIntent().getStringExtra("nombre");
        TextView etiqueta = (TextView) findViewById(R.id.textView2);
        //almacena en la variable saludo el recurso de string con el mensaje a visualizar
        String saludo= getResources().getString(R.string.saludo);
        //String.format escribe nombre en el operador %s de el string saludo.
        etiqueta.setText(String.format(saludo, nombre));
    }

    public void onPulsame2(View v) {
        String respuesta;
        EditText et = (EditText) findViewById(R.id.etRespuesta);
        respuesta = et.getText().toString();
        Intent datos = new Intent();
        datos.putExtra("respuesta", respuesta);
        setResult(RESULT_OK, datos);
        finish();
    }
}