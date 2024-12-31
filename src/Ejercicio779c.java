//TLE

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio779c {

    static class Tramo {
        int ini;
        int fin;
        public Tramo(int ini, int fin) {
            this.ini = ini;
            this.fin = fin;
        }
        @Override
        public String toString() {
            return "[" + ini + "," + fin + ']';
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fotogramas, copias;
        do {
            fotogramas = sc.nextInt();
            copias = sc.nextInt();
            if (!(fotogramas == 0 && copias == 0)) {
                tratarCaso(fotogramas, copias, sc);
            }
        } while ((!(fotogramas == 0 && copias == 0)));
    }

    private static void tratarCaso(int fotogramas, int copias, Scanner sc) {
        int ini, fin;
        ArrayList<Tramo> tramos = new ArrayList<Tramo>();
        int n;
        String tmp[];
        Tramo t;
        for (int i = 0; i < copias; i++) {
            n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                tmp = sc.next().split(",");
                ini = Integer.parseInt(tmp[0]);
                fin = Integer.parseInt(tmp[1]);
                t = new Tramo(ini, fin);
                tramos.add(t);
            }
        }
        mostrarSalida(tramos, fotogramas);
    }

    private static void mostrarSalida(ArrayList<Tramo> tramos, int fotogramas) {
        boolean correcto = true;
        for (int i = 1; i <= fotogramas; i++) {
            correcto = estaEnTramos(i, tramos);
            if (!correcto) {
                break;
            }
        }
        if (correcto) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean estaEnTramos(int i, ArrayList<Tramo> tramos) {
        for (Tramo tramo : tramos) {
            if (i >= tramo.ini && i <= tramo.fin) {
                return true;
            }
        }
        return false;
    }
}
