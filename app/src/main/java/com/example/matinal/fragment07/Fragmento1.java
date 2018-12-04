package com.example.matinal.fragment07;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Fragmento1 extends Fragment {
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle saveInstanceState) {

        return inflater.inflate(R.layout.activity_fragmento1, container, false);
    }

    public void onStart() {
        super.onStart();
        Button btn1 = (Button) getActivity().findViewById(R.id.importarTexto1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                TextView lbl = (TextView) getActivity().findViewById(R.id.texto3);
                Toast.makeText(getActivity(), lbl.getText(), Toast.LENGTH_SHORT).show();
            }
        });
        Button btn2 = (Button) getActivity().findViewById(R.id.exportarTexto1);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                TextView texto = (TextView) getActivity().findViewById(R.id.texto4);
                texto.setText("TOCADO FRAG 1");
            }
        });
    }
}
