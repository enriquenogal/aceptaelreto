//MLE -- si lo hago con array de Strings para no hacer tantas conversiones
//TLE -- si lo hago con array de int para que ocupe menos memoria

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
public class Ejercicio834 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nCasos = sc.nextInt();
        int nCartas;
        int[] a;
        for (int i = 0; i < nCasos; i++) {
            nCartas = sc.nextInt();
            a = new int[nCartas];
            for (int j = 0; j < a.length; j++) {
                a[j] = sc.nextInt();
            }
            tratarCaso(a);
        }

    }

    private static void tratarCaso(int[] a) {
        int c = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (juntas(a[i], a[j])) {
                    c++;
                }
            }
        }
        System.out.println(c);
    }

    private static boolean juntas(int c1, int c2) {
        String str1 = Integer.toString(c1);
        String str2 = Integer.toString(c2);
        for (int i = 0; i < str1.length(); i++) {
            if (str2.indexOf(str1.charAt(i)) != -1) {
                return true;
            }
        }
        return false;
    }
}
