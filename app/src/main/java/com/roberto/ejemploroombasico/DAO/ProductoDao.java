package com.roberto.ejemploroombasico.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.roberto.ejemploroombasico.Model.Producto;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface ProductoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public long nuevo_producto(Producto pdto);
    @Insert
    public long[] nuevos_productos(List<Producto> lista_pdto);
    @Update
    public int actualizar_producto(Producto pdto);
    @Delete
    public int eliminar_producto(Producto pdto);
    @Delete
    public int eliminar_productos(ArrayList<Producto> lista_productos);

    //AHORA VAMOS CON LAS CONSULTAS
    @Query("Select * From Producto")
    public List<Producto> obtener_productos();
    @Query("Select * From Producto where Id= :Id_pdto")
    public Producto obtener_producto(int Id_pdto);
    @Query("Select * From Producto where Nombre= :Nom")
    public Producto obtener_productoxnombre(String Nom);


}
