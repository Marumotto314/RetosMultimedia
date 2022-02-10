package apel1apel2.mario.appsalvarinstancia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private int valor = 0;
    private TextView contador;
    private final static String VALOR_GUADADADO = "valor";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador = findViewById(R.id.contador);

        if(savedInstanceState != null)
        {
            valor = savedInstanceState.getInt(VALOR_GUADADADO);
            contador.setText(valor);
        }
        else
            contador.setText("uwu");

    }

    @Override
    public void onSaveInstanceState(Bundle estado)
    {
        super.onSaveInstanceState(estado);
        estado.putInt(VALOR_GUADADADO, valor);
    }

    public void incrementar(View v)
    {
        valor++;
        contador.setText(String.valueOf(valor));
    }

    public void decrementar(View v)
    {
        valor--;
        contador.setText(String.valueOf(valor));
    }
}