/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_mcd;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_3_MCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Read= new Scanner(System.in);
        System.out.println("Introdusca el primer num");
        int iVal= Read.nextInt();
        System.out.println("Introdusca el segundo num"); 
       int iVal2= Read.nextInt();
        System.out.println("MCD="+mcd(iVal,iVal2));
        
    }
    public static int mcd(int dividendo, int divisor){
        System.out.println(dividendo+"/"+divisor);
        if(divisor==0){
            return dividendo;
        }else{
            int iResi = dividendo % divisor;
            return mcd(divisor,iResi);
        }
       
    }

}
