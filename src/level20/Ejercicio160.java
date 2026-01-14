package level20;




import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enogal
 */
public class Ejercicio160 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int a[][];
        do {
            n = sc.nextInt();
            if (n != 0) {
                a = new int[n][n];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        a[i][j] = sc.nextInt();
                    }
                }
                if (tratarCaso(a, n)) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            }
        } while (n != 0);
    }

    public static boolean tratarCaso(int[][] a, int n) {
        boolean abajo = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    break;
                }
                if (a[i][j] != 0) {
                    abajo = false;
                    break;
                }
            }
            if (abajo == false) {
                break;
            }
        }
        if (abajo) {
            return true;
        }
        boolean arriba = true;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                if (i == j) {
                    break;
                }
                if (a[i][j] != 0) {
                    arriba = false;
                    break;
                }
            }
            if (arriba == false) {
                break;
            }
        }
        if (arriba) {
            return true;
        }
        return false;
    }

}
