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
public class Ejercicio151 {

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
                if (esIdentidad(a)) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            }
        } while (n != 0);
    }

    public static boolean esIdentidad(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j) {
                    if (a[i][j] != 1) {
                        return false;
                    }
                } else {
                    if (a[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
