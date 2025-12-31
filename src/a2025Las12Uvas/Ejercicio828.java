/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a2025Las12Uvas;

import java.util.Scanner;

/**
 *
 * @author enriquenogal
 */
public class Ejercicio828 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, suma;
        do {
            n = sc.nextInt();
            if (n != 0) {
                suma = 0;
                for (int i = 0; i < n; i++) {
                    suma += sc.nextInt();
                }
                procesaCaso(suma);
            }
        } while (n != 0);
    }

    private static void procesaCaso(int suma) {
        int h = suma / 3600;
        suma = suma % 3600;
        int m = suma / 60;
        int s = suma % 60;
        System.out.printf("%02d:%02d:%02d%n", h, m, s);
    }
}
