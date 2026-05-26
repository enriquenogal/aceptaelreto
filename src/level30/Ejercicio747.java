package level30;


import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio747 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f, c;
        char[][] mapa;
        do {
            f = sc.nextInt();
            c = sc.nextInt();
            if (!(f == 0 && c == 0)) {
                sc.nextLine();
                mapa = leerEntrada(f, c, sc);
                //mostrarMapa(mapa);
                tratarCaso(mapa);
                //mostrarMapa(mapa);
            }
        } while (!(f == 0 && c == 0));
    }

    private static char[][] leerEntrada(int f, int c, Scanner sc) {
        char[][] mapa = new char[f][c];
        for (int i = 0; i < f; i++) {
            mapa[i] = sc.nextLine().toCharArray();
        }
        return mapa;
    }

    private static void tratarCaso(char[][] mapa) {
        boolean conseguido = false;
        ArrayList<int[]> pdtesVisitar = new ArrayList<int[]>();
        int[] tmp = {0, 0};
        pdtesVisitar.add(tmp);
        while (pdtesVisitar.size() > 0) {
            int iTmp = pdtesVisitar.get(0)[0];
            int jTmp = pdtesVisitar.get(0)[1];
            conseguido = visita(mapa, iTmp, jTmp, pdtesVisitar);
            if (conseguido) {
                pdtesVisitar.clear();
            } else {
                pdtesVisitar.remove(0);
            }
        }
        if (conseguido) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
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

    private static final int[][] DIRECCIONES = {
        {-1, 0},
        {0, -1}, {0, 1},
        {1, 0}
    };

    private static boolean visita(char[][] mapa, int i, int j, ArrayList<int[]> pdtesVisitar) {
        if (mapa[i][j] != '.') return false;
        mapa[i][j] = 'V';
        if (i == (mapa.length - 1) && j == (mapa[0].length - 1)) {
            return true;
        } else {
            int nuevaI, nuevaJ;
            for (int[] dir : DIRECCIONES) {
                nuevaI = i + dir[0];
                nuevaJ = j + dir[1];
                if (nuevaI >= 0 && nuevaI < mapa.length && nuevaJ >= 0 && nuevaJ < mapa[0].length) {
                    if (mapa[nuevaI][nuevaJ] == '.') {
                        int[] tmp = {nuevaI, nuevaJ};
                        pdtesVisitar.add(tmp);
                    }
                }
            }
            return false;
        }
    }
}