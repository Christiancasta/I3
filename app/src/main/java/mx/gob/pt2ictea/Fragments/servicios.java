package mx.gob.pt2ictea.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import mx.gob.pt2ictea.Activities.MainActivity;
import mx.gob.pt2ictea.R;

public class servicios extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_servicios, container, false);

        final TextView descriptionText1 = (TextView) view.findViewById(R.id.textView11);
        final TextView showAll = (TextView) view.findViewById(R.id.textView10);

        final TextView descriptionText2 = (TextView) view.findViewById(R.id.textView13);
        final TextView showAll2 = (TextView) view.findViewById(R.id.textView12);

        final TextView descriptionText3 = (TextView) view.findViewById(R.id.textView15);
        final TextView showAll3 = (TextView) view.findViewById(R.id.textView14);

        final TextView descriptionText4 = (TextView) view.findViewById(R.id.textView17);
        final TextView showAll4 = (TextView) view.findViewById(R.id.textView16);

        final TextView descriptionText5 = (TextView) view.findViewById(R.id.textView19);
        final TextView showAll5 = (TextView) view.findViewById(R.id.textView18);

        showAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAll.setText("Cursos Regulares");
                descriptionText1.setMaxLines(Integer.MAX_VALUE);
            }
        });

        showAll2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAll2.setText("Cursos de Extensión");
                descriptionText2.setMaxLines(Integer.MAX_VALUE);
            }
        });

        showAll3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAll3.setText("Servicios C.C.I.");
                descriptionText3.setMaxLines(Integer.MAX_VALUE);
            }
        });

        showAll4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAll4.setText("Servicios R.O.C.O.");
                descriptionText4.setMaxLines(Integer.MAX_VALUE);
            }
        });

        showAll5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAll5.setText("Otros Servicios");
                descriptionText5.setMaxLines(Integer.MAX_VALUE);
            }
        });

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
