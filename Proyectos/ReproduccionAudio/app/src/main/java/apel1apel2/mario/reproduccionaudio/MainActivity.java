package apel1apel2.mario.reproduccionaudio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;

public class MainActivity extends AppCompatActivity
{
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(this, R.raw.audio);
    }

    @Override
    protected void onDestroy() {
        mp.release();
        super.onDestroy();
    }

    // No haremos nada con las excepciones capturadas
    public void reiniciar(View v)
    {
        try {
            mp.prepare();
            mp.start();
        } catch (IOException e) {
        }
    }
    public void pausar(View v)
    {
        try{
            mp.pause();
        } catch (Exception e){
        }
    }
    public void parar(View v)
    {
        try {
            mp.stop();
            mp.release();
        }catch (Exception e){
        }
    }
    public void iniciar(View v)
    {
        android.util.Log.d("MÉTODO EJECUTADO ", "Iniciar");
        mp.start();
        /*
        try{
            mp.start();
        } catch (Exception e){
        }
        */
    }
}