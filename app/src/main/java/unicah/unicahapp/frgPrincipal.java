package unicah.unicahapp;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


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

    }

}

