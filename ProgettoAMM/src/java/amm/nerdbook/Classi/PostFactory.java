/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook.Classi;

import java.util.ArrayList;

/**
 * @author Siruvio
 */
public class PostFactory {
    private static PostFactory singleton = null;
    private ArrayList<Post> listaPost = new ArrayList<Post>();
    
    public static PostFactory getInstance() {
        if(singleton == null) {
            singleton = new PostFactory();
        }
        
        return singleton;
    }
    
    private PostFactory() {
        Post post1 = new Post();
        
        post1.setId(0);
        post1.setUser(0);
        post1.setContent("");
        post1.setFoto("");
        
        listaPost.add(post1);
    }
    
    public Post getPostById (int num) {
        for(Post pst : listaPost) {
            if(pst.getId() == num){
                return pst;
            }
        }
    
        return null;
    }
    
    public ArrayList<Post> getPostListByUserId (Utente user) {
        ArrayList<Post> listaRitorno = new ArrayList<Post>();

        for(Post pst : listaPost) {
            if(pst.getUser() == user.getId()) {
                listaRitorno.add(pst);
            }
        }
    
        return listaRitorno;
    }
}
