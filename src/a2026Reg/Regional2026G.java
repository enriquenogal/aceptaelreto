/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a2026Reg;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author enriquenogal
 */
public class Regional2026G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            tratarCaso(sc.nextLine(),sc.nextLine());
        }
    }

    private static void tratarCaso(String frase, String nombre) {
        String subCadena;
        char[] c = nombre.toCharArray();
        Arrays.sort(c);
        String nombreOrdenado = new String(c);
        int contador = 0;
        for (int i = 0; i < frase.length() - nombre.length() + 1; i++) {
            subCadena = frase.substring(i, i + nombre.length());
            if (sonIguales(subCadena,nombreOrdenado)) contador++;
        }
        System.out.println(contador);
    }

    private static boolean sonIguales(String subCadena, String nombre) {
        char[] c = subCadena.toCharArray();
        Arrays.sort(c);
        String subCadenaOrdenada = new String(c);
        return subCadenaOrdenada.equals(nombre);
    }
    
    
}
