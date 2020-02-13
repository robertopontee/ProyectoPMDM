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
        p.setVisto(true);
        p.setImagen(R.drawable.imagenchihiro);

        Peliculas p2 = new Peliculas();
        p2.setTituloPelicula("La Princesa Mononoke");
        p2.setGenero("Accion");
        p2.setEdad(+8);
        p2.setVisto(false);
        p2.setImagen(R.drawable.princesamonono);

        Peliculas p3 = new Peliculas();
        p3.setTituloPelicula("Totoro");
        p3.setGenero("Fantasia");
        p3.setEdad(+10);
        p3.setVisto(false);
        p3.setImagen(R.drawable.imagentotoro);

        List<Peliculas> peliculasList = new ArrayList<>();

        peliculasList.add(p);
        peliculasList.add(p2);
        peliculasList.add(p3);

        return peliculasList;
    }
}
