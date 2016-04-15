package unicah.unicahapp;


import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import CustomListRows.ListViewRow_Noticias;


/**
 * A simple {@link Fragment} subclass.
 */
public class frgPrincipal extends Fragment {

    // List Views
    private ListView lvRecordatorios;
    private ListView lvAnuncios;
    private ListView lvNoticias;
    // Vista principal
    private View vistaPrinciapal;
    // swipe refresh Layout
    private SwipeRefreshLayout refreshLayout;


    public frgPrincipal() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vistaPrinciapal = inflater.inflate(R.layout.fragment_frg_principal, container, false);

        refreshLayout =   (SwipeRefreshLayout) vistaPrinciapal.findViewById(R.id.swipeRefreshView);
        lvNoticias =      (ListView) vistaPrinciapal.findViewById(R.id.lvNoticias);

        getData();

        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                // repoblar los campos
                getData();
                Snackbar.make(vistaPrinciapal,"Se han Actualizado los datos",Snackbar.LENGTH_LONG).show();
                refreshLayout.setRefreshing(false);
            }
        });


        // Poblacion de las listas

        return vistaPrinciapal;

    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }


    // Metodos de uso privado

    private void getData(){
        String[] titulos = {"Noticia 1","Noticia 2"};
        String[] resumenes = {"Aliquam turpis ex, vulputate eget tempor rutrum, efficitur vel orci. Morbi nec quam elit. Proin et hendrerit metus, non sollicitudin nisl. Curabitur ut ullamcorper est. Cras congue tempor commodo. Integer laoreet, nunc id varius euismod, nisl diam convallis magna, id tempor tortor massa et lectus. Donec sit amet urna ut ligula condimentum placerat. Donec accumsan interdum consectetur. Vestibulum sed est dignissim, lacinia lacus at, tincidunt nibh. ","Interdum et malesuada fames ac ante ipsum primis in faucibus. Pellentesque blandit quam nisl, nec pharetra tellus placerat sit amet. Quisque sollicitudin iaculis felis, ut accumsan eros sollicitudin lacinia. Praesent commodo urna lorem, eu accumsan dolor fringilla eget. Duis pulvinar faucibus arcu a congue. Quisque auctor, lorem et efficitur luctus, felis nisl blandit quam, ut varius lacus diam id leo. Nunc consectetur quam a ex molestie, vitae dapibus urna venenatis. Nullam viverra, justo et venenatis dignissim, nisl neque faucibus odio, at elementum ex ex ut mi. Praesent enim sapien, rhoncus id varius eu, pulvinar auctor felis. Interdum et malesuada fames ac ante ipsum primis in faucibus. Duis euismod justo id neque tempus, sed suscipit lorem finibus. "};
        int[] imagenes = {R.mipmap.defaultnoticia,R.mipmap.defaultnoticia};

        ListViewRow_Noticias noticias = new ListViewRow_Noticias(vistaPrinciapal.getContext(),titulos,resumenes,imagenes,R.layout.listviewrow_noticias);
        lvNoticias.setAdapter(noticias);

    }

}

