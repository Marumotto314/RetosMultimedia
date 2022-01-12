package apel1apel2.mario.appetiquetas;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView etiqueta1;
    EditText textoEditable;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etiqueta1 = (TextView)  findViewById(R.id.etiqueta1);
        String texto = etiqueta1.getText().toString();
        texto += "123";
        etiqueta1.setText(texto);
        etiqueta1.setBackgroundColor(Color.BLUE);

        textoEditable = (EditText) findViewById(R.id.cajaTexto);
        textoEditable.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent)
            {
                if(keyEvent.getAction() == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_4)
                {
                    cambiarTexto();
                    return true;
                }
                else
                    return false;
            }
        });
    }

    public void cambiarTexto()
    {
        String texto = textoEditable.getText().toString();
        etiqueta1.setText(texto);
    }
}