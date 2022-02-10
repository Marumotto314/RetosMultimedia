package apel1apel2.mario.apptoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onPulsame(View v)
    {
        Context c = getApplicationContext();
        Toast toast = new Toast(c);
        toast.setDuration(Toast.LENGTH_LONG);
        TimePicker hora = new TimePicker(c);
        // DatePicker calendario = new DatePicker(c);
        // toast.setView(calendario);
        toast.setView(hora);
        toast.show();
    }
}