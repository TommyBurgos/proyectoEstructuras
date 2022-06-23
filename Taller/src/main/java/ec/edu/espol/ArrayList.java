/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol;

/**
 *
 * @author tommy_Burgos
 */
public class ArrayList<E> {
    
    private E[] arreglo;
    private int capacidad;
    private int tam;
    
    public ArrayList(){
        capacidad = 10;
        arreglo =  (E[]) new Object[capacidad];
        tam = 0;
    }
    
    public ArrayList(int capacidad){
        this.capacidad = capacidad;
        arreglo =  (E[]) new Object[capacidad];
        tam = 0;
    }
    
    
    
    public boolean addFirst(E e) {
        // si e viene vacio
        if (e==null){
            return false;
        }
        
        // la lista estaba vacia
        if (tam == 0){
            arreglo[0] = e;
            tam = 1;
            return true;
        }
        
        // si el arreglo ya está lleno o a capacidad
        if (tam == capacidad){
            crecerArreglo();
        }
        
        // la insercion debe desplazar elementos
        for (int i=tam-1; i>0; i--){
            arreglo[i+1] = arreglo[i];
        }
        arreglo[0] = e;
        tam++;
        return true;
    }

    private void crecerArreglo(){
        capacidad = capacidad*2;
        E[] arreglo2 =  (E[]) new Object[capacidad];
        for (int i=0; i<tam; i++){
            arreglo2[i] = arreglo[i];
        }
        arreglo = arreglo2;
    }
    
    public boolean addLast(E e) {
          if (tam == 0){
            arreglo[0] = e;
            tam = 1;
            return true;
        }
        if (tam==capacidad){
            this.crecerArreglo();
            arreglo[tam]=e;
            return true;
        }
        arreglo[tam-1]= e;
        return true;
        
    }

    
    public E getFirst() {
        if(tam==0)
            return null;
        return arreglo[0];
    }

    
    public E getLast() {
        if(tam==0)
            return null;
        return arreglo[tam-1];
    }

    public int indexOf(E e) {
        
        for(int i=0; i<tam; i++){
            if(arreglo[i]== e)
                return i;
        }
        return -1;
        
    }

    
    public int size() {
        return capacidad;
    }

    public boolean removeLast() {
      if(capacidad==0)
          return false;
      
        arreglo[tam-1]=null;
            return true;
      
    }

    public boolean removeFirst() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean insert(int index, E e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean set(int index, E e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public E get(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean contains(E e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
