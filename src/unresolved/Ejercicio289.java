//Wrong answer (WA)
package unresolved;

import java.util.PriorityQueue;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
public class Ejercicio289 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n, acumulador, esfuerzo;
        PriorityQueue<Long> numeros = new PriorityQueue<Long>();
        do {
            n = Long.parseLong(sc.nextLine());
            if (n != 0) {
                if (n == 1) {
                    sc.nextLine();
                    System.out.println(0);
                } else {
                    esfuerzo = 0;
                    numeros.clear();
                    for (int i = 0; i < n; i++) {
                        numeros.add(sc.nextLong());
                    }
                    sc.nextLine();
                    while (!numeros.isEmpty()) {
                        acumulador = numeros.poll() + numeros.poll();
                        esfuerzo = esfuerzo + acumulador;
                        if (!numeros.isEmpty()) {
                            numeros.add(acumulador);
                        }
                    }
                    System.out.println(esfuerzo);
                }
            }
        } while (n != 0);
    }
}
