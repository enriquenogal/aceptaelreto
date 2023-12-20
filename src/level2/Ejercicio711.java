package level2;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enogal
 */
public class Ejercicio711 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int veces = sc.nextInt();
        long n;
        for (int i = 0; i < veces; i++) {
            n = sc.nextLong();
            System.out.println(tratarCaso(n));
        }
    }
    
    public static long tratarCaso(long n) {
        long r = 0;
        String s = Long.toString(n);
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                r += Character.getNumericValue(s.charAt(i)) * 3 + menorDerecha(s,i);
            } else {
                r += Character.getNumericValue(s.charAt(i)) * 2 + mayorIzquierda(s,i);
            }
        }
        return r;
    }
    
    public static int menorDerecha(String s, int i) {
        int min = 9;
        for (int j = i + 1; j < s.length(); j++) {
            if (Character.getNumericValue(s.charAt(j)) < min) {
                min = Character.getNumericValue(s.charAt(j));
            }
        }
        return min;
    }
    
    public static int mayorIzquierda(String s, int i) {
        int max = 0;
        for (int j = i - 1; j >= 0; j--) {
            if (Character.getNumericValue(s.charAt(j)) > max) {
                max = Character.getNumericValue(s.charAt(j));
            }
        }
        return max;
    }
}
