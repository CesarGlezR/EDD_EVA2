/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_9_listas_dobles;

import static eva2_9_listas_dobles.EVA2_9_listas_dobles.main;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FamFG
 */
public class EVA2_9_listas_dobles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Lista miLista = new Lista();
           
            miLista.add(new Nodo(100));
            miLista.add(new Nodo(200));
            miLista.add(new Nodo(300));
            miLista.add(new Nodo(400));
            miLista.print();
            miLista.printBack();
            miLista.addBegin(new Nodo(50));
            miLista.print();
            miLista.printBack();
            miLista.addBegin(new Nodo(25));
            miLista.print();
            miLista.printBack();
        try {
            miLista.addAt(new Nodo(20),4);
        } catch (Exception ex) {
            Logger.getLogger(EVA2_9_listas_dobles.class.getName()).log(Level.SEVERE, null, ex);
        }
            miLista.print();
            miLista.printBack();
        
    
    }
    
}
    
