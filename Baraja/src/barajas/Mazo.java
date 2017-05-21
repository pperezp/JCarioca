package barajas;

import java.util.LinkedList;
import java.util.Random;

public class Mazo {
    private final LinkedList<Baraja> barajas;
    private Random random; // usado para cuando el jugador pide cartas
    
    private static final byte CANTIDAD_BARAJAS = 2;
    public static final boolean ORDENADO = true; 
    public static final boolean DESORDENADO = false; 
    
    public Mazo(boolean ordenado){
        barajas = new LinkedList<>();
        
        for (int i = 0; i < Mazo.CANTIDAD_BARAJAS; i++) {
            barajas.add(new Baraja(ordenado));
        }
        
    }

    public LinkedList<Baraja> getBarajas() {
        return barajas;
    }
    
    /**
     * Método que entrega una cantidad de cartas determinado.
     * Las cartas de se entregan de forma aleatoria.
     * @param numeroDeCartas numero de cartas que desea
     * @return Las cartas
     */
    public LinkedList<Carta> getCartas(int numeroDeCartas){
        random = new Random();
        
        Baraja baraja;
        
        LinkedList<Carta> cartas = new LinkedList<>();
        
        for (int i = 0; i < numeroDeCartas; i++) {
            // Escojo la baraja de manera aleatoria
            baraja = getRandomBaraja();
            
            // añado la carta sacada aleatoriamente desde la baraja
            cartas.add(baraja.getCartaRandom());
        }
        
        return cartas;
    }
    
    public static void main(String[] args) {
        Mazo m = new Mazo(Mazo.DESORDENADO);
    }

    private Baraja getRandomBaraja() {
        return barajas.get(random.nextInt(CANTIDAD_BARAJAS));
    }
    
    public void imprimir(){
        for(Baraja b : barajas){
            b.imprimir();
        }
    }

}
