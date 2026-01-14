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
 * @author enogal
 */
public class Ejercicio579 {

    class Tarea implements Comparable {

        int prioridad;
        int duracion;

        public Tarea(int prioridad, int duracion) {
            this.prioridad = prioridad;
            this.duracion = duracion;
        }

        @Override
        public String toString() {
            return prioridad + " " + duracion;
        }

        @Override
        public int compareTo(Object o) {
            Tarea otra = (Tarea) o;
            if (this.prioridad == otra.prioridad) {
                return this.duracion - otra.duracion;
            } else {
                return otra.prioridad - this.prioridad;
            }
        }
    }

    public static void main(String[] args) {
        (new Ejercicio579()).run();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Tarea> al = new ArrayList<Tarea>();
        int n;
        do {
            n = sc.nextInt();
            if (n != 0) {
                al.clear();
                for (int i = 0; i < n; i++) {
                    al.add(new Tarea(sc.nextInt(),sc.nextInt()));
                }
                Collections.sort(al);
                for (Tarea tarea : al) {
                    System.out.println(tarea);
                }
                System.out.println("---");
            }
        } while (n != 0);
    }
}
