package apel1apel2.mario.listviews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.constraintlayout.helper.widget.Layer;

import org.w3c.dom.Text;

import java.util.List;

public class MyArrayAdapter extends ArrayAdapter<Paises>
{
    public MyArrayAdapter(Context context, Paises[] paises)
    {
        super(context, 0, paises);
    }

    public MyArrayAdapter(Context context, List<Paises> lpaises)
    {
        super(context, 0, lpaises);
    }

    public View getView(int posicion, View convertView, ViewGroup parent)
    {
        Paises p = getItem(posicion);
        View v = LayoutInflater.from(getContext()).inflate(
                android.R.layout.simple_list_item_2,
                parent,
                false);
        TextView textView;
        textView = (TextView) v.findViewById(android.R.id.text1);
        textView.setText(p.getNombre());

        textView = (TextView) v.findViewById(android.R.id.text2);
        textView.setText(p.getCapital());

        return v;
    }
}
