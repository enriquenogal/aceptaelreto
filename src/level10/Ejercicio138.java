package level10;

//http://www.ecoribera.org/ciencias/matematicas/1-bachillerato/127-calculo-de-los-ceros-de-un-factorial

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
public class Ejercicio138 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        long numero, acumuladorCeros;

        for (long i = 0; i < a; i++) {
            numero = Integer.parseInt(sc.nextLine().trim());
            acumuladorCeros = 0;
            while (numero > 0){
                numero = numero / 5;
                acumuladorCeros+= numero;
            }
            System.out.println(acumuladorCeros);
        }
    }
}
