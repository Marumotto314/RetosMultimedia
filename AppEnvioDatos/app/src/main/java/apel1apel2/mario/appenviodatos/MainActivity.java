package apel1apel2.mario.appenviodatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private static final int SECONDARY_ACTIVITY_TAG = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void saludar(View v)
    {
        EditText textoIntroducido = findViewById(R.id.textoIntroducido);
        String nombre = textoIntroducido.getText().toString();

        if(nombre.equals(""))
        {
            Toast toast = new Toast(getApplicationContext());
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setText("Nombre vacio");
            toast.show();
            return;
        }
        else {
            Intent i = new Intent(this, SegundaActividad.class);
            i.putExtra("nombre", nombre);
            startActivityForResult(i, SECONDARY_ACTIVITY_TAG);
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
    }
}