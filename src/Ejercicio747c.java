
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enogal
 */
public class Ejercicio747c {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f, c;
        char[][] mapa;
        String linea;
        do {
            f = sc.nextInt();
            c = sc.nextInt();
            mapa = new char[f][c];
            sc.nextLine();
            if (f != 0 && c != 0) {
                for (int i = 0; i < f; i++) {
                    linea = sc.nextLine();
                    for (int j = 0; j < c; j++) {
                        mapa[i][j] = linea.charAt(j);
                    }
                }
                tratarCaso(mapa, f, c);
            }
        } while (f != 0 && c != 0);
    }

    private static void tratarCaso(char[][] mapa, int f, int c) {
        int finChequeo = Math.max(f, c);
        mapa[0][0] = '1';
        for (int check = 0; check < finChequeo; check++) {
            for (int checkFila = 0; checkFila < f; checkFila++) {
                //me queda algo
                try {
                    if (mapa[checkFila - 1][check] == '1') {
                        mapa[checkFila][check] = '1';
                    }
                } catch (IndexOutOfBoundsException e) {
                }
                try {
                    if (mapa[checkFila][check - 1] == '1') {
                        mapa[checkFila][check] = '1';
                    }
                } catch (IndexOutOfBoundsException e) {
                }
            }
            for (int checkColumna = 0; checkColumna < c; checkColumna++) {
                try {
                    if (mapa[check][checkColumna - 1] == '1') {
                        mapa[check][checkColumna] = '1';
                    }
                } catch (IndexOutOfBoundsException e) {
                }
                try {
                    if (mapa[check - 1][checkColumna] == '1') {
                        mapa[check][checkColumna] = '1';
                    }
                } catch (IndexOutOfBoundsException e) {
                }
            }
        }
        if (mapa[f][c] == '1') {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }

}
