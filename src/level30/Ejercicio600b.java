package level30;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio600b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f, c;
        int[][] matriz;
        do {
            f = sc.nextInt();
            c = sc.nextInt();
            if (f != 0 && c != 0) {
                //leer datos
                matriz = new int[f][c];
                for (int i = 0; i < f; i++) {
                    for (int j = 0; j < c; j++) {
                        matriz[i][j] = sc.nextInt();
                    }
                }
                tratarCaso(matriz, f, c);
            }
        } while (f != 0 && c != 0);
    }

    public static void tratarCaso(int[][] matriz, int f, int c) {
        boolean es = false;
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                if (tratarCasoMenorQue(i, j, matriz) || tratarCasoMayorQue(i, j, matriz)) {
                    es = true;
                    break;
                }
            }
            if (es) {
                break;
            }
        }
        if (es) {
            System.out.println("SI");
            es = false;
        } else {
            System.out.println("NO");
        }
    }

    public static boolean tratarCasoMenorQue(int f, int c, int[][] matriz) {
        int p = matriz[f][c];
        int nFila = Integer.MAX_VALUE, nColumna = Integer.MIN_VALUE;
        //fila
        for (int i = 0; i < matriz[0].length; i++) {
            if (matriz[f][i] < nFila) {
                nFila = matriz[f][i];
            }
        }
        if (p <= nFila) {
            //Columna
            for (int i = 0; i < matriz.length; i++) {

                if (matriz[i][c] > nColumna) {
                    nColumna = matriz[i][c];
                }
            }
            return (p <= nFila) && (p >= nColumna);
        } else {
            return false;
        }

    }

    public static boolean tratarCasoMayorQue(int f, int c, int[][] matriz) {
        int p = matriz[f][c];
        int nFila = Integer.MIN_VALUE, nColumna = Integer.MAX_VALUE;
        //fila
        for (int i = 0; i < matriz[0].length; i++) {
            if (matriz[f][i] > nFila) {
                nFila = matriz[f][i];
            }
        }
        if (p >= nFila) {
            //Columna
            for (int i = 0; i < matriz.length; i++) {
                if (matriz[i][c] < nColumna) {
                    nColumna = matriz[i][c];
                }
            }
            return (p >= nFila) && (p <= nColumna);
        } else {
            return false;
        }
    }
}
