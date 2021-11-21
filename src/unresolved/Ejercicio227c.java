package unresolved;

//Wrong answer (WA)

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
public class Ejercicio227c {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine().trim();
        String[] entradas;
        long n, m, ultimo;
        while (!entrada.equals("0 0")) {
            entradas = entrada.split(" ");
            n = Long.parseLong(entradas[0]);
            m = Long.parseLong(entradas[1]);

            ultimo = 1;
            for (int i = 0; i <= m; i++) {
                System.out.format("%d%s", ultimo, i < m ? " " : "\n");
                ultimo = (ultimo * (n - i) / (i + 1)) % 1000000007;
            }
            entrada = sc.nextLine().trim();
        }
    }
}
