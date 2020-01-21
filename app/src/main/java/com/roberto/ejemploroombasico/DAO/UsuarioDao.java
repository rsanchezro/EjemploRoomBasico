package com.roberto.ejemploroombasico.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.roberto.ejemploroombasico.Model.Usuario;


import java.util.ArrayList;
import java.util.List;

@Dao
public interface UsuarioDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public long nuevo_usuario(Usuario pdto);
    @Insert
    public long[] nuevos_usuarios(ArrayList<Usuario> lista_pdto);
    @Update
    public int actualizar_usuario(Usuario pdto);
    @Delete
    public int eliminar_usuario(Usuario pdto);
    @Delete
    public int eliminar_usuarios(ArrayList<Usuario> lista_usuarios);

    //AHORA VAMOS CON LAS CONSULTAS
    @Query("Select * From usuario")
    public List<Usuario> obtener_usuarios();
    @Query("Select * From usuario where id= :Id_user")
    public Usuario obtener_usuario(int Id_user);
    @Query("Select * From usuario where Login= :log")
    public Usuario obtener_usuarioxlogin(String log);
}

