package level3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enogal
 */
public class Ejercicio268 {

    class Desarrollo implements Comparable {

        int plato;
        int corona;
        double relacion;

        public Desarrollo(int plato, int corona) {
            this.plato = plato;
            this.corona = corona;
            this.relacion = 1.0 * plato / corona;
        }

        @Override
        public int compareTo(Object o) {
            return Double.compare(relacion, ((Desarrollo) o).relacion);
        }

        @Override
        public String toString() {
            return plato + "-" + corona;
        }
    }

    public static void main(String[] args) {
        (new Ejercicio268()).run();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int nPlatos, nCoronas;
        int[] platos, coronas;
        List<Desarrollo> ds = new ArrayList<Desarrollo>();
        do {
            nPlatos = sc.nextInt();
            nCoronas = sc.nextInt();
            if (!(nPlatos == 0 && nCoronas == 0)) {
                platos = new int[nPlatos];
                coronas = new int[nCoronas];
                ds.clear();
                for (int i = 0; i < nPlatos; i++) {
                    platos[i] = sc.nextInt();
                }
                for (int i = 0; i < nCoronas; i++) {
                    coronas[i] = sc.nextInt();
                }
                for (int i = 0; i < nPlatos; i++) {
                    for (int j = 0; j < nCoronas; j++) {
                        ds.add(new Desarrollo(platos[i], coronas[j]));
                    }
                }
                Collections.sort(ds);
                for (int i = 0; i < ds.size(); i++) {
                    if (i != 0) {
                        System.out.print(" ");
                    }
                    System.out.print(ds.get(i));
                }
                System.out.println();
            }
        } while (!(nPlatos == 0 && nCoronas == 0));
    }
}
