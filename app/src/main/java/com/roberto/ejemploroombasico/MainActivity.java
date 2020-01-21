package com.roberto.ejemploroombasico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.roberto.ejemploroombasico.Model.Post;
import com.roberto.ejemploroombasico.Model.Producto;
import com.roberto.ejemploroombasico.Model.Usuario;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PostProductosUsuarios a=PostProductosUsuarios.get_Instance(this);
        a.getUsuarioDao().nuevo_usuario(new Usuario("roberto","roberto","rob@hotmail.com"));
        a.getProductoDao().nuevo_producto(new Producto("Colacao","Alimento","Polvo en cacao"));
        TextView usu=findViewById(R.id.usuarios_text);
        TextView pdt=findViewById(R.id.productos_text);
        ArrayList<Usuario> usuarios= (ArrayList<Usuario>) a.getUsuarioDao().obtener_usuarios();
        ArrayList<Producto> productos= (ArrayList<Producto>) a.getProductoDao().obtener_productos();

        for (Usuario u:usuarios
             ) {
            usu.append("Id: "+u.getId()+"-Log:"+u.getLogin()+"\n");
        }
        for(Producto p:productos)
        {
            pdt.append("Id: "+p.getId()+"-Nombre: "+p.getNombre()+"\n");
        }

        SimpleDateFormat formatfecha=new SimpleDateFormat("dd-MM-yyyy");

        try {
            Post p=new Post(formatfecha.parse("7-6-2017"),a.getUsuarioDao().obtener_usuarioxlogin("roberto").getId(),a.getProductoDao().obtener_productoxnombre("Colacao").getId(),"Rico pero malo");
            a.getPostDao().nuevo_post(p);
            Log.i("Informacion","ya esta");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
