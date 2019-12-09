/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FamFG
 */
public class Pila {
       
    
    
    private Nodo nodeIni;
    private Nodo nodeFin;

    public Pila() {
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

    //Agregar nodo al final de la lista
    public void add(Nodo nuevo) {
        
        if (isEmpty()) {
            nodeIni = nuevo;
            nodeFin = nuevo;
        } else {
            nodeFin.setSiguiente(nuevo);
            nodeFin = nuevo;
        }
    }

    
    public void addBegin(Nodo nuevo) {
        if (isEmpty()) {
            nodeIni = nuevo;
            nodeFin = nuevo;
        } else {
            nuevo.setSiguiente(nodeIni);
            nodeIni = nuevo;
        }
    }

        public void addAt(Nodo nuevo, int posi) throws Exception {
        if (isEmpty()) {
            nodeIni = nuevo;
            nodeFin = nuevo;
        } else {
            if ((posi < 0) || (posi >= size())) {
                throw new Exception("La posición es inválida");
            } else {
                int cont = 0;
                Nodo temp = nodeIni;
                while (cont < (posi - 1)) {
                    temp = temp.getSiguiente();
                    cont++;
                }
                nuevo.setSiguiente(temp.getSiguiente());
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

    public void deleteAt(int pos) throws Exception {
        
        if (isEmpty()) {
            throw new Exception("La lista esta vacía");
        }
        int iTama = size();
        if ((pos < 0) || (pos >= iTama)) {
            throw new Exception("La posicion es inválida");
        }

        if (iTama == 1) {
            clear();
        } else {
            if (pos == 0) {
                nodeIni = nodeIni.getSiguiente();
            } else {
                int cont = 0;
                Nodo temp = nodeIni;
                while (cont < (pos - 1)) {
                    temp = temp.getSiguiente();
                    cont++;
                }
                temp.setSiguiente(temp.getSiguiente().getSiguiente());
                if (pos == (iTama - 1)) {
                    nodeFin = temp;
                }
            }
        }
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

    
    public int find(int val) {
        Nodo temp = nodeIni;
        int c = 0, c2 = 0;
        while (temp != null) {
            c++;
            if (val == temp.getiValor()) {
                break;
            }else{
                c2++;
            }
            temp = temp.getSiguiente();
        }
        if(c == c2){
            return -1;
        }else{
            return c-1;
        }
        
    }
    
    public void push(Nodo nuevo){
        addBegin(nuevo);
    }
    
    public int peek() throws Exception{
        return getAt(0);
    }
//    
    public int pop() throws Exception{
        int iResu = getAt(0);
        deleteAt(0);
        return iResu;
    }
    
    public void agregar (Nodo nuevo){
        add(nuevo);
    }
    
    public void quitar() throws Exception{
        deleteAt(0);
    }
    
    public int leer() throws Exception{
        return getAt(0);
    }

}
