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
public class Regional2026E {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String[] datos;
        do {
            n = sc.nextInt();
            if (n != 0) {
                datos = sc.nextLine().split(" ");
                tratarCaso(datos);
            }
        } while (n != 0);
    }

    private static void tratarCaso(String[] datos) {
        
    }
}
