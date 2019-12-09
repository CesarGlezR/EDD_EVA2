/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_fibonacci;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_4_FIBONACCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Read= new Scanner(System.in);
        System.out.println("Introdusca la posicion que se desea");
        int iVal=Read.nextInt();
        System.out.println(fibonacci(iVal));
    }
    public static int fibonacci(int iPos){
        

        if(iPos==0){
            return 0;
        }else if(iPos==1){
            return 1;
                    
        }else{
            return fibonacci(iPos-1)+fibonacci(iPos-2);
        }
    }
    
}
