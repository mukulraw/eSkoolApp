package eskool.com.eskoolapp.ClassWork;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import eskool.com.eskoolapp.HomeWork.HomeWrkFrgmntThree;
import eskool.com.eskoolapp.R;

/**
 * Created by user on 5/8/2017.
 */

public class ClassWorkFrgmntTwo extends Fragment {
    CardView card;

    public ClassWorkFrgmntTwo() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.parent_hw2, container, false);

        FloatingActionButton button = (FloatingActionButton) view.findViewById(R.id.fab);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.app.FragmentManager fm = getActivity().getFragmentManager();
                eskool.com.eskoolapp.ClassWork.FilterDailog ratingBarFragment = new eskool.com.eskoolapp.ClassWork.FilterDailog();
                ratingBarFragment.show(fm, "dialog");

            }
        });

        card = (CardView) view.findViewById(R.id.card);
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ClassWrkFrgmntThree frag1 = new ClassWrkFrgmntThree();
                ft.replace(R.id.replace, frag1);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        return view;

    }
}