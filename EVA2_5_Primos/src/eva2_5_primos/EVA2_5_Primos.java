/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_primos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_5_Primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Read = new Scanner(System.in);
        System.out.println("Introdusca un numero");
        int iVal = Read.nextInt();
        if(esPrimoIneficiente(iVal)){
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }
    }
    public static boolean esPrimoIneficiente(int iVal){
        boolean bResu= true;
        for (int i = 2; i < iVal-1; i++) {
            if((iVal % i)==0){
                bResu= false;
                break;
            }
        }
        return bResu;
    }
    
}
