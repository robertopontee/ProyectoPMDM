package com.example.ejemplo1.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.ejemplo1.R;
import com.example.ejemplo1.entidades.Peliculas;

public class Anhadir_pelicula extends AppCompatActivity {

    private EditText etIntTituloPeliculaAñadir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anhadir_pelicula);

        final Button btnAnhadir = findViewById(R.id.btnAnhadirPelicula);
        etIntTituloPeliculaAñadir = findViewById(R.id.inputTituloPeliculaAñadir);



        btnAnhadir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



/*                Peliculas p = new Peliculas();

                p.setTituloPelicula(etIntTituloPeliculaAñadir.getText().toString());*/



            }
        });



    }
}
