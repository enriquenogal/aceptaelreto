package unresolved;

//Time limit exceeded (TLE)

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
public class Ejercicio402 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long piezas = 1;
        int lado1;
        double lado2;

        while (piezas > 0) {
            piezas = Long.parseLong(sc.nextLine());
            if (piezas > 0) {
                lado1 = (int) Math.sqrt(piezas);
                if (lado1 * lado1 != piezas) {
                    for (; lado1 < piezas; lado1++) {
                        lado2 = (double) piezas / lado1;
                        if (lado2 == (int) lado2) {
                            break;
                        }
                    }
                }
                //System.out.println(lado1 + "x" + lado2 + " = " + (lado1 * lado2));
                System.out.println(lado1);
            }
        }
    }
}
