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
public class Ejercicio485 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = "";
        String[] entradas;
        int acumulador, acumuladorResto, anterior, print;

        while (!entrada.equals("0")) {
            entrada = sc.nextLine();
            if (!entrada.equals("0")) {
                acumulador = 0;
                acumuladorResto = 0;
                entradas = sc.nextLine().split(" ");
                for (int i = 0; i < entradas.length; i++) {
                    acumulador += Integer.parseInt(entradas[i]);
                }
                anterior = 0;
                for (int i = 0; i < entradas.length; i++) {
                    acumuladorResto += anterior;
                    anterior = Integer.parseInt(entradas[i]);
                    print = acumulador - acumuladorResto;
                    System.out.print(print);
                    if (i != entradas.length - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
}
