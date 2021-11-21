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
public class Ejercicio300 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = Integer.parseInt(sc.nextLine().trim());
        String entrada;
        for (int i = 0; i < numero; i++) {
            entrada = sc.nextLine().toLowerCase();
            if (contarOcurrencias(entrada, 'a') > 0
                    && contarOcurrencias(entrada, 'e') > 0
                    && contarOcurrencias(entrada, 'i') > 0
                    && contarOcurrencias(entrada, 'o') > 0
                    && contarOcurrencias(entrada, 'u') > 0) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }

    }

    public static int contarOcurrencias(String entrada, char c) {
        int contador = 0;
        for (int i = 0; i < entrada.length(); i++) {
            if (entrada.charAt(i) == c) {
                contador++;
            }
        }
        return contador;
    }

}
