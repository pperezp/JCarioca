package jcarioca;

import barajas.Carta;
import barajas.Mazo;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author prez
 */
public class JCarioca {

    private Mazo mazo;
    private LinkedList<Jugador> jugadores;
    private LinkedList<Carta> montoncito; // son las cartas que se dejan cuando un jugador juega

    public JCarioca(boolean orden, int cantJugadores) {
        mazo = new Mazo(orden);
        jugadores = new LinkedList<>();
        montoncito = new LinkedList<>();

        for (int i = 0; i < cantJugadores; i++) {
            jugadores.add(
                    new Jugador("j" + i)
                            .setCartas(mazo.getCartas(12))
            //                    .imprimirCartas()
            );
        }

//        mazo.imprimir();
    }

    public Jugador getJugador(int indice) {
        return jugadores.get(indice);
    }

    public LinkedList<Carta> getCartas(int indiceJugador) {
        return jugadores.get(indiceJugador).getCartas();
    }

    public void jugar(int indiceJugador, int idCarta) {
        Jugador jugador = jugadores.get(indiceJugador);
        Carta carta = jugador.getCarta(idCarta);
        jugador.remover(carta);
        montoncito.add(carta);

        imprimirMontoncito();
    }

    public LinkedList<Carta> getMontoncito() {
        return montoncito;
    }

    private void imprimirMontoncito() {
        System.out.println("=======================");
        System.out.println("Montoncito:");
        System.out.println("=======================");
        for (Carta c : montoncito) {
            System.out.println(c);
        }
        System.out.println("=======================");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        JCarioca carioca = new JCarioca(Mazo.DESORDENADO, 1);

        int indice;
        while (true) {
            carioca.getJugador(0).imprimirCartas();
            System.out.print("ID CARTA: ");
            indice = scan.nextInt();

            carioca.jugar(0, indice);
        }
//        carioca.getJugador(0).imprimirCartas();
//        carioca.getJugador(1).imprimirCartas();

    }

}
