package unresolved;

//Time limit exceeded (TLE)

import java.util.Arrays;
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
public class Ejercicio227 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine().trim();
        String salida;
        String[] entradas;
        int n, m;
        int[] anterior;
        int[] presente;
        while (!entrada.equals("0 0")) {
            presente = new int[1];
            presente[0] = 1;
            salida = "";
            entradas = entrada.split(" ");
            n = Integer.parseInt(entradas[0]);
            m = Integer.parseInt(entradas[1]);
            for (int i = 1; i <= n; i++) {
                anterior = Arrays.copyOf(presente, presente.length);
                presente = new int[i + 1];
                for (int j = 0; j < presente.length; j++) {
                    if (j == 0) {
                        presente[j] = 1;
                    } else if (j == presente.length - 1) {
                        presente[j] = 1;
                    } else {
                        presente[j] = anterior[j - 1] + anterior[j];
                    }
                }
                anterior = null;
            }
            for (int i = 0; i <= m; i++) {
                salida += " " + presente[i] % 1000000007;
            }
            System.out.println(salida.trim());
            entrada = sc.nextLine().trim();
        }
    }
}
