//MLE -- si lo hago con array de string para que no haga conversiones de tipos
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
        //int nCasos = Integer.parseInt(sc.nextLine());
        int nCasos = sc.nextInt();
        int nCartas;
        //String[] a;
        int[] a;
        for (int i = 0; i < nCasos; i++) {
            //nCartas = Integer.parseInt(sc.nextLine());
            nCartas = sc.nextInt();
            //a = sc.nextLine().split(" ");
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
            if (str2.indexOf(str1.charAt(i)) != -1) return true;
        }
        return false;
    }

//    private static boolean juntas(String str1, String str2) {
//        for (int i = 0; i < str1.length(); i++) {
//            if (str2.indexOf(str1.charAt(i)) != -1) return true;
//        }
//        return false;
//    }
}
