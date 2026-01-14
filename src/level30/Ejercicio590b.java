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
public class Ejercicio590b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        do {
            n = sc.nextInt();
            m = sc.nextInt();
            sc.nextLine();
            if (!(n == 0 && m == 0)) {
                int[] ln = new int[n];
                for (int i = 0; i < ln.length; i++) {
                    ln[i] = sc.nextInt();
                }
                int resultado = Integer.MAX_VALUE;
                int primero = 0;
                int acumulador = 0, aux;
                for (int i = 0; i < n; i++) {
                    aux = ln[i];
                    acumulador += aux;
                    if (acumulador == m) {
                        resultado = m;
                        break;
                    } else if (acumulador > m) {
                        while (acumulador >= m) {
                            if (acumulador == m) {
                                resultado = m;
                                break;
                            }
                            resultado = Math.min(resultado, acumulador);
                            acumulador -= ln[primero];
                            primero++;
                        }
                    } else {

                    }
                }
                if (resultado == Integer.MAX_VALUE) {
                    System.out.println("IMPOSIBLE");
                } else {
                    System.out.println(resultado);
                }
            }
        } while (!(n == 0 && m == 0));
    }
}
