/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a2025Las12Uvas;

import java.util.Scanner;

/**
 *
 * @author enriquenogal
 */
public class Ejercicio831 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            tratarCaso(sc.nextInt());
        }
    }

    private static void tratarCaso(int nFila) {
        int nInicio = (nFila * (nFila -1) / 2) + 1;
        int longitud = nFila - 1;
        for (int i = nInicio; i < nInicio + nFila; i++) {
            longitud += Integer.toString(i).length();
        }
        System.out.println(longitud);
    }
}
