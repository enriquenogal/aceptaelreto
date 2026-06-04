/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package level10;

import java.util.Scanner;

/**
 *
 * @author enogal
 */
public class Ejercicio844 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f, c;
        String losas;
        while (sc.hasNextLine()) {
            f = sc.nextInt();
            c = sc.nextInt();
            losas = sc.nextLine().trim();
            tratarCaso(f,c,losas);
        }
            
    }

    private static void tratarCaso(int f, int c, String losas) {
        int pos;
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                pos = (j - i) % losas.length();
                if (pos < 0) pos = losas.length() + pos;
                System.out.print(losas.charAt(pos));
            }
            System.out.println();
        }
    }
}
