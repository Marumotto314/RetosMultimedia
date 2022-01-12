package apel1apel2.mario.invocacinremota;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void invocacionRemota(View v)
    {
        Intent i = new Intent();
        i.setClassName("apel1apel2.mario.AppIntent", "apel1apel2.mario.AppIntent.SegundaActividad");
        startActivity(i);
    }
}