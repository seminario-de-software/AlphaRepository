package unicah.unicahapp;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import unicah.unicahapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class frgUniversidad extends Fragment {


    public frgUniversidad() {
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

        View frgView = inflater.inflate(R.layout.fragment_frg_universidad, container, false);

        CardView Card = (CardView) frgView.findViewById(R.id.card_view);
        Card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ((MainActivity) getActivity()).LoadFragment(new frgUnicah());
                Log.d("Fragment","CreateView->OnClickCard:Unicah");

            }
        });

        // Inflate the layout for this fragment
        return frgView;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

}
