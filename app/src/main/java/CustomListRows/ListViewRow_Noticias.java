package CustomListRows;

import android.content.Context;
import android.widget.ArrayAdapter;

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

}
