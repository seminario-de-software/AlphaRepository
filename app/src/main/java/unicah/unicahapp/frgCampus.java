package unicah.unicahapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


/**
 * A simple {@link Fragment} subclass.
 */
public class frgCampus extends Fragment {


    public frgCampus() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View frgView = inflater.inflate(R.layout.fragment_frg_campus, container, false);

        CardView Card = (CardView) frgView.findViewById(R.id.card_view);

        Card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ((MainActivity) getActivity()).LoadFragment(new frgCampusSanPedro());
            }
        });

        ImageView Img = (ImageView) frgView.findViewById(R.id.thumbnail);
        Glide.with(Img.getContext()).load(R.mipmap.sanpedroysanpablo).into(Img);

        Img = (ImageView) frgView.findViewById(R.id.thumbnail2);
        Glide.with(Img.getContext()).load(R.mipmap.sagradocorazondejesus).into(Img);

        Img = (ImageView) frgView.findViewById(R.id.thumbnail3);
        Glide.with(Img.getContext()).load(R.mipmap.santiagoapostol).into(Img);

        Img = (ImageView) frgView.findViewById(R.id.thumbnail4);
        Glide.with(Img.getContext()).load(R.mipmap.diosespiritusanto).into(Img);

        Img = (ImageView) frgView.findViewById(R.id.thumbnail9);
        Glide.with(Img.getContext()).load(R.mipmap.santaclara).into(Img);

        Img = (ImageView) frgView.findViewById(R.id.thumbnail10);
        Glide.with(Img.getContext()).load(R.mipmap.sanjorge).into(Img);

        return frgView;
    }



}
