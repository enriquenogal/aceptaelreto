package level30;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio609b {

    class Torre {
        private int i;
        private int j;
        public Torre(int i, int j) {
            this.i = i;
            this.j = j;
        }
        public int getI() {
            return i;
        }
        public int getJ() {
            return j;
        }
    }

    public static void main(String[] args) {
        new Ejercicio609b().run();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int dimensionTablero, nTorres;
        ArrayList<Torre> torres;
        Torre posicionEncuentro;
        while (sc.hasNextLine()) {
            dimensionTablero = sc.nextInt();
            nTorres = sc.nextInt();
            sc.nextLine();
            torres = new ArrayList<Torre>();
            for (int i = 0; i < nTorres; i++) {
                torres.add(new Torre(sc.nextInt() - 1, sc.nextInt() - 1));
                sc.nextLine();
            }
            posicionEncuentro = calculaPosicionMinimo(torres, nTorres, dimensionTablero);
            System.out.println((posicionEncuentro.getI() + 1) + " " + (posicionEncuentro.getJ() + 1));
        }
    }

    public Torre calculaPosicionMinimo(ArrayList<Torre> torres, int nTorres, int dimensionTablero) {
        int caminoActual, iMinimo = 0, jMinimo = 0, caminoMinimo;
        //calculo i minimo
        caminoMinimo = Integer.MAX_VALUE;
        for (int i = 0; i < dimensionTablero; i++) {
            caminoActual = 0;
            for (Torre torre : torres) {                
                caminoActual = caminoActual + + Math.abs(i - torre.getI());
                if (caminoActual >= caminoMinimo) break;
            }
            if (caminoActual < caminoMinimo) {
                caminoMinimo = caminoActual;
                iMinimo = i;
            }
        }
        //calculo j minimo
        caminoMinimo = Integer.MAX_VALUE;
        for (int j = 0; j < dimensionTablero; j++) {
            caminoActual = 0;
            for (Torre torre : torres) {                
                caminoActual = caminoActual + + Math.abs(j - torre.getJ());
                if (caminoActual >= caminoMinimo) break;
            }
            if (caminoActual < caminoMinimo) {
                caminoMinimo = caminoActual;
                jMinimo = j;
            }
        }
        return new Torre(iMinimo, jMinimo);
    }

}
