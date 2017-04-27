/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook.Classi;

/**
 * @author Siruvio
 */

public class Post {
    private int id;
    private Utente user;
    private String contenuto;
    private String urlFotoPost;
    
    public Post() {
        this.id = 0;
        this.user = null;
        this.contenuto = "";
        this.urlFotoPost = "";
    }
    
    /**
    * @return the id
    */
    public int getId() {
        return this.id;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
    * @return the user
    */
    public Utente getUser() {
        return this.user;
    }
    /**
     * @param usr the user to set
     */
    public void setUser(Utente usr) {
        this.user = usr;
    }
    
    /**
    * @return the content
    */
    public String getContent() {
        return this.contenuto;
    }
    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.contenuto = content;
    }
    
    /**
    * @return the photo
    */
    public String getFoto() {
        return this.urlFotoPost;
    }
    /**
     * @param url the photo to set
     */
    public void setFoto(String url) {
        this.urlFotoPost = url;
    }
}
