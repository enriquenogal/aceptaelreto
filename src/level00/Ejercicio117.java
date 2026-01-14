package level00;


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
public class Ejercicio117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;
        String entradas[];
        int numero = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numero; i++) {
            entrada = sc.nextLine();
            entradas = entrada.split(" ");
            System.out.println("Hola, " + entradas[1] + ".");
        }       
    }
}
