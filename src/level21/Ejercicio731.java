package level21;


import java.util.HashSet;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enriquenogal
 */
public class Ejercicio731 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
            if (n != 0)
            tratarCaso(n, sc);
        } while (n != 0);
    }

    private static void tratarCaso(int n, Scanner sc) {
        int hoja;
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            hoja = sc.nextInt();
            if (hoja % 2 == 0) hoja--;
            hs.add(hoja);
        }
        System.out.println(hs.size());
    }
}
