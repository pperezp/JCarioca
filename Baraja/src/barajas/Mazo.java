package barajas;

import java.util.LinkedList;

public class Mazo {
    private final LinkedList<Baraja> barajas;
    
    private static final byte CANTIDAD_BARAJAS = 2;
    
    public Mazo(){
        barajas = new LinkedList<>();
        
        for (int i = 0; i < Mazo.CANTIDAD_BARAJAS; i++) {
            barajas.add(new Baraja(false));
        }
    }
    
    
    public static void main(String[] args) {
        Mazo m = new Mazo();
    }

}
