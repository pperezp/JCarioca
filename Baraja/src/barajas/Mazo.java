package barajas;

import java.util.LinkedList;

public class Mazo {
    private final LinkedList<Baraja> barajas;
    
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
    
    public static void main(String[] args) {
        Mazo m = new Mazo(Mazo.DESORDENADO);
    }

}
