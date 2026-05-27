package level10;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio162 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String s;
        do {
            n = sc.nextInt();
            if (n != 0) {
                s = sc.nextLine().trim();
                tratarCaso(n, s);
            }
        } while (n != 0);
    }

    private static void tratarCaso(int n, String s) {
        imprimeLineaHorizontal(n);
        for (int i = 0; i < 8; i++) {
            imprimeLineaTablero(i, n, s);
        }
        imprimeLineaHorizontal(n);
    }

    private static void imprimeLineaHorizontal(int n) {
        System.out.print("|");
        for (int i = 0; i < 8 * n; i++) {
            System.out.print("-");
        }
        System.out.println("|");
    }

    private static void imprimeLineaTablero(int numLinea, int n, String s) {
        for (int i = 0; i < n; i++) {
            System.out.print("|");
            for (int a = 0; a < 4; a++) {
                if (numLinea % 2 == 0) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < n; j++) {
                        System.out.print(s);
                    }
                } else {
                    for (int j = 0; j < n; j++) {
                        System.out.print(s);
                    }
                    for (int j = 0; j < n; j++) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("|");
        }
    }
}
