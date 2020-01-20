package com.roberto.ejemploroombasico.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.roberto.ejemploroombasico.Model.Post;

import java.util.ArrayList;

@Dao
public interface PostDao {
    //Metodo para añadir un nuevo Post, retorna el ID de la fila que se añade, se puede indicar void
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public long nuevo_post(Post p);
    //Metodo para añadir un listado de Post, retorna un array de los ID que se añaden, se podria indicar void
    @Insert
    public long[] nuevos_post(ArrayList<Post> listadopost);
    //Metodo para actualizar un post, devuelve el numero de filas actualizadas, solo se actualiza si existe un
    //post con ese identificador
    @Update
    public int actualizar_post(Post p);
    //Metodo para actualizar un listado de post, devuelve el numero de post actualizados
    @Update
    public int actualizar_posts(ArrayList<Post> listadopost);
    //Metodo para borrar un post, si lo encuentra, por la clave primaria lo elimina, si no no hace nada
    //Devuelve el numero de post eliminados
    @Delete
    public int borrar_post(Post p);
    @Delete
    public int borrar_posts(ArrayList<Post> listadopost);

    //AHORA VAMOS CON LAS CONSULTAS
    //Listado de todos los POST
    @Query("SELECT * FROM Post")
    public ArrayList<Post> listado_allPost();
    //Un post en concreto
    @Query("SELECT * FROM Post where Id= :Id_post")
    public Post buscar_Post(int Id_post);




}
