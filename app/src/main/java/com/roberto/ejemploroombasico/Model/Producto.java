package com.roberto.ejemploroombasico.Model;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(indices = {@Index(name = "pdtounico",value = {"Nombre"},unique = true)})
public class Producto {
    @PrimaryKey(autoGenerate = true)
    private int Id;
    private String Nombre;
    private String Tipo;
    private String Descripcion;

    public Producto(String Nombre, String Tipo, String Descripcion) {

        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Descripcion = Descripcion;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
