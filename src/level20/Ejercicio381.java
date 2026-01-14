package level20;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
public class Ejercicio381 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = -1, mcm;

        while (n != 0) {
            n = sc.nextInt();
            if (n != 0) {
                mcm = sc.nextInt();
                for (int i = 1; i < n; i++) {
                    mcm = mcm(mcm, sc.nextInt());
                }
                System.out.println(mcm);
            }
        }
    }

    public static int mcm(int a, int b) {
        int mcm = 0;
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        mcm = (max / mcdEuclides(max, min)) * min;
        return mcm;
    }

    public static int mcdEuclides(int a, int b) {
        int t;
        while (b != 0) {
            t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

}
