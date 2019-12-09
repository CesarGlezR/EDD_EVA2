
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista miLista=new Lista();
        miLista.add(new Nodo(4));
        miLista.add(new Nodo(15));
        miLista.add(new Nodo(225));
        miLista.add(new Nodo(16));
        miLista.add(new Nodo(46));
        miLista.addBegin(new Nodo(9999));
        boolean vacia = miLista.isEmpty();
        if(vacia) 
            System.out.println("Lista vacia");
        else 
            System.out.println("Lista con nodos");
        miLista.print();
        try {
            miLista.insertAt(3, new Nodo(666666));
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        miLista.print();
        try {
            miLista.deleteAt(0);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        miLista.print();
        miLista.add(new Nodo(200));
        miLista.print();
        try {
            miLista.deleteAt(6);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        miLista.print();
        miLista.add(new Nodo(300));
        miLista.print();
        try {
            System.out.println("El valor de la pos 3 es "+ miLista.getAt(3));
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    
    
}
