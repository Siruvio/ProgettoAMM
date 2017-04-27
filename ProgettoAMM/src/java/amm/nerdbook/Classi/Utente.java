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
    
    /**
    * @return the id
    */
    public int getID() {
        return this.id;
    }
    /**
     * @param id the id to set
     */
    public void setID(int id) {
        this.id = id;
    }
    
    /**
    * @return the name
    */
    public String getName() {
        return this.name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
    * @return the surname
    */
    public String getSurname() {
        return this.surname;
    }
    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    /**
    * @return the user's photo url, as string
    */
    public String getFoto() {
        return this.urlFoto;
    }/**
     * @param photo the photo url to set
     */
    public void setFoto(String photo) {
        this.urlFoto = photo;
    }
    
    /**
    * @return the presentation text
    */
    public String getFrase() {
        return this.frasePres;
    }/**
     * @param frase the presentation text to set
     */
    public void setFrase(String frase) {
        this.frasePres = frase;
    }
    
    /**
    * @return the born date, as string
    */
    public String getData() {
        return this.dataNascita;
    }
    /**
     * @param data the born date to set
     */
    public void setData(String data) {
        this.dataNascita = data;
    }
    
    /**
    * @return the password
    */
    public String getPassword() {
        return this.password;
    }
    /**
     * @param pw the password to set
     */
    public void setPassword(String pw) {
        this.password = pw;
    }
}
