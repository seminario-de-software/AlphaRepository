package unicah.unicahapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


/**
 * A simple {@link Fragment} subclass.
 */
public class frgFacultades extends Fragment {


    public frgFacultades() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View frgView = inflater.inflate(R.layout.fragment_frg_facultades, container, false);

        ImageView Img = (ImageView) frgView.findViewById(R.id.thumbnail);
        Glide.with(Img.getContext()).load(R.mipmap.computacion).into(Img);
        Img = (ImageView) frgView.findViewById(R.id.thumbnail2);
        Glide.with(Img.getContext()).load(R.mipmap.civil).into(Img);
        Img = (ImageView) frgView.findViewById(R.id.thumbnail3);
        Glide.with(Img.getContext()).load(R.mipmap.industrial).into(Img);
        Img = (ImageView) frgView.findViewById(R.id.thumbnail4);
        Glide.with(Img.getContext()).load(R.mipmap.arquitectura).into(Img);
        Img = (ImageView) frgView.findViewById(R.id.thumbnail5);
        Glide.with(Img.getContext()).load(R.mipmap.enfermeria).into(Img);
        Img = (ImageView) frgView.findViewById(R.id.thumbnail8);
        Glide.with(Img.getContext()).load(R.mipmap.odontologia).into(Img);

        return frgView;
    }

}
