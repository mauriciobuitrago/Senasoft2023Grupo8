package com.co.sena.models;

public class DataLogin {
    /* se crean las variables para guardar los datos que se van a ingresar y se le crean el set y get
     * para solicitarlos cuando los necesita*/
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
