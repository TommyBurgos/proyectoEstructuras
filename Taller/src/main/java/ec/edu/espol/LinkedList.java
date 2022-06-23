/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Tommy Burgos
 */
public class LinkedList<E>{
    private Node head;
    private Node tail;

    public LinkedList() {
        head=null;
        tail=null;
    }
    public void addFirst(E dato){
        head=new Node(dato, head);
        if(tail==null) tail=head;
    }
    public void verLista(){
        Node<E> rec=head;
        while(rec!=null){
            System.out.println("["+rec.dato+"]");
            rec=rec.next;
        }
    }
    public void addLast(E dato){
        Node nuevo=new Node(dato);
        if(!isEmpty()){            
            tail.next=nuevo;
            tail=nuevo;
        }else{
            head=tail=nuevo;
        }
        
    }
    public boolean insert(E e, int index){
        Node<E> n=new Node(e);
        if(index<0 || index>size()) return false;
        if(e==null) return false;
        Node<E> tmp=head;
        for (int i = 0; i < index-1; i++) {
            tmp=tmp.next;
        }
        if(tmp==head){
            n.next=head;
            head=n;
        }else if(tmp==tail){
            n.next=null;
            tmp.next=n;
        }else{
            n.next=tmp.next;
            tmp.next=n;
        }
        return true;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }
    
    public int size() {
        int c=0;
        Node<E> first=head;
        if(head==null)  return c;
        if(head==tail)  return c=1;
        
        while(first.next!=null){
            first=first.next;
            c++;
        }return c;
    }

    public boolean isEmpty() {
        return head==null;
    }
    
    public boolean remove(int index){
        Node<E> n= head;
        
        for (int i = 0; i < size(); i++) {
            n=n.next;
            if(i==index){
                n=n.next.next;
            }
        }
        
        return true;
    }
    //Remover Pares
    public void removerPares(){
        int c=2;
        Node n=head;
        for (int i = 0; i < size(); i++) {
            if(c%2==0){
                remove(i);
            }
            n=n.next;
            c++;    
        }
    }
    
    
    
    public class Node<E>{
        private E dato;
        private Node next;

        public Node(E dato) {
            this.dato = dato;
            this.next=null;
        }

        public Node(E dato, Node next) {
            this.dato = dato;
            this.next = next;
        }

        public E getDato() {
            return dato;
        }

        public Node getNext() {
            return next;
        }

        public void setDato(E dato) {
            this.dato = dato;
        }

        public void setNext(Node next) {
            this.next = next;
        }
        
        
    }
}