package com.roberto.ejemploroombasico.Model;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(indices = {@Index(name = "loginunico",value ={ "Login"},unique = true)})
public class Usuario {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String Login;
    private String Password;
    private String email;

    public Usuario(String Login, String Password, String email) {
        this.Login = Login;
        this.Password = Password;
        this.email = email;
    }


    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
