package com.roberto.ejemploroombasico;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.roberto.ejemploroombasico.DAO.PostDao;
import com.roberto.ejemploroombasico.DAO.ProductoDao;
import com.roberto.ejemploroombasico.DAO.UsuarioDao;
import com.roberto.ejemploroombasico.Model.Converters;
import com.roberto.ejemploroombasico.Model.Post;
import com.roberto.ejemploroombasico.Model.Producto;
import com.roberto.ejemploroombasico.Model.Usuario;

@Database(entities = {Post.class, Producto.class, Usuario.class},version = 1)
@TypeConverters({Converters.class})
public abstract class DatabasePosts extends RoomDatabase {
    public abstract PostDao get_postDao();
    public abstract ProductoDao get_productoDao();
    public abstract UsuarioDao get_usuarioDao();
}
