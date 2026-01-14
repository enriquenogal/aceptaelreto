package level30;


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
public class Ejercicio779b {

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
            return this.ini - o.ini;
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
        boolean b = calculaSalida(tramos, fotogramas);
        if (b) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean calculaSalida(ArrayList<Tramo> tramos, int fotogramas) {
        //System.out.println(tramos);
        if (tramos.get(0).ini != 1) {
            return false;
        }
        Tramo tramoTotal = new Tramo(1, tramos.get(0).fin);
        for (int i = 1; i < tramos.size(); i++) {
            //aquí tengo que ir uniendo el tramo que voy recorriendo con tramoTotal
            //si hay hueco entre ellos tengo que hacer un return false
            if (tramos.get(i).ini <= tramoTotal.fin + 1) {
                tramoTotal.fin = Math.max(tramos.get(i).fin, tramoTotal.fin);
            } else {
                return false;
            }
        }
        if (tramoTotal.fin == fotogramas) {
            return true;
        } else {
            return false;
        }
    }
}
