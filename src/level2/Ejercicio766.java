package level2;


import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enogal
 */
public class Ejercicio766 {

    static class Persona implements Comparable<Persona> {

        int tiempo;
        int cantidad;

        public Persona(int tiempo, int cantidad) {
            this.tiempo = tiempo;
            this.cantidad = cantidad;
        }

        @Override
        public int compareTo(Persona o) {
            if (this.tiempo != o.tiempo) {
                return o.tiempo - this.tiempo;
            } else {
                return this.cantidad - o.cantidad;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horchataDisponible, n;
        Persona[] personas;
        do {
            horchataDisponible = sc.nextInt();
            n = sc.nextInt();
            if (!(horchataDisponible == 0 && n == 0)) {
                personas = new Persona[n];
                for (int i = 0; i < n; i++) {
                    personas[i] = new Persona(sc.nextInt(), sc.nextInt());
                }
                Arrays.sort(personas);
                tratarCaso(personas, horchataDisponible);
            }
        } while (!(horchataDisponible == 0 && n == 0));
    }

    public static void tratarCaso(Persona[] personas, int horchataDisponible) {
        int i = 0;
        while (i < personas.length) {
            if (horchataDisponible - personas[i].cantidad < 0) {
                break;
            } else {
                horchataDisponible -= personas[i].cantidad;
                i++;
            }
        }
        System.out.println(i + " " + horchataDisponible);
    }
}
