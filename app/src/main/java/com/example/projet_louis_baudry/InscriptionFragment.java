package com.example.projet_louis_baudry;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class InscriptionFragment extends Fragment {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_inscription, container, false);
        EditText editTextnom,editTextPrenom,editTextTel,editTextMail,editTextPsw, editTextPseudo;
        editTextnom = view.findViewById(R.id.editTextnom);
        editTextMail = view.findViewById(R.id.editTextMail);
        editTextPrenom = view.findViewById(R.id.editTextprenom);
        editTextPsw = view.findViewById(R.id.editTextPsw);
        editTextTel = view.findViewById(R.id.editTextTel);
        editTextPseudo = view.findViewById(R.id.editTextTextPseudo);


        Button btn_inscription = view.findViewById(R.id.button_inscription);
        btn_inscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nom, prenom, tel, mail,psw,pseudo;
                nom = editTextnom.getText().toString();
                prenom = editTextPrenom.getText().toString();
                mail = editTextMail.getText().toString();
                tel = editTextTel.getText().toString();
                psw = editTextPsw.getText().toString();
                pseudo = editTextPseudo.getText().toString();
                Client client = new Client(pseudo,psw,mail,nom,prenom,tel);


            }
        });





        return view;
    }
}