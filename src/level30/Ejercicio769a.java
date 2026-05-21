package level30;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enogal
 */
public class Ejercicio769a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f, c;
        char[][] mapa;
        while (sc.hasNextLine()) {
            f = sc.nextInt();
            c = sc.nextInt();
            sc.nextLine();
            mapa = leerEntrada(f, c, sc);
            //mostrarMapa(mapa);
            tratarCaso(mapa);
        }
    }

    private static char[][] leerEntrada(int f, int c, Scanner sc) {
        char[][] mapa = new char[f][c];
        for (int i = 0; i < f; i++) {
            mapa[i] = sc.nextLine().toCharArray();
        }
        return mapa;
    }

    private static void tratarCaso(char[][] mapa) {
        int contador = 0;
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                if (mapa[i][j] == '#') {
                    contador++;
                    rellena(mapa, i, j);
                    //mostrarMapa(mapa);
                }
            }
        }
        System.out.println(contador);
    }

    private static final int[][] DIRECCIONES = {
        {-1, 0},
        {0, -1}, {0, 1},
        {1, 0}
    };

    private static void rellena(char[][] mapa, int i, int j) {
        mapa[i][j] = 'V';
        int nuevaI, nuevaJ;
        for (int[] dir : DIRECCIONES) {
            nuevaI = i + dir[0];
            nuevaJ = j + dir[1];
            if (nuevaI >= 0 && nuevaI < mapa.length && nuevaJ >= 0 && nuevaJ < mapa[0].length) {
                if (mapa[nuevaI][nuevaJ] == '#') {
                    rellena(mapa, nuevaI, nuevaJ);
                }
            }
        }

    }

    private static void mostrarMapa(char[][] mapa) {
        System.out.println("----------------------------");
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                System.out.print(mapa[i][j]);
            }
            System.out.println();
        }
        System.out.println("----------------------------");
    }
}
