//MLE

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio779e {

    static class Tramo implements Comparable<Tramo> {

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

        @Override
        public int compareTo(Tramo o) {
            return (o.fin - o.ini) - (this.fin - this.ini);
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
        Collections.sort(tramos);
        mostrarSalida(tramos, fotogramas);
    }

    private static void mostrarSalida(ArrayList<Tramo> tramos, int fotogramas) {
        //System.out.println(tramos);
        boolean[] b = new boolean[fotogramas];
        boolean completo = false;
        for (Tramo tramo : tramos) {
            for (int i = tramo.ini; i <= tramo.fin; i++) {
                b[i - 1] = true;
            }
            if (completo(b)) {
                completo = true;
                break;
            }
        }
        if (completo) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean completo(boolean[] pics) {
        for (int i = 0; i < pics.length; i++) {
            if (pics[i] == false) {
                return false;
            }
        }
        return true;
    }
}
