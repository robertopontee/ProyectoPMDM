package com.example.ejemplo1.entidades;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "pelicula")
public class Pelicula {

    @PrimaryKey
    @ColumnInfo ( name = "id")
    private int id;

    @ColumnInfo (name = "edad")
    private int Edad;

    @ColumnInfo (name = "Titulo")
    private String TituloPelicula;

    @ColumnInfo (name = "Genero")
    private String Genero;

    @ColumnInfo (name = "imagen")
    private int imagen;

    @ColumnInfo (name = "visto")
    private boolean visto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getTituloPelicula() {
        return TituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        TituloPelicula = tituloPelicula;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }


}
