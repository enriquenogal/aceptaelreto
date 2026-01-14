/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level30;

/**
 *
 * @author enrique
 */
public class Ejercicio590 {

    java.util.Scanner sc = new java.util.Scanner(System.in);

    public boolean caso() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        if (n == 0 && m == 0) {
            return false;
        }
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
                System.out.println(m);
                return true;
            } else if (acumulador > m) {
                while (acumulador >= m) {
                    if (acumulador == m) {
                        System.out.println(m);
                        return true;
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
        return true;
    }

    public void run() {
        while (caso());
    }

    public static void main(String[] args) {
        new Ejercicio590().run();
    }
}
