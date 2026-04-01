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
public class Regional2026Av1_mal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;
        while (sc.hasNextLine()) {
            entrada = sc.nextLine();
            System.out.println(calcula(entrada, 0));
        }
    }

    private static long calcula(String entrada, int posicion) {
        if (posicion >= entrada.length()) return 0; 
        else if (entrada.charAt(posicion) == ']') return 0;
        else if (entrada.charAt(posicion) == '[') return calcula(entrada, posicion + 1);
        else if (Character.isAlphabetic(entrada.charAt(posicion))) return 1 + calcula(entrada, posicion + 1);
        else return Character.getNumericValue(entrada.charAt(posicion)) * calcula(entrada, posicion + 1);
    }
}
