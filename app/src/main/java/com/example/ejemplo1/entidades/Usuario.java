package com.example.ejemplo1.entidades;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "usuarios")
public class Usuario {



    public Usuario(int id, String nombre, String correo, String contrasenha) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasenha = contrasenha;
    }

    @PrimaryKey
    @ColumnInfo (name = "id")
    private int id;

    @ColumnInfo (name = "NombreUsuario")
    private String nombre;

    @ColumnInfo(name = "Correo")
    private String correo;

    @ColumnInfo (name = "Contraseña")
    private String contrasenha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }
}
