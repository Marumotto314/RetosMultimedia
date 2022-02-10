package apel1apel2.mario.adivinaminumero;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements AccionesDialogo
{
    private static int numeroAleatorio;
    private static Random random = new Random();
    private static TextView texto;
    private static EditText numeroIntroducido;
    private static Button boton;
    private static boolean acertado = false;

    private static final String STATE_NUM_ELEGIDO = "numElegido";
    private static final String STATE_NUM_INTENTOS="numIntentos";
    private static final String STATE_MENSAJE = "mensajeActual";
    private static int numElegido, numIntentos = 0;
    private static String mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numeroAleatorio = random.nextInt(100)+1;
        texto = findViewById(R.id.textoSuperior);
        numeroIntroducido = findViewById(R.id.numeroIntroducido);
        boton = findViewById(R.id.boton);

    }

    @Override
    public void onSaveInstanceState(Bundle estado)
    {
        super.onSaveInstanceState(estado);
        estado.putInt(STATE_NUM_ELEGIDO, numElegido);
        estado.putInt(STATE_NUM_INTENTOS, numIntentos);
        estado.putString(STATE_MENSAJE, mensaje);
    }

    public void intentar(View v)
    {
        int nRecibido = Integer.parseInt(numeroIntroducido.getText().toString());
        Resources recursos = getResources();
        numIntentos++;

        if(acertado)
        {
            texto.setText(recursos.getText(R.string.textoSuperior));
            boton.setText(recursos.getText(R.string.boton));
            numeroIntroducido.setText("");
            numeroAleatorio = random.nextInt(100)+1;
            numElegido = numeroAleatorio;
            acertado = false;
            numIntentos = 0;
            return;
        }

        if(nRecibido == numeroAleatorio)
        {
            texto.setText("¡¡Has acertado!!");
            boton.setText("Jugar de nuevo");
            numElegido = -1;
            acertado = true;
        }
        else if(nRecibido < numeroAleatorio)
            texto.setText(String.format(recursos.getString(R.string.intento), nRecibido, "mayor"));
        else
            texto.setText(String.format(recursos.getString(R.string.intento), nRecibido, "menor"));
    }

    public void onDialogPositiveClick(DialogFragment dialog)
    {
        //iniciarJuego();
    }
    public void onDialogNegativeClick(DialogFragment dialog)
    {
        //finalizarJuego();
    }
}