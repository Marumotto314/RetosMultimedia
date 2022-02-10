package apel1apel2.mario.listviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Paises> listaPaises = new ArrayList<Paises>();
        listaPaises.add(new Paises("España", "Madrid"));
        listaPaises.add(new Paises("Francia", "Paris"));
        listaPaises.add(new Paises("Italia", "Roma"));

        MyArrayAdapter arrayAdapter = new MyArrayAdapter(this, listaPaises);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);


        listaPaises.add(new Paises("Inglaterra", "Londres"));
        listaPaises.add(new Paises("Rusia", "Moscu"));
        listaPaises.add(new Paises("Alemania", "Berlín"));
    }
}