package unresolved;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio639 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[] f;
        while (sc.hasNextInt()) {
            n = sc.nextInt();
            f = new int[n];
            for (int i = 0; i < n; i++) {
                f[i] = sc.nextInt();
            }
            System.out.println(tratarCaso(f, n));
        }

    }

    public static int tratarCaso(int[] f, int n) {
        int min = Integer.MAX_VALUE, minTmp, a, b, c, difAB, difAC, difBC;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                a = sumaPosiciones(f, 0, i);
                b = sumaPosiciones(f, i + 1, j);
                difAB = Math.abs(a - b);
                if (difAB < min) {
                    c = sumaPosiciones(f, j + 1, n - 1);
                    difAC = Math.abs(a - c);
                    if (difAC < min) {
                        difBC = Math.abs(b - c);
                        if (difBC < min) {
                            minTmp = Math.max(Math.max(difAB, difAC), difBC);
                            //System.out.println("Diferencia: " + minTmp);
                            if (minTmp == 0) {
                                return 0;
                            } else if (minTmp < min) {
                                min = minTmp;
                            }
                        }
                    }
                }
            }
        }
        return min;
    }

    public static int sumaPosiciones(int[] f, int ini, int fin) {
        int r = 0;
        for (int i = ini; i <= fin; i++) {
            r += f[i];
        }
        return r;
    }
}
