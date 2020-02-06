package com.example.ejemplo1.entidades;

public class Peliculas {
    private int Edad;
    private String TituloPelicula;
    private String Genero;
    private int imagen;
    private boolean visto;



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
