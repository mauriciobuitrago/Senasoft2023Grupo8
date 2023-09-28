package com.co.sena.models;

public class DataErrorGmail {
    /* se crean las variables para guardar los datos que se van a ingresar y se le crean el set y get
     * para solicitarlos cuando los necesita*/
    private String gmailIncompleto;

    // Getter para obtener el valor de "gmailIncompleto"
    public String getGmailIncompleto() {
        return gmailIncompleto;
    }

    public void setGmailIncompleto(String gmailIncompleto) {
        this.gmailIncompleto = gmailIncompleto;
    }
}
