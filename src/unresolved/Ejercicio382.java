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
public class Ejercicio382 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = Integer.parseInt(sc.nextLine());
        long longitud, nAntenas, antena, radioCobertura, inicio;
        boolean cubre;

        for (int i = 0; i < numero; i++) {
            longitud = sc.nextLong();
            nAntenas = sc.nextLong();
            sc.nextLine();
            cubre = true;
            inicio = 0;
            antena = 0;
            radioCobertura = 0;
            for (int j = 0; j < nAntenas; j++) {
                antena = sc.nextLong();
                radioCobertura = sc.nextLong();
                if (inicio < antena - radioCobertura) {
                    cubre = false;
                } else {
                    cubre = true;
                    if (antena + radioCobertura > inicio) {
                        inicio = antena + radioCobertura;
                    }
                }
                //System.out.println(cubre);
            }
            if (cubre) {
                if (antena + radioCobertura < longitud) {
                    cubre = false;
                }
            }
            if (cubre) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
            sc.nextLine();
        }
    }
}
