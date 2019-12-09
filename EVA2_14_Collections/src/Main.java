
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> miListaEnla= new LinkedList();
        miListaEnla.add("Hola");
        miListaEnla.add("");
        miListaEnla.add("Mundo");
        miListaEnla.add("");
        miListaEnla.add("cruel");
        miListaEnla.add("!!1");
        miListaEnla.addFirst("xxxxx");
        
        //System.out.println(miListaEnla);
        for (String string : miListaEnla) {
            System.out.print(string+" - ");
        }
        System.out.println("");
        System.out.println("Elementos en total"+miListaEnla.size());
        miListaEnla.remove(3);
        System.out.println(miListaEnla);
    }
    
}