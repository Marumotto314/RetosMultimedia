package apel1apel2.mario.appradiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private static RadioGroup botones;
    private static TextView texto;
    private static CheckBox cb1, cb2, cb3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botones = findViewById(R.id.radioGroup);
        texto = findViewById(R.id.textoOculto);
        cb1 = findViewById(R.id.checkBox1);
        cb2 = findViewById(R.id.checkBox2);
        cb3 = findViewById(R.id.checkBox3);
    }

    public void botonPulsado(View v)
    {
        texto.setVisibility(View.VISIBLE);
        switch (botones.getCheckedRadioButtonId())
        {
            case R.id.radio1:
                texto.setText(R.string.RespAndroid);
                break;
            case R.id.radio2:
                texto.setText(R.string.RespIos);
                break;
            case R.id.radio3:
                texto.setText(R.string.RespWindow);
                break;
            case R.id.radio4:
                texto.setText(R.string.RespSimbian);
                break;
            case R.id.radio5:
                texto.setText(R.string.RespOtro);
                break;
        }

        if (cb1.isChecked())
            texto.append( " \n " +getString(R.string.RespCamara));
        if (cb2.isChecked())
            texto.append( " \n " +getString(R.string.RespBluetooh));
        if (cb3.isChecked())
            texto.append( " \n " +getString(R.string.RespSonidoDolby));
    }
}