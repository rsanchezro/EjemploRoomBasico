package com.roberto.ejemploroombasico;

import android.content.Context;

import androidx.room.Room;

import com.roberto.ejemploroombasico.DAO.PostDao;
import com.roberto.ejemploroombasico.DAO.ProductoDao;
import com.roberto.ejemploroombasico.DAO.UsuarioDao;

public class PostProductosUsuarios {
    private static PostProductosUsuarios obj;

    public PostDao getPostDao() {
        return postDao;
    }

    public ProductoDao getProductoDao() {
        return productoDao;
    }

    public UsuarioDao getUsuarioDao() {
        return usuarioDao;
    }

    private PostDao postDao;
    private ProductoDao productoDao;
    private UsuarioDao usuarioDao;

    private PostProductosUsuarios(Context c)
    {
        Context context=c.getApplicationContext();
        DatabasePosts bd= Room.databaseBuilder(context,DatabasePosts.class,"COMENTARIOS").allowMainThreadQueries().build();
        postDao=bd.get_postDao();
        productoDao=bd.get_productoDao();
        usuarioDao=bd.get_usuarioDao();


    }

    public static  PostProductosUsuarios get_Instance(Context c)
    {
        if(obj==null)
        {
            obj= new PostProductosUsuarios(c);
        }

            return obj;

    }
}
