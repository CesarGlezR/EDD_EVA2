/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_13_arbol_binario;

/**
 *
 * @author invitado
 */
public class EVA2_13_Arbol_Binario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arbol miArbol= new Arbol();
        miArbol.agregarNodo(new Nodo(13));
        miArbol.agregarNodo(new Nodo(10));
        miArbol.agregarNodo(new Nodo(18));
        miArbol.agregarNodo(new Nodo(2));
        miArbol.agregarNodo(new Nodo(11));
        miArbol.agregarNodo(new Nodo(17));
        miArbol.agregarNodo(new Nodo(20));
        //miArbol.agregarNodo(new Nodo(16));
        //miArbol.imprimePostOrder();
        //miArbol.imprimePreOrder();
        miArbol.imprimeinOrder();
    }
    
}
