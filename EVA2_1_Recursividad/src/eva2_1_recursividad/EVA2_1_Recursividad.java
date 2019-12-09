/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_recursividad;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_1_Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int iVal;
        
        Scanner Read= new Scanner(System.in);
        System.out.println("Introduce un numero");
        iVal = Read.nextInt();
        for (int i = iVal; i >= 1; i--) {
            System.out.print(i+"->");
            
        }
        System.out.println("\n for 1");
        forFalso(iVal);
        System.out.println("\nfor2");
        forFalso2(iVal);
        
    }
    public static void forFalso(int iVal){
        System.out.print(iVal+"->");
        if(iVal>1){
         forFalso(iVal-1);   
        }
        
    }
    public static void forFalso2(int iVal){
        int x=1;
        System.out.print(x+"->");
        if(x<iVal){
            
         forFalso(x+1);   
        }
        
    }
}
