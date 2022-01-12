package apel1apel2.mario.appcuadrodedialogo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class Dialogo extends DialogFragment
{
    @Override
    public Dialog onCreateDialog(@Nullable Bundle v)
    {
        AlertDialog.Builder alertaDialogo = new AlertDialog.Builder(getActivity());
        alertaDialogo.setMessage(R.string.alerta);
        alertaDialogo.setTitle(R.string.titulo);
        alertaDialogo.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                new MainActivity().mostrarMensaje(getActivity());
            }
        });
        alertaDialogo.setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                return;
            }
        });

        return alertaDialogo.create();
    }
}
