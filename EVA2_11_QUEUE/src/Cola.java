/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FamFG
 */
public class Cola {
    
    
    private Nodo nodeIni;
    private Nodo nodeFin;
    
    public Cola(){
        this.nodeIni = null;
        this.nodeFin = null;
    }
    
    public boolean isEmpty(){ 
        if(nodeIni == null)
            return true;
        else
            return false;
    }
    
    
    public void add(Nodo nuevo){
        if(isEmpty()){
           nodeIni = nuevo;
           nodeFin = nuevo;
        }else{
           nodeFin.setNext(nuevo);
           nodeFin = nuevo;
        }
    }
    public void addBegin(Nodo nuevo){
        if(isEmpty()){
           nodeIni = nuevo;
           nodeFin = nuevo;
        }else{
           nuevo.setNext(nodeIni);
           nodeIni = nuevo;
        }
    }
    public void addAt(Nodo nuevo, int posi) throws Exception{
        if(isEmpty()){
            nodeIni = nuevo;
            nodeFin = nuevo;
        }else{
            if((posi < 0) || (posi >= size()))
                throw new Exception("La posición es inválida");
            else{
                int cont = 0;
                Nodo temp = nodeIni;
                while(cont < (posi-1)){
                    temp = temp.getNext();
                    cont++;
            }
            nuevo.setNext(temp.getNext());
            temp.setNext(nuevo);
        }
        }
    }
    
    public void print(){
        Nodo temp = nodeIni;
        while(temp != null){
            System.out.print(temp.getNum()+" - ");
            temp = temp.getNext();
        }
        System.out.println("");
    }

    
    public int size(){
        int cont = 0;
        Nodo temp = nodeIni;
        while(temp != null){
            cont++;
            temp = temp.getNext();
        }
        return cont;
    }
    
    
    public void emptyList(){
        nodeFin = null;
        nodeIni = null;
    }
    public void eraseAt(int posi) throws Exception{
        if(isEmpty())
            throw new Exception("La lista está vacía");
        if((posi < 0) || (posi >= size()))
            throw new Exception("La posición es inválida");
        
        if(size() == 1){
            emptyList();
        }else{ 
            if(posi == 0){
                nodeIni = nodeIni.getNext();
            }else{
                Nodo temp = nodeIni;
                int cont = 0;
                while(cont < posi-1){
                    temp = temp.getNext();
                    cont++;
                }
                temp.setNext(temp.getNext().getNext());
                if(posi == (size()-1))
                    nodeFin = temp;
            }
        }
            
    }
    
    public int getAt(int posi){
        Nodo temp = nodeIni;
        int cont = 0;
        while(cont < posi){
            temp = temp.getNext();
            cont++;
        }
        return temp.getNum();
    }

    
    
    
    public void agregar(Nodo nuevo){
        add(nuevo);
    }
    
    
    public int quitar() throws Exception{
        int iRes = getAt(0);
        eraseAt(0);
        return iRes;
    }
    
    
    public int leer(){
        return getAt(0);
    }
}
