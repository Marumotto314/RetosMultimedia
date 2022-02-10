package apel1apel2.mario.appconstraintlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    Button botonOcultar, botonVer;
    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Instanciamos los botones y la imagen
        botonOcultar = (Button) findViewById(R.id.buttonOcultar);
        botonVer = (Button) findViewById(R.id.botonVer);
        imagen = (ImageView) findViewById(R.id.imagenAndroid);

        // Creamos listeres para nuestros botones
        botonVer.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                verImagen();
            }});
        botonOcultar.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                ocultarImagen();
            }});
    }

    public void verImagen()
    {
        imagen.setVisibility(View.VISIBLE);
    }
    private void ocultarImagen()
    {
        imagen.setVisibility(View. INVISIBLE );
    }
}