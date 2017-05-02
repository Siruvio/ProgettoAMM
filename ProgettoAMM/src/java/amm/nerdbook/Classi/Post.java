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
    private int user;
    private String contenuto;
    private String urlFotoPost;
    
    public Post() {
        this.id = 0;
        this.user = 0;
        this.contenuto = "";
        this.urlFotoPost = "";
    }
    
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getUser() {
        return this.user;
    }

    public void setUser(int num) {
        this.user = num;
    }
    
    public String getContent() {
        return this.contenuto;
    }

    public void setContent(String content) {
        this.contenuto = content;
    }
    
    public String getFoto() {
        return this.urlFotoPost;
    }
    
    public void setFoto(String url) {
        this.urlFotoPost = url;
    }
}
