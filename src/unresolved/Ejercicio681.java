//WA

package unresolved;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio681 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[] escaleras;
        while (sc.hasNextInt()) {
            n = sc.nextInt();
            escaleras = new int[n];
            for (int i = 0; i < n; i++) {
                escaleras[i] = sc.nextInt();
            }
            tratarCaso(escaleras);
        }
    }

    public static void tratarCaso(int[] escaleras) {
        int escalones = 0;
        Arrays.sort(escaleras);
        for (int i = escaleras.length - 1; i >= 0; i--) {
            if (i != escaleras.length - 1 && escaleras[i] >= escaleras[i + 1]) {
                escaleras[i] =  escaleras[i + 1] - 1;
            }
            if (escaleras[i] > 0) {
                escalones += escaleras[i];
            } else {
                break;
            }
        }
        System.out.println(escalones);
    }
}
