package com.example.ejemplo1.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.ejemplo1.R;
import com.example.ejemplo1.adapters.AdapterPeliculas;
import com.example.ejemplo1.entidades.Peliculas;

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

        List<Peliculas> peliculas = crearPeliculas();

        //Creamos el objeto Adapter para la Lista de Peliculas

        AdapterPeliculas ListAdapter = new AdapterPeliculas(this, peliculas);

        rvPeliculas.setAdapter(ListAdapter);
    }

    private List<Peliculas> crearPeliculas(){
        Peliculas p = new Peliculas();
        p.setTituloPelicula("El viaje de Chihiro");
        p.setGenero("Fantasía");
        p.setEdad(+6);
        p.setVisto(false);
//        p.setImagen(1, );

        Peliculas p2 = new Peliculas();
        p2.setTituloPelicula("La Princesa Mononoke");
        p2.setGenero("Accion");
        p2.setEdad(+8);
        p2.setVisto(false);

        List<Peliculas> peliculasList = new ArrayList<>();

        peliculasList.add(p);
        peliculasList.add(p2);


        return peliculasList;
    }
}
