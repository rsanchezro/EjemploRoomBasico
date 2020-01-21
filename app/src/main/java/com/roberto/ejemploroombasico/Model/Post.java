package com.roberto.ejemploroombasico.Model;


import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(foreignKeys ={ @ForeignKey(entity = Usuario.class,parentColumns = {"id"},childColumns = {"Id_user"},onDelete = ForeignKey.CASCADE,onUpdate = ForeignKey.CASCADE),
@ForeignKey(entity = Producto.class,parentColumns = {"Id"},childColumns = {"Id_producto"},onDelete = ForeignKey.CASCADE,onUpdate = ForeignKey.CASCADE)})
public class Post {
    @PrimaryKey(autoGenerate = true)
    private int Id;
    private Date fecha;
    private int Id_user;
    private int Id_producto;
    private String comentario;

    public Post(Date fecha, int Id_user, int Id_producto, String comentario) {

        this.fecha = fecha;
        this.Id_user = Id_user;
        this.Id_producto = Id_producto;
        this.comentario = comentario;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

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

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}

