/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcarioca;

import barajas.Carta;
import java.util.LinkedList;

/**
 *
 * @author prez
 */
public class Jugador {
    private String nombre;
    private LinkedList<Carta> cartas;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.cartas = new LinkedList<>();
    }

    public void setCartas(LinkedList<Carta> cartas) {
        this.cartas = cartas;
    }
    
    public void imprimirCartas(){
        System.out.println("===================================");
        System.out.println("Cartas de ["+nombre+"]");
        System.out.println("===================================");
        for(Carta c : cartas){
            System.out.println(c);
        }
        System.out.println("===================================");
    }
}
