package level20;


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
public class Ejercicio435 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;
        int[] contadores = new int[10];
        boolean encontrado = false;
        int n;

        while (sc.hasNextLine()) {
            entrada = sc.nextLine();
            encontrado = false;

            for (int i = 0; i < contadores.length; i++) {
                contadores[i] = contarOcurrencias(entrada, i);
                if (i > 0) {
                    if (contadores[0] != contadores[i]) {
                        encontrado = true;
                    }
                }
            }

            if (encontrado) {
                System.out.println("no subnormal");
            } else {
                System.out.println("subnormal");
            }

        }
    }

    public static int contarOcurrencias(String s, int n) {
        int contador = 0;
        char c = Character.forDigit(n, 10);
        for (int i = 0; i < s.length(); i++) {
            if (c == s.charAt(i)) {
                contador++;
            }
        }
        return contador;
    }

}
