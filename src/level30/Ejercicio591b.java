/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level30;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Ejercicio591b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        long[][] seccion, aux;
        long resultado;
        int a, b;
        String strResultado;
        int ini, fin;
        while (sc.hasNextLine()) {
            strResultado = "";
            n = Integer.parseInt(sc.nextLine());
            seccion = new long[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    seccion[i][j] = sc.nextLong();
                }
                sc.nextLine();
            }
            if (n % 2 == 1) {
                ini = n / 2;
                fin = n / 2;
            } else {
                ini = n / 2 - 1;
                fin = n / 2;
            }
            while (ini >= 0) {
                resultado = 0;
                if (ini == fin) {
                    resultado = seccion[ini][fin];
                } else {
                    //sumo fila de arriba y abajo
                    for (int i = ini; i <= fin; i++) {
                        resultado += seccion[ini][i];
                        resultado += seccion[fin][i];
                    }
                    //sumo las columnas izda y decha
                    for (int i = ini + 1; i < fin; i++) {
                        resultado += seccion[i][ini];
                        resultado += seccion[i][fin];
                    }
                }
                System.out.print(resultado);
                if (ini!=0) {
                    System.out.print(" ");
                } else {
                    System.out.println();
                }
                ini--;
                fin++;
            }
        }
    }
}
