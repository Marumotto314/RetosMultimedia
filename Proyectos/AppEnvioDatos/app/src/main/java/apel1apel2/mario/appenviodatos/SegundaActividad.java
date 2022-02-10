package apel1apel2.mario.appenviodatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SegundaActividad extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);

        String nombre = getIntent().getStringExtra("nombre");
        TextView etiqueta = (TextView) findViewById(R.id.textView2);

        String saludo = getResources().getString(R.string.saludoSegundaActividad);
        etiqueta.setText(String.format(saludo, nombre));
    }

    public void responder(View v)
    {
        String respuesta;
        EditText editText = (EditText) findViewById(R.id.textoRespuesta);
        respuesta = editText.getText().toString();
        Intent datos = new Intent();
        datos.putExtra("resuesta", respuesta);
        setResult(RESULT_OK, datos);
        finish();
    }
}