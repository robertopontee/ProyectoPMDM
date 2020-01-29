package com.example.ejemplo1.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ejemplo1.R;

public class RegistroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Button butRegistro = findViewById(R.id.btRegistro);
        butRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegistroActivity.this, "Boton pulsado", Toast.LENGTH_SHORT).show();




            }
        });


    }

    public void cambiarActivityMain(View view) {
            Intent intent = new Intent (this, MainActivity.class);
            startActivity(intent);
    }





}
