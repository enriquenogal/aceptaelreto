package level30;

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
public class Ejercicio431 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int familias = Integer.parseInt(sc.nextLine());
        String entrada, datosHijos, salida;
        int[] mejorHijoFamilias;
        String[] entradas;
        int dePadresAHijos, microMejor, microHijoTotal, numHijos;
        while (familias > 0) {
            salida = "";
            mejorHijoFamilias = new int[familias];

            for (int a = 0; a < familias; a++) {
                entrada = sc.nextLine();
                entradas = entrada.split(" ");
                numHijos = Integer.parseInt(entradas[0]);
                dePadresAHijos = Integer.parseInt(entradas[1]);

                microMejor = 0;

                for (int i = 0; i < numHijos; i++) {
                    microHijoTotal = dePadresAHijos * sc.nextInt();
                    if (microMejor < microHijoTotal) {
                        microMejor = microHijoTotal;
                    }
                }
                sc.nextLine();
                mejorHijoFamilias[a] = microMejor;
            }
            Arrays.sort(mejorHijoFamilias);
            for (int i = mejorHijoFamilias.length - 1; i >= 0; i--) {
                salida = salida + mejorHijoFamilias[i] + " ";
            }
            System.out.println(salida.trim());
            familias = Integer.parseInt(sc.nextLine());
        }
    }

}
