package barajas;

public class Carta {
    private int rango;
    private Palo palo;

    public Carta(int numero, Palo palo) {
        this.rango = numero;
        this.palo = palo;
    }

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "rango=" + rango + ", palo=" + palo + '}';
    }
    
    
}
