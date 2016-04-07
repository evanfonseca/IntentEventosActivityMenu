package com.example.enfonseca.intenteventosactivitymenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by enfonseca on 31/03/16.
 */
public class Login extends AppCompatActivity {

    Button login;
    EditText user, pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        user = (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.password);

    }


    public void logar(View v) {
        Intent intent =new Intent(this,MainActivity.class);

        String us = user.getText().toString();
        //String ps = pass.getText().toString();
        intent.putExtra("USER", ""+us);

        startActivity(intent);
    }


}
