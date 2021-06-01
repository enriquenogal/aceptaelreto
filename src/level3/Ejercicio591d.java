/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level3;

import java.util.Scanner;

public class Ejercicio591d {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int longitud, limit, mitad;
        long[] sumas;
        while (sc.hasNextLine()) {
            longitud = Integer.parseInt(sc.nextLine());
            limit = 0;
            mitad = longitud % 2 == 0 ? longitud / 2 : (longitud / 2) + 1;
            sumas = new long[mitad];
            for (int i = 0; i < mitad; i++) {
                for (int j = 0; j < limit; j++) {
                    sumas[j] += sc.nextLong();
                }
                for (int j = limit; j < longitud - limit; j++) {
                    sumas[i] += sc.nextLong();
                }
                for (int j = limit - 1; j >= 0; j--) {
                    sumas[j] += sc.nextLong();
                }
                limit++;
                sc.nextLine();
            }
            limit--;
            if (longitud % 2 == 0) {

                for (int j = 0; j < limit; j++) {
                    sumas[j] += sc.nextLong();
                }
                for (int j = limit; j < longitud - limit; j++) {
                    sumas[(int) mitad - 1] += sc.nextLong();
                }
                for (int j = limit - 1; j >= 0; j--) {
                    sumas[j] += sc.nextLong();
                }
                mitad++;
                sc.nextLine();
            }
            limit--;
            for (int i = mitad; i < longitud; i++) {
                for (int j = 0; j < limit; j++) {
                    sumas[j] += sc.nextLong();
                }
                for (int j = limit; j < longitud - limit; j++) {
                    sumas[longitud - i - 1] += sc.nextLong();
                }
                for (int j = limit - 1; j >= 0; j--) {
                    sumas[j] += sc.nextLong();
                }
                limit--;
                sc.nextLine();
            }

            for (int i = sumas.length - 1; i > 0; i--) {
                System.out.print(sumas[i] + " ");
            }
            System.out.println(sumas[0]);
        }
    }
}
