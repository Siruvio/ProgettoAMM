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
public class UtenteFactory {
    private static UtenteFactory singleton = null;
    private ArrayList<Utente> listaUtenti = new ArrayList<Utente>();
    
    public static UtenteFactory getInstance() {
        if(singleton == null) {
            singleton = new UtenteFactory();
        }
        
        return singleton;
    }
    
    private UtenteFactory() {
        Utente user1 = new Utente();
        user1.setId(0);
        user1.setName("");
        user1.setSurname("");
        user1.setFoto("");
        user1.setFrase("");
        user1.setData("");
        user1.setPassword("");
        
        //...
        
        listaUtenti.add(user1);
    }
    
    public Utente getUtenteById(int num) {
        for(Utente user : listaUtenti) {
            if(user.getId() == num) {
                return user;
            }
        }
        
        return null;
    }
    
    public int getIdByNameSurAndPass(String nome, String cognome, String pass) {
        for(Utente user : listaUtenti) {
            if(user.getName().equals(nome) && user.getSurname().equals(cognome) && user.getPassword().equals(pass)) {
                return user.getId();
            }
        }
        
        return -1;
    }
}
