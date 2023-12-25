package level1;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enogal
 */
public class Ejercicio657 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, a, b, c, r1, r2;
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            r1 = resta(a, b);
            r2 = resta(b, c);
            if (r1 == r2) {
                System.out.println("EMPATE");
            } else if (r1 < r2) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        }
    }

    public static int resta(int n1, int n2) {
        int r = 0;
        r = Math.abs(n1 - n2);
        if ((n1 < 0 && n2 > 0) || (n2 < 0 && n1 > 0)) {
            r--;
        }
        return r;
    }
}
