package apel1apel2.mario.adivinaminumero;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class Dialogo extends DialogFragment
{
    AccionesDialogo accionesDialogo;
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState)
    {
        AlertDialog.Builder alertaFin = new AlertDialog.Builder(getActivity());
        alertaFin.setMessage("Otra partida");
        alertaFin.setTitle("Adivina mi número");
        alertaFin.setPositiveButton("Si", new DialogInterface.OnClickListener()
        {
           @Override
           public void onClick(DialogInterface dialogInterface, int i)
           {
               accionesDialogo.onDialogNegativeClick(dialogo.this);
           }
        });
        return alertaFin.create();
    }
    @Override
    public void onAttach(Context c)
    {
        super.onAttach(c);
        accionesDialogo = (AccionesDialogo) c;
    }
}
