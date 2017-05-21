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

    public Jugador setCartas(LinkedList<Carta> cartas) {
        this.cartas = cartas;
        return this;
    }

    public LinkedList<Carta> getCartas() {
        return cartas;
    }
    
    public Carta getCarta(int indice){
        return cartas.get(indice);
    }
    
    public void remover(Carta carta){
        cartas.remove(carta);
    }
    
    public Jugador imprimirCartas(){
        System.out.println("===================================");
        System.out.println("Cartas de ["+nombre+"]");
        System.out.println("===================================");
        int i = 0;
        for(Carta c : cartas){
            System.out.println("["+(i++)+"] "+c);
        }
        System.out.println("===================================");
        return this;
    }
}
