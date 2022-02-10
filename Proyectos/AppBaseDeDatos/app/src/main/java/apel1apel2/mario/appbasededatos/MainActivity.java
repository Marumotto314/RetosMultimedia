package apel1apel2.mario.appbasededatos;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CrearBD crearBD = new CrearBD(this);
/*
        SQLiteDatabase bdbdEscritura = crearBD.getWritableDatabase();

        //inserta 4 filas en la tabla tabla.
        bdbdEscritura.execSQL("INSERT INTO articulos VALUES(1,'papel');");
        bdbdEscritura.execSQL("INSERT INTO articulos VALUES(2,'lápiz');");
        bdbdEscritura.execSQL("INSERT INTO articulos VALUES(3,'carpeta');");
        bdbdEscritura.execSQL("INSERT INTO articulos VALUES(4,'bolígrafo');");
        bdbdEscritura.close();

        //Actualizar datos
        bdbdEscritura.execSQL("UPDATE articulos SET nombre='papel charol' WHERE ref=1");
        bdbdEscritura.execSQL("UPDATE articulos SET nombre='cinta adhesiva' WHERE nombre='carpeta' ");
        //Borrado de una fila.
        bdbdEscritura.execSQL("DELETE FROM articulos WHERE nombre='lápiz'");
*/
        TextView texto = findViewById(R.id.texto);

        SQLiteDatabase bdLectura = crearBD.getReadableDatabase();
        Cursor consulta = bdLectura.rawQuery("select * from articulos", null);
        texto.setText("");
        while(consulta.moveToNext())
        {
            texto.append("\n" + consulta.getInt(0) + "     " +consulta.getString(1));
        }
        bdLectura.close();
    }
}