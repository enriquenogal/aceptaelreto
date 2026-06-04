//TLE

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a2025Reg;

import java.util.Scanner;

/**
 *
 * @author enogal
 */
public class Ejercicio846 {

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
        int max = Integer.MIN_VALUE;
        int acumulado;
        for (int i = 0; i < carrera.length; i++) {
            acumulado = 0;
            for (int j = i; j < carrera.length; j++) {
                acumulado += carrera[j];
                if (acumulado > max) {
                    max = acumulado;
                }
            }
        }
        System.out.println(max);
    }
}
