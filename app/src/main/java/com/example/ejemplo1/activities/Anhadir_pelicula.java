package com.example.ejemplo1.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.ejemplo1.R;
import com.example.ejemplo1.entidades.Pelicula;

public class Anhadir_pelicula extends AppCompatActivity {
    private Activity miActivity;

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

        miActivity = this;


        Runnable r = new Runnable() {
            @Override
            public void run() {
                //Usuario user = new Usuario(1,"Roberto", "robertogalician@gmail.com", "1245234");
                //AppDataBase.getDB(this).iUsuarioDao().addUser(user);


            }
        };

        Thread t = new Thread(r);
        t.start();



    }
}
