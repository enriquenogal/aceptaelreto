package level1;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enriquenogal
 */
public class Ejercicio716 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, regleta, suma;
        do {
            n = sc.nextInt();
            if (n != 0) {
                suma = 0;
                for (int i = 0; i < n; i++) {
                    regleta = sc.nextInt();
                    suma += (regleta - 1);
                }
                suma++;
                System.out.println(suma);
            }
        } while (n != 0);
    }
}
