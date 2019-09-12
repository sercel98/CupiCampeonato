/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campeonato;

import campeonato.utils.ConnectionDb;
import campeonato.views.GUIPrincipal;

/**
 *
 * @author Sergop
 */
public class Campeonato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GUIPrincipal gUIPrincipal = new GUIPrincipal();
        gUIPrincipal.setVisible(true);
        ConnectionDb.getInstance();
    }
    
}
