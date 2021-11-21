package level2;


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
public class Ejercicio605 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int verano = 0, invierno = 0, ambas = 0;
        String dato;
        do {
            dato = sc.next();
            if (dato.equals(".")) {
                if (verano == 0 && invierno == 0 && ambas == 0) {
                    break;
                } else {
                    if (verano > invierno) {
                        System.out.println("VERANO");
                    } else if (verano < invierno) {
                        System.out.println("INVIERNO");
                    } else {
                        System.out.println("EMPATE");
                    }
                    verano = 0;
                    invierno = 0;
                    ambas = 0;
                }
            } else {
                if (dato.equals("V")) {
                    verano++;
                } else if (dato.equals("I")) {
                    invierno++;
                } else {
                    ambas++;
                }

            }
        } while (true);
    }
}
