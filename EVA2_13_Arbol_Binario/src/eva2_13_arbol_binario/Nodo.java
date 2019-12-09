package eva2_13_arbol_binario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Nodo {
    private int num;
    private Nodo izq;
    private Nodo der;

    public Nodo(){
        this.izq = null;
        this.der = null;
    }
    public Nodo(int val){
        this.num = val;
        this.izq = null;
        this.der = null;
    }
    
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public Nodo getDer() {
        return izq;
    }
    public void setDer(Nodo next) {
        this.izq = next;
    }
    public Nodo getIzq(){
        return der;
    }  
    public void setIzq(Nodo prev){
        this.der = prev;
    }
}
