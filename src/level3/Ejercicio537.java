package level3;

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
public class Ejercicio537 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nPuntos, nCaminos;
        boolean[][] rutas;
        boolean[] resultado;
        boolean completo;
        int a, b;

        while (sc.hasNextLine()) {
            nPuntos = sc.nextInt();
            nCaminos = sc.nextInt();
            sc.nextLine();

            if (nPuntos > nCaminos + 1) {
                for (int i = 0; i < nCaminos; i++) {
                    sc.nextInt();
                    sc.nextInt();
                    sc.nextLine();
                }
                System.out.println("A PIE");
            } else {
                rutas = new boolean[nPuntos][nPuntos];
                resultado = new boolean[nPuntos];
                completo = true;
                for (int i = 0; i < rutas.length; i++) {
                    for (int j = 0; j < rutas[i].length; j++) {
                        rutas[i][j] = false;
                    }
                }
                for (int i = 0; i < resultado.length; i++) {
                    resultado[i] = false;
                }
                for (int i = 0; i < nCaminos; i++) {
                    a = sc.nextInt() - 1;
                    b = sc.nextInt() - 1;
                    rutas[a][b] = true;
                    rutas[b][a] = true;
                    sc.nextLine();
                }

                check(0, rutas, resultado);

                for (int i = 0; i < resultado.length; i++) {
                    if (resultado[i] == false) {
                        completo = false;
                        break;
                    }
                }
                if (completo) {
                    System.out.println("BICI");
                } else {
                    System.out.println("A PIE");
                }
            }
        }
    }

    public static void check(int posicion, boolean[][] rutas, boolean[] resultado) {
        if (resultado[posicion] == false) {
            resultado[posicion] = true;
            for (int i = 1; i < rutas[posicion].length; i++) {
                if (rutas[posicion][i] == true) {
                    check(i, rutas, resultado);
                }
            }
        }
    }
}
