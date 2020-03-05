package com.example.ejemplo1.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ejemplo1.R;
import com.example.ejemplo1.adapters.AdapterPeliculas;
import com.example.ejemplo1.entidades.Pelicula;


import java.util.ArrayList;
import java.util.List;

public class ListaPeliculasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_peliculas);

        RecyclerView rvPeliculas =findViewById(R.id.rvPeliculas);
        rvPeliculas.setLayoutManager(new LinearLayoutManager(this));
        rvPeliculas.setHasFixedSize(true);

        //Adapter

        //Hacemos la Lista de las Peliculas

        List<Pelicula> peliculas = crearPeliculas();

        //Creamos el objeto Adapter para la Lista de Peliculas

        AdapterPeliculas ListAdapter = new AdapterPeliculas(this, peliculas);

        rvPeliculas.setAdapter(ListAdapter);
    }

    private List<Pelicula> crearPeliculas(){
        Pelicula p = new Pelicula();

        p.setTituloPelicula("El viaje de Chihiro");
        p.setGenero("Fantasía");
        p.setEdad(+6);
        p.setVisto(true);
        p.setImagen(R.drawable.imagenchihiro);

        Pelicula p2 = new Pelicula();
        p2.setTituloPelicula("La Princesa Mononoke");
        p2.setGenero("Accion");
        p2.setEdad(+8);
        p2.setVisto(false);
        p2.setImagen(R.drawable.princesamonono);

        Pelicula p3 = new Pelicula();
        p3.setTituloPelicula("Totoro");
        p3.setGenero("Fantasia");
        p3.setEdad(+10);
        p3.setVisto(false);
        p3.setImagen(R.drawable.imagentotoro);

        List<Pelicula> peliculasList = new ArrayList<>();

        peliculasList.add(p);
        peliculasList.add(p2);
        peliculasList.add(p3);

        return peliculasList;
    }

    public void cambiarActivityAñadirPelicula(View v){
        Intent intent = new Intent (this, Anhadir_pelicula.class);
        startActivity(intent);
    }
}
