package level30;


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
public class Ejercicio405 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String salida;
        int actual, anterior, siguiente, distanciaAnterior;
        boolean enRacha;

        actual = sc.nextInt();
        while (actual != 0) {
            if (actual != 0) {
                salida = "";
                anterior = -1;
                enRacha = false;
                while (actual != 0) {
                    siguiente = sc.nextInt();
                    distanciaAnterior = actual - anterior;
                    if (distanciaAnterior > 1 && enRacha == false) {
                        salida = salida + "," + actual;
                        enRacha = false;
                    }
                    if (distanciaAnterior > 1 && enRacha == true) {
                        salida = salida + "-" + anterior + "," + actual;
                        enRacha = false;
                    }
                    if (distanciaAnterior == 1) {
                        enRacha = true;
                    }
                    if (distanciaAnterior == 1 && siguiente == 0) {
                        salida = salida + "-" + actual;
                        enRacha = true;
                    }
                    anterior = actual;
                    actual = siguiente;
                }
                sc.nextLine();
                actual = sc.nextInt();
                System.out.println(salida.substring(1));
            }
        }

    }

}
