/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author tommy_Burgos
 */
public class LeerCsv {
    public static LinkedList<Jugador> readFileToLinkedList(String path){
        LinkedList<Jugador> jugadores =  new LinkedList<>();
        File fichero = new File(path);
        Scanner s = null;
        System.out.println("hola");
        try {
            s = new Scanner(fichero);
            do{     
                s.nextLine();
                String linea = s.nextLine();                               
                              
                String [] data = linea.split(","); 
                System.out.println(data[2]);
                Jugador j1=new Jugador(data[0], data[1], data[2]);
                jugadores.addFirst(j1);
                System.out.println("Hola "+j1.getNombre());
                System.out.println(data[3]);
                //jugadores.addLast(new Jugador(data[0], data[1], data[2],Double.parseDouble(data[3]), Double.parseDouble(data[4]), Double.parseDouble(data[5])));
                
                //System.out.println("chao2");System.out.println(jugadores.getHead().getDato());
                
            }while (s.hasNextLine());
        } catch (Exception ex) {
                System.out.println("Mensaje: " + ex.getMessage());
        }
        return jugadores;
    }
    public static ArrayList<Jugador> readFileToArrayList(String path) {
        ArrayList<Jugador> jugadores =  new ArrayList<>();
        File fichero = new File(path);
        Scanner s = null;
        Integer registry = 0;

        try {
            s = new Scanner(fichero);
            do{
                String linea = s.nextLine(); 	

                if(registry!=0 & registry!=10449354 ){
                    String [] data = linea.split(","); 
                    jugadores.addFirst(new Jugador(data[0], data[1], data[2],Integer.parseInt(data[3]), Double.parseDouble(data[4]), Double.parseDouble(data[5])));
                }
                registry++;
            }while (s.hasNextLine());
        } catch (Exception ex) {
                System.out.println("Mensaje: " + ex.getMessage());
        } 
        return jugadores;
    }
    }
