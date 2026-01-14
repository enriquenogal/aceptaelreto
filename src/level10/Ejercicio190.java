package level10;


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
public class Ejercicio190 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] entradas;
        long dividendo, divisor, resultado;

        entradas = sc.nextLine().split(" ");
        dividendo = Long.parseLong(entradas[0]);
        divisor = Long.parseLong(entradas[1]);

        while (!(divisor > dividendo)) {

            resultado = 1;

            for (long i = dividendo; i > divisor; i--) {
                resultado = resultado * i;
            }

            System.out.println(resultado);

            entradas = sc.nextLine().split(" ");
            dividendo = Long.parseLong(entradas[0]);
            divisor = Long.parseLong(entradas[1]);

        }

    }

}
