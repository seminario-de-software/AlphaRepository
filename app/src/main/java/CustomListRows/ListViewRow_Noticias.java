package CustomListRows;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import unicah.unicahapp.R;

/**
 * Created by JoseMunoz on 4/14/16.
 */
public class ListViewRow_Noticias extends ArrayAdapter<String> {

    /*
     las imagenes seran locales hasta
     que se entre en produccion con
     el servidor, en modo prueba las imagenes
     seran recursos de la aplicacion osea
     valores enteros (INT). en modo produccion
     se utilizará la libreria de smart image view
     y de la base de datos se obtendra nada mas el enlace
     hacia la imagen, osea un (String)
    */

    private String[] txtTitulos,txtResumenes;//imagenes;
    private int[] imagenes;
    private Context contexto;

    public ListViewRow_Noticias(Context context,String[] titulos,String[] resumenes,int[] imgNoticia, int layout){
        super(context,layout,titulos);

        this.contexto = context;
        this.txtTitulos = titulos;
        this.txtResumenes = resumenes;
        this.imagenes = imgNoticia;

    }

    public class viewHolder{
        TextView txtTitulo;
        TextView txtResumen;
        ImageView imgNoticiaHolder;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = ((LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.listviewrow_noticias,null);
        }

        final viewHolder myView = new viewHolder();

        myView.txtTitulo = (TextView)convertView.findViewById(R.id.txtTituloNoticia);
        myView.txtResumen = (TextView)convertView.findViewById(R.id.txtResumenNoticia);
        myView.imgNoticiaHolder = (ImageView)convertView.findViewById(R.id.imgNoticiaHolder);

        myView.imgNoticiaHolder.setImageResource(imagenes[position]);
        myView.txtTitulo.setText(txtTitulos[position]);
        myView.txtResumen.setText(txtResumenes[position]);

        return convertView;


    }
}
