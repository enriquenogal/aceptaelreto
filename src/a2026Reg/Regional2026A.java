/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a2026Reg;

import java.util.Scanner;

/**
 *
 * @author enogal
 */
public class Regional2026A {

    static int posicion;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;
        long r;
        while (sc.hasNextLine()) {
            entrada = sc.nextLine();
            r = 0;
            posicion = 0;
            while (posicion < entrada.length()) {
                r += calcula(entrada);
            }
            System.out.println(r);
        }
    }

    private static long calcula(String entrada) {
        long suma = 0;
        while (posicion < entrada.length()) {
            char c = entrada.charAt(posicion);
            if (c == ']') {
                posicion++;
                return suma;
            } else if (c == '[') {
                posicion++;
                suma += calcula(entrada);
            } else if (Character.isAlphabetic(c)) {
                posicion++;
                suma += 1;
            } else if (Character.isDigit(c)) {
                int num = Character.getNumericValue(c);
                posicion++;
                if (posicion < entrada.length() && entrada.charAt(posicion) == '[') {
                    posicion++; // saltar '['
                    long bloque = calcula(entrada);
                    suma += num * bloque;
                }
            }
        }
        return suma;
    }
}
