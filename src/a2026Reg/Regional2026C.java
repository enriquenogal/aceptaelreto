/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a2026Reg;

import java.util.Scanner;

/**
 *
 * @author enriquenogal
 */
public class Regional2026C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            tratarCaso(sc.nextInt());
        }
    }

    private static void tratarCaso(int numero) {
        int baseWinner = 0;
        int min = Integer.MAX_VALUE;
        int nCifras;
        for (int base = 2; base <= 10; base++) {
            nCifras = numCifras(numero, base);
            if (nCifras < min) {
                baseWinner = base;
                min = nCifras;
            }
        }
        System.out.println(baseWinner);
    }

    private static int numCifras(int numero, int base) {
        int numCifras = 0;
        String s = Integer.toString(numero, base);
        for (int i = 0; i < s.length(); i++) {
            numCifras += Character.getNumericValue(s.charAt(i));
        }
        numCifras += s.length() - 1;
        return numCifras;
    }

}
