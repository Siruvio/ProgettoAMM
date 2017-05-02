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
public class GruppoFactory {
    private static GruppoFactory singleton = null;
    private ArrayList<Gruppo> listaGruppi = new ArrayList<Gruppo>();
    
    public GruppoFactory getInstance() {
        if(singleton == null) {
            singleton = new GruppoFactory();
        }
        
        return singleton;
    }
    
    private GruppoFactory() {
        Gruppo group1 = new Gruppo();
        
        group1.setUser(0);
        group1.setName("");
        group1.setMemberList(null);
        
        listaGruppi.add(group1);
    }
}
