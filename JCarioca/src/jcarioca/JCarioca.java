package jcarioca;

import barajas.Mazo;

/**
 *
 * @author prez
 */
public class JCarioca {
    private Mazo m;
    private Jugador j1;
    private Jugador j2;
    
    public JCarioca(boolean orden){
        m = new Mazo(orden);
        
        j1 = new Jugador("j1");
        j2 = new Jugador("j2");
        
        j1.setCartas(m.getCartas(12));
        j2.setCartas(m.getCartas(12));
        
        j1.imprimirCartas();
        j2.imprimirCartas();
        
        m.imprimir();
    }
    
    public static void main(String[] args) {
        JCarioca carioca = new JCarioca(Mazo.DESORDENADO);
    }
    
}
