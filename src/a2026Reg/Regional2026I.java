/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a2026Reg;

import java.util.Scanner;

/**
 *
 * @author enogal
 */
public class Regional2026I {

    private static final int[][] DIRECCIONES = {
        {-1, -1}, {-1, 0}, {-1, 1},
        {0, -1}, {0, 1},
        {1, -1}, {1, 0}, {1, 1}
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas, iteraciones;
        char[][] a;
        char[] linea;
        while (sc.hasNextLine()) {
            filas = sc.nextInt();
            columnas = sc.nextInt();
            iteraciones = sc.nextInt();
            sc.nextLine();
            a = new char[filas][columnas];
            for (int i = 0; i < filas; i++) {
                linea = sc.nextLine().toCharArray();
                for (int j = 0; j < columnas; j++) {
                    a[i][j] = linea[j];
                }
            }
            for (int i = 0; i < iteraciones; i++) {
                a = avanza(a);
            }
            mostrar(a);

        }
    }

    private static char[][] avanza(char[][] a) {
        char[][] nuevo = new char[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                nuevo[i][j] = calculaNuevo(a, i, j);
            }
        }
        return nuevo;
    }

    private static void mostrar(char[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        System.out.println("===");
    }

    private static char calculaNuevo(char[][] a, int i, int j) {
        int numVecinos = 0;
        for (int[] dir : DIRECCIONES) {
            int nuevaFila = i + dir[0];
            int nuevaCol = j + dir[1];
            if (nuevaFila == -1) {
                nuevaFila = a.length - 1;
            } else if (nuevaFila == a.length) {
                nuevaFila = 0;
            }
            if (nuevaCol == -1) {
                nuevaCol = a[0].length - 1;
            } else if (nuevaCol == a[0].length) {
                nuevaCol = 0;
            }
            if (a[nuevaFila][nuevaCol] == 'O') {
                numVecinos++;
            }

        }
        if (a[i][j] == 'O' && (numVecinos == 2 || numVecinos == 3)) { //viva y con dos o tres vecinos
            return 'O'; //sigue viva
        } else if (a[i][j] == '.' && numVecinos == 3) { //muerta y hay exactamente tres vecinos
            return 'O'; //revive 
        } else {
            return '.'; //muerte
        }

    }
}
