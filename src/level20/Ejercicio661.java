/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package level20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author enriquenogal
 */
public class Ejercicio661 {

    class Tesoro implements Comparable {

        String nombre;
        int valor;
        int peso;

        public Tesoro(String nombre, int valor, int peso) {
            this.nombre = nombre;
            this.valor = valor;
            this.peso = peso;
        }

        @Override
        public int compareTo(Object o) {
            Tesoro t = (Tesoro) o;
            if (this.valor != t.valor) {
                return t.valor - this.valor;
            } else {
                return this.peso - t.peso;
            }
        }
    }

    public static void main(String[] args) {
        (new Ejercicio661()).run();
    }

    public void run() {
        ArrayList<Tesoro> al = new ArrayList<Tesoro>();
        Scanner sc = new Scanner(System.in);
        String nombre, salida;
        int valor, peso;
        int n;
        do {
            n = sc.nextInt();
            sc.nextLine();
            if (n != 0) {
                al.clear();
                for (int i = 0; i < n; i++) {
                    nombre = sc.next();
                    valor = sc.nextInt();
                    peso = sc.nextInt();
                    sc.nextLine();
                    al.add(new Tesoro(nombre, valor, peso));
                }
                Collections.sort(al);
                salida = "";
                for (Tesoro tesoro : al) {
                    salida += tesoro.nombre + " ";
                }
                System.out.println(salida.trim());
            }
        } while (n != 0);
    }
}
