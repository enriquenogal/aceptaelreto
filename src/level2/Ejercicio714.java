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
public class Ejercicio714 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
            if (n > 0) {
                String[] a = new String[n];
                for (int i = 0; i < n; i++) {
                    a[i] = sc.next();
                }
                while (a.length != 1) {
                    a = ronda(a,sc);
                }
                System.out.println(a[0]);
            }
        } while (n > 0);
    }
    
    public static String[] ronda(String[] a, Scanner sc) {
        String[] r = new String[a.length / 2];
        int r1, r2;
        for (int i = 0; i < r.length; i++) {
            r1 = sc.nextInt();
            r2 = sc.nextInt();
            if (r1 > r2) {
                r[i] = a[i * 2];
            } else {
                r[i] = a[(i * 2) + 1];
            }
        }
        return r;
    }
}
