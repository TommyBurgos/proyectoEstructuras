/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol;

/**
 *
 * @author tommy_Burgos
 */
public class Jugador {
    private String nombre;
    private String equipo;
    private String posicion;
    private int altura;
    private Double peso;
    private Double edad;

    public Jugador(String nombre, String equipo, String posicion, int altura, Double peso, Double edad) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.posicion = posicion;
        this.altura = altura;
        this.peso = peso;
        this.edad = edad;
    }

    public Jugador(String nombre, String equipo, String posicion) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.posicion = posicion;
    }

    public Jugador(String nombre, String equipo, String posicion, int altura) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.posicion = posicion;
        this.altura = altura;
    }
    

    public String getNombre() {
        return nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getAltura() {
        return altura;
    }

    public Double getPeso() {
        return peso;
    }

    public Double getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setEdad(Double edad) {
        this.edad = edad;
    }
    
    
}
