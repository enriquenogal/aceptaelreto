/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level10;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Ejercicio582 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String linea;
        String[] datos;
        int n = sc.nextInt();
        sc.nextLine();
        boolean correcto;
        for (int i = 0; i < n; i++) {
            linea = sc.nextLine().trim();
            if (linea.equals("")) {
                System.out.println("MARISA NARANJO");
            } else if (linea.startsWith("ding-dong")) {
                System.out.println("SALIDA NULA");
            } else {
                datos = linea.split(" ");
                correcto = true;
                if (datos.length != 12) {
                    correcto = false;
                }
                if (correcto) {
                    System.out.println("CORRECTO");
                } else {
                    System.out.println("TARDE");
                }
            }
        }
    }
}
