/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_9_listas_dobles;

/**
 *
 * @author FamFG
 */
public class Lista {
    private Nodo nodeIni;
    private Nodo nodeFin;

    public Lista() {
        this.nodeIni = null;
        this.nodeFin = null;
    }
    public boolean isEmpty() { 
        if (nodeIni == null) {
            return true;
        } else {
            return false;
        }
    }
   
    public void add(Nodo nuevo){
        
        if(isEmpty()){
            nodeIni = nuevo;
            nodeFin = nuevo;
        }else{
            nodeFin.setSiguiente(nuevo);//HACIA ADELANTE
            nuevo.setPrevio(nodeFin);//HACIA ATRAS
            nodeFin = nuevo;
        }
    }
    
    public void addBegin(Nodo nuevo){
        if (isEmpty()) {
            nodeIni = nuevo;
            nodeFin = nuevo;
        } else {
            nuevo.setSiguiente(nodeIni);
            nodeIni.setPrevio(nuevo);
            nodeIni = nuevo;
        }
    }
    
    
    public void addAt(Nodo nuevo, int posi) throws Exception{
        if (isEmpty()) {
            nodeIni = nuevo;
            nodeFin = nuevo;
        } else {
            if ((posi < 0) || (posi >= size())) {
                throw new Exception("La posición es inválida");
            } else {
                int cont = 0;
                Nodo temp = nodeIni;
                while (cont < (posi-1)) {
                    temp = temp.getSiguiente();
                    cont++;
                }
                nuevo.setSiguiente(temp.getSiguiente());
                nuevo.setPrevio(temp);
                nuevo.getSiguiente().setPrevio(nuevo);
                temp.setSiguiente(nuevo);
                
            }
        }
    }
    
    public void print() {
        Nodo temp = nodeIni;
        while (temp != null) {
            System.out.print(temp.getiValor() + " - ");
            temp = temp.getSiguiente();
        }
        System.out.println("");
    }
    
    public void printBack() {
        Nodo temp = nodeFin;
        while (temp != null) {
            System.out.print(temp.getiValor() + " - ");
            temp = temp.getPrevio();
        }
        System.out.println("");
    }
    
    public int size() {
        int cont = 0;
        Nodo temp = nodeIni;
        while (temp != null) {
            cont++;
            temp = temp.getSiguiente();
        }
        return cont;
    }
 
    public void clear() {
        nodeFin = null;
        nodeIni = null;
    }
    
    
    public int getAt(int pos) throws Exception { 
        if (isEmpty()) {
            throw new Exception("La lista esta vacía");
        }
        int iTama = size();
        if ((pos < 0) || (pos >= iTama)) {
            throw new Exception("La posicion es inválida");
        }

        int cont = 0;
        Nodo temp = nodeIni;
        while (cont < pos) {
            temp = temp.getSiguiente();
            cont++;
        }
        return temp.getiValor();
    }
}
