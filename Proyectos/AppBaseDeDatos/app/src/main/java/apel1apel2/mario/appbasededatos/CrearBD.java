package apel1apel2.mario.appbasededatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CrearBD extends SQLiteOpenHelper
{
    //Nombre de la base de datos
    public static final String NOMBREBD = "bdarticulos.sdb";
    //Versión de la base de datos
    public static final int VERSION = 1;
    //Nombre de la tabla (puede haber tantas como necesitemos)
    public static final String NOMBRE_TABLA = "articulos";
    //Atributos o campos de la tabla
    public static final String REF = "ref";
    public static final String NOMBRE = "nombre";

    public CrearBD(Context context)
    {
        super(context, NOMBREBD, null, VERSION);
    }

    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("create table if not exists articulos (ref integer primary key autoincrement not null, nombre text);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1)
    {

    }
}
