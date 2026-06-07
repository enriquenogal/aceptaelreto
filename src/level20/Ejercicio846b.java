
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package level20;

import java.util.Scanner;

/**
 *
 * @author enogal
 */
public class Ejercicio846b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[] carrera;
        do {
            n = sc.nextInt();
            if (n != 0) {
                carrera = new int[n];
                for (int i = 0; i < n; i++) {
                    carrera[i] = sc.nextInt();
                }
                tratarCaso(carrera);
            }
        } while (n != 0);
    }

    private static void tratarCaso(int[] carrera) {
        int maxActual = 0;
        int maxGlobal = 0;
        for (int i = 0; i < carrera.length; i++) {
            maxActual = Math.max(carrera[i], carrera[i] + maxActual);
            maxGlobal = Math.max(maxActual, maxGlobal);
        }
        System.out.println(maxGlobal);
    }
}
