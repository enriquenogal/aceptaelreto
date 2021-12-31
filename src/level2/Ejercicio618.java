package level2;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio618 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, nChecks, inicio, fin, resultado;
        int[] niveles;
        do {
            n = sc.nextInt();
            if (n != 0) {
                niveles = new int[n + 2];
                niveles[0] = 0;
                niveles[1] = 0;
                for (int i = 2; i < niveles.length; i++) {
                    niveles[i] = niveles[i - 1] + sc.nextInt();
                }
//                System.out.println("Niveles: ");
//                for (int i = 1; i < niveles.length; i++) {
//                    System.out.print(niveles[i] + " ");
//                }
                nChecks = sc.nextInt();
                for (int i = 0; i < nChecks; i++) {
                    inicio = sc.nextInt();
                    fin = sc.nextInt();
//                    System.out.println("Inicio: " + inicio + " fin: " + fin);
                    inicio = niveles[inicio + 1];
                    fin = niveles[fin];
                    resultado = fin - inicio;
//                    System.out.println("Inicio: " + inicio + " fin: " + fin);
                    System.out.println(resultado);
                }
                System.out.println("---");
            }
        } while (n != 0);
    }

}
