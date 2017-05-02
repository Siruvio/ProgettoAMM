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

public class Gruppo {
    private int id;
    private String name;
    private ArrayList<Utente> membri = null;
    
    public Gruppo() {
        this.id = 0;
        this.name = "";
        this.membri = new ArrayList<Utente>();
    }
    
    public int getId() {
        return this.id;
    }

    public void setUser(int num) {
        this.id = num;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String nome) {
        this.name = nome;
    }
    
    public void setMemberList(ArrayList<Utente> newList) {
        for(Utente member : newList) {
            this.membri.add(member);
        }
    }
    
    public ArrayList<Utente> getMembersList() {
        return this.membri;
    }
    
    public void addMember(Utente usr) {
        this.membri.add(usr);
    }
}
