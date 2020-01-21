/*
package com.roberto.ejemploroombasico.Model;


import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.text.DateFormat;
import java.util.Date;

@Entity(primaryKeys = {"Id_user","Id_producto"},
        foreignKeys ={ @ForeignKey(entity = Usuario.class,parentColumns = {"id"},childColumns = {"Id_user"},onDelete = ForeignKey.CASCADE,onUpdate = ForeignKey.CASCADE),
        @ForeignKey(entity = Producto.class,parentColumns = {"Id"},childColumns = {"Id_producto"},onDelete = ForeignKey.CASCADE,onUpdate = ForeignKey.CASCADE)})
public class PostNormalizada {
    private int Id_user;
    private int Id_producto;

    public PostNormalizada(int id_user, int id_producto, String comentario, Date fecha) {
        Id_user = id_user;
        Id_producto = id_producto;
        this.comentario = comentario;
        this.fecha = fecha;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    private String comentario;
    private Date fecha;

    public int getId_user() {
        return Id_user;
    }

    public void setId_user(int id_user) {
        Id_user = id_user;
    }

    public int getId_producto() {
        return Id_producto;
    }

    public void setId_producto(int id_producto) {
        Id_producto = id_producto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
 */