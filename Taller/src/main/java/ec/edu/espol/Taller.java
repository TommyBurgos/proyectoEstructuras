/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ec.edu.espol;



/**
 *
 * @author tommy_Burgos
 */
public class Taller {

    public static void main(String[] args) {
        LeerCsv l1=new LeerCsv();
        LinkedList lk1= LeerCsv.readFileToLinkedList("jugadores.csv");
        LeerCsv.readFileToArrayList("jugadores.csv");
        System.out.println(lk1.getHead().getDato().getClass());
        System.out.println("----------------");
        System.out.println(lk1.size());
        lk1.verLista();
        
        
    }
}
