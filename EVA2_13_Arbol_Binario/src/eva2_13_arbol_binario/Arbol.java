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
public class Arbol {
    private Nodo root;

    public Arbol() {
        this.root = null;
    }
    
    public void agregarNodo(Nodo nuevo){
        agregarNodoRec(root, nuevo);
    }
    
    private void agregarNodoRec(Nodo actual, Nodo nuevo){
        if(root==null){
            root= nuevo;
        }else{
            if(nuevo.getNum()>actual.getNum()){//Es mayor-->Derecha
                if(actual.getDer()==null){//Vacio, hay espacio
                    actual.setDer(nuevo);
                }else{//ya hay un nodo
                    agregarNodoRec(actual.getDer(), nuevo);
                }
            }else if(nuevo.getNum()<actual.getNum()){//Menor-->izq
                if(actual.getIzq()==null){//Vacio, hay espacio
                    actual.setIzq(nuevo);
                }else{//ya hay un nodo
                    agregarNodoRec(actual.getIzq(), nuevo);
                }
            }else{//El val es invalido
                System.out.println("Ya existe el valor");
            }
        }
    }
    
    public void imprimePostOrder(){
        postOrder(root);
    }
    
    private void postOrder(Nodo actual){
        if(actual!= null){
        //Leer izq
        postOrder(actual.getIzq());
        //Leer Der
        postOrder(actual.getDer());
        //imprimir
        System.out.print(actual.getNum()+"-");
        }
    }
    public void imprimePreOrder(){
        pretOrder(root);
    }
    private void pretOrder(Nodo actual){
        if(actual!= null){
            //imprimir
            System.out.print(actual.getNum()+"-");        
            //Leer izq
            pretOrder(actual.getIzq());
            //Leer Der
            pretOrder(actual.getDer());
        
        }
    }
    public void imprimeinOrder(){
       inOrder(root);
    }
    private void inOrder(Nodo actual){
        if(actual!= null){
            
            //Leer izq
            inOrder(actual.getIzq());
            //imprimir
            System.out.print(actual.getNum()+"-");        
            //Leer Der
            inOrder(actual.getDer());
        
        }
    }
    
}
