package apel1apel2.mario.appintentimplicito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBotonEjecutar(View v)
    {
        Intent i = new Intent();
        switch (v.getId())
        {
            case R.id.boton1:// El botón de llamar por alguna razón no funciona
                i.setAction(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:618816743"));
                startActivity(i);
                break;
            case R.id.boton2:
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://www.google.es"));
                startActivity(i);
                break;
            case R.id.boton3:
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("sms:5554433"));
                i.putExtra("sms_body", "Hola! Estoy aprendiendo Android :-)");
                startActivity(i);
                break;
            case R.id.boton4:
                i.setAction(Intent.ACTION_GET_CONTENT);
                i.setType("image/*");
                startActivity(i);
                break;

        }
    }
}