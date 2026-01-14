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
public class Ejercicio544c {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nUvas, resultado;
        long pesoMax;
        long anterior, siguiente;

        while (sc.hasNextLine()) {
            nUvas = sc.nextInt();
            pesoMax = sc.nextLong();
            sc.nextLine();
            resultado = 0;
            siguiente = 0;
            anterior = 0;
            for (int i = 0; i < nUvas; i++) {
                siguiente = sc.nextLong();
                if (siguiente <= pesoMax) {
                    if (anterior + siguiente <= pesoMax) {
                        resultado++;
                        anterior = Math.max(anterior, siguiente);
                    } else {
                        anterior = Math.min(anterior, siguiente);
                    }
                }
            }
            sc.nextLine();

            System.out.println(resultado);
        }
    }
}
