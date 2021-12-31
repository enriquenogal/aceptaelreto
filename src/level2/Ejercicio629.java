package level2;


import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio629 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int acum, buffer;
        int[] volumenes;
        int a;
        do {
            n = sc.nextInt();
            if (n != 0) {
                acum = 0;
                buffer = 0;
                volumenes = new int[n];
                for (int i = 0; i < volumenes.length; i++) {
                    volumenes[i] = sc.nextInt();
                }

                for (int i = volumenes.length - 1; i >= 0; i--) {
                    if (buffer > 0) {
                        acum++;
                        buffer--;
                    }
                    if (volumenes[i] > buffer) {
                        buffer = volumenes[i];
                    }
                }
                System.out.println(acum);
            }
        } while (n != 0);

    }
}
