package unicah.unicahapp;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
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
        lvRecordatorios = (ListView) vistaPrinciapal.findViewById(R.id.lvRecordatorios);
        lvAnuncios =      (ListView) vistaPrinciapal.findViewById(R.id.lvAnuncios);
        lvNoticias =      (ListView) vistaPrinciapal.findViewById(R.id.lvNoticias);

        getData();

        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                // repoblar los campos
                getData();
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
        String[] recordatorios = new String[]{"Prueba 1","Prueba 2","Prueba 3","Prueba 4","Prueba 5"};
        ArrayAdapter<String>adaptadorListas =  new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,recordatorios);
        lvRecordatorios.setAdapter(adaptadorListas);
        lvAnuncios.setAdapter(adaptadorListas);
        lvNoticias.setAdapter(adaptadorListas);

    }

}

