//TLE pero también es WA
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
public class Ejercicio779b {

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
        int max = fotogramas + 1;
        int min = 0;
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
                if (tramos.isEmpty()) {
                    tramos.add(t);
                } else if (ini > max || max < min) {
                    tramos.add(t);
                } else {
                    mergeTramos(tramos, t);
                }
                if (fin > max) {
                    max = fin;
                }
                if (min < ini) {
                    min = ini;
                }
            }
        }
        mostrarSalida(tramos, fotogramas);
    }

    private static void mergeTramos(ArrayList<Tramo> tramos, Tramo t) {
//        este merge no esta fino
//        este caso no funcionaría
//        50 1
//        3 20,30 40,50 30,44
//        Daría este resultado [[20,44], [40,50]]
        boolean merged = false;
        for (Tramo tramo : tramos) {
            if (t.ini >= tramo.ini && t.fin <= tramo.fin) {
                merged = true;
                break;
            } else if (tramo.ini > t.ini && tramo.fin >= t.fin && tramo.ini <= t.fin) {
                tramo.ini = t.ini;
                merged = true;
                break;
            } else if (tramo.ini <= t.ini && tramo.fin < t.fin && tramo.fin >= t.ini) {
                tramo.fin = t.fin;
                merged = true;
                break;
            } else if (t.ini < tramo.ini && t.fin > tramo.fin) {
                tramo.ini = t.ini;
                tramo.fin = t.fin;
                merged = true;
                break;
            }
        }
        if (!merged) {
            tramos.add(t);
        }
    }

    private static void mostrarSalida(ArrayList<Tramo> tramos, int fotogramas) {
        System.out.println(tramos);
        int cont = 0;
        for (Tramo tramo : tramos) {
            cont += 1 + tramo.fin - tramo.ini;
        }
        if (cont == fotogramas) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}
