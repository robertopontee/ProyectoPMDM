package com.example.ejemplo1.entidades;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface IUsuarioDao {


    @Insert
    public void addUser(Usuario usuario);

    @Delete
    public void delete(Usuario usuario);

    @Query("SELECT * FROM usuarios")
    public List<Usuario> getAll();

    @Query("SELECT* FROM usuarios WHERE id IN (:userIds)")
    public List<Usuario> loadAllByIds (int[] userIds);

    @Query("SELECT * FROM usuarios WHERE NombreUsuario LIKE :UserName")
    Usuario findByName(String UserName);


}
