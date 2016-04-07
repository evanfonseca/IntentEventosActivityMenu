package com.example.enfonseca.intenteventosactivitymenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by enfonseca on 31/03/16.
 */
public class Perfil extends AppCompatActivity {

    String USER="";
    TextView tvNome, tvEmail, tvMorada, tvTel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfil);

        Intent intent= getIntent();
        Bundle b=intent.getExtras();

        USER = (String) b.get("USER");

        tvNome = (TextView) findViewById(R.id.nome);
        tvEmail= (TextView) findViewById(R.id.email);
        tvMorada= (TextView) findViewById(R.id.morada);
        tvTel= (TextView) findViewById(R.id.tel);

        this.carregaPerfil();
    }

    public void carregaPerfil() {

        tvNome.setText(USER);
        tvEmail.setText("evanfonseca@gmail.com");
        tvMorada.setText("Alto Solarino, Mindelo, CV");
        tvTel.setText("912345678");

    }
}
