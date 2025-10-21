package level3;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enogal
 */
public class Ejercicio697 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[][] a;
        do {
            n = sc.nextInt();
            a = new int[n][n];
            if (n != 0) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        a[i][j] = sc.nextInt();
                    }
                }
                tratarCaso(a, n);
            }
        } while (n != 0);
    }

    private static void tratarCaso(int[][] a, int n) {
        int acum = 0;
        int posicionV = n / 2;
        int posicionH = n / 2;
        String dir = "Arriba";
        int pasos = 1;
        try {
            do {
                for (int i = 0; i < pasos; i++) {
                    //System.out.print("Posicion " + posicionV + "::" + posicionH + "   Acum: " + acum + " + " + a[posicionV][posicionH]);
                    acum += a[posicionV][posicionH];
                    //System.out.println(" = " + acum);
                    if (dir.equals("Arriba")) {
                        posicionV--;
                    } else if (dir.equals("Abajo")) {
                        posicionV++;
                    } else if (dir.equals("Derecha")) {
                        posicionH++;
                    } else if (dir.equals("Izquierda")) {
                        posicionH--;
                    }
                }
                pasos++;
                if (dir.equals("Arriba")) {
                    dir = "Derecha";
                } else if (dir.equals("Abajo")) {
                    dir = "Izquierda";
                } else if (dir.equals("Derecha")) {
                    dir = "Abajo";
                } else if (dir.equals("Izquierda")) {
                    dir = "Arriba";
                }
            } while (true);
        } catch (Exception e) {
        }
        System.out.println(acum);
    }
}
