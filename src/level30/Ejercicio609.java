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
public class Ejercicio609 {

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
        new Ejercicio609().run();
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
        int caminoActual, iMinimo = 0, jMinimo = 0, caminoMinimo = Integer.MAX_VALUE;
        //calculo los caminos y miro cual es el mínimo
        for (int i = 0; i < dimensionTablero; i++) {
            for (int j = 0; j < dimensionTablero; j++) {
                caminoActual = calculaSumaCaminos(i, j, torres, caminoMinimo);
                //System.out.println("casilla -> i: " + i + " j: " + j + " :: camino: " + caminoActual + " :: caminoMinimo: " + caminoMinimo);
                if (caminoActual < caminoMinimo) {
                    caminoMinimo = caminoActual;
                    iMinimo = i;
                    jMinimo = j;
                }
                if (caminoMinimo == 0) return new Torre(iMinimo, jMinimo);
                else if (nTorres == 2 && caminoMinimo == 1) return new Torre(iMinimo, jMinimo);
                else if (nTorres > 2 && nTorres <= 9 && caminoMinimo == nTorres - 1) return new Torre(iMinimo, jMinimo);
                // hay que encontrar la regla para números de torres superior a 9
            }
        }
        return new Torre(iMinimo, jMinimo);
    }

    public int calculaSumaCaminos(int i, int j, ArrayList<Torre> torres, int caminoMinimo) {
        int resultado = 0;
        for (Torre torre : torres) {
            resultado = resultado
                    + Math.abs(j - torre.getJ())
                    + Math.abs(i - torre.getI());
            if (resultado >= caminoMinimo) {
                break;
            }
        }
        return resultado;
    }

}
