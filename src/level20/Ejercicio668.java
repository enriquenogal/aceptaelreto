package level20;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio668 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, n;
        do {
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
            if (!(a == 0 && b == 0 && n == 0)) {
                System.out.println(restanacci(a, b, n));
            }
        } while (!(a == 0 && b == 0 && n == 0));
    }

    public static int restanacci(int a, int b, int n) {
        if (n == 0) {
            return a;
        } else if (n == 1) {
            return b;
        } else {
            int c = 0;
            for (int i = 2; i <= n; i++) {
                c = b - a;
                a = b;
                b = c;
                //System.out.println("Iteración: " + i + "    --- a = " + a + " --- b = " + b + " --- c = " + c);
            }
            return c;
        }
    }

}
