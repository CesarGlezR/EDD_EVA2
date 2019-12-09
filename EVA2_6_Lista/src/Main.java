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
        Nodo obj1= new Nodo();
        obj1.iVal=100;
        obj1.siguiente=new Nodo();
        obj1.siguiente.iVal=200;
        obj1.siguiente.siguiente=new Nodo();
        obj1.siguiente.siguiente.iVal=300;
        System.out.println(obj1.iVal);
        System.out.println(obj1.siguiente.iVal);
        System.out.println(obj1.siguiente.siguiente.iVal);
    }
    
}
//Nodos
class Nodo{
    //Dato a almacenar
    int iVal;
    Nodo siguiente;
}
