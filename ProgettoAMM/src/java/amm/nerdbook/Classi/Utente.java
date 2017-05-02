/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook.Classi;

/**
 * @author Siruvio
 */
public class Utente {
    private int id;
    private String name;
    private String surname;
    private String urlFoto;
    private String frasePres;
    private String dataNascita;
    private String password;
    
    public Utente() {
        this.id = 0;
        this.name = "";
        this.surname = "";
        this.urlFoto = "";
        this.frasePres = "";
        this.dataNascita = "";
        this.password = "";
    }
    
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public String getFoto() {
        return this.urlFoto;
    }
    
    public void setFoto(String photo) {
        this.urlFoto = photo;
    }
    
    public String getFrase() {
        return this.frasePres;
    }
    
    public void setFrase(String frase) {
        this.frasePres = frase;
    }
    
    public String getData() {
        return this.dataNascita;
    }
    
    public void setData(String data) {
        this.dataNascita = data;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String pw) {
        this.password = pw;
    }
}
