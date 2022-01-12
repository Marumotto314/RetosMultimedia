package apel1apel2.mario.ciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    public static final String TAG = "Aplicación dice: ";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.util.Log.i(TAG, "onCreate. HOLA");
    }

    @Override
    protected void onStart() {
        super.onStart();
        android.util.Log.i(TAG, "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        android.util.Log.i(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        android.util.Log.i(TAG, "onDestroy. Adiós");
    }

    @Override
    protected void onPause() {
        super.onPause();
        android.util.Log.i(TAG, "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        android.util.Log.i(TAG, "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        android.util.Log.i(TAG, "onRestart");
    }
}