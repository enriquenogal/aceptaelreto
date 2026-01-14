package level30;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
public class Ejercicio521 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nPisos = -1, nLetras = -1, nAsistentes = -1;
        int piso, letra, acumulador, minimos;
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[][] edificio;
        while (!(nPisos == 0 && nLetras == 0 && nAsistentes == 0)) {
            nPisos = sc.nextInt();
            nLetras = sc.nextInt();
            nAsistentes = sc.nextInt();
            sc.nextLine();
            if (!(nPisos == 0 && nLetras == 0 && nAsistentes == 0)) {
                edificio = new int[nPisos][nLetras];
                for (int i = 0; i < nAsistentes; i++) {
                    piso = sc.nextInt();
                    letra = letras.indexOf(sc.next().trim());
                    edificio[piso - 1][letra]++;
                }
                sc.nextLine();
                acumulador = 0;
                for (int i = 0; i < nPisos; i++) {
                    for (int j = 0; j < nLetras; j++) {
                        if (edificio[i][j] > 0) {
                            acumulador++;
                        }
                    }
                }
                if (nPisos * nLetras % 2 == 0) {
                    minimos = nPisos * nLetras / 2;
                } else {
                    minimos = (nPisos * nLetras / 2) + 1;
                }

                if (minimos > acumulador) {
                    System.out.println("ESPERAMOS");
                } else {
                    System.out.println("EMPEZAMOS");
                }
            }
        }
    }
}