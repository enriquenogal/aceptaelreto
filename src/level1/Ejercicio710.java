package level1;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enogal
 */
public class Ejercicio710 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total, suma, disponibles;
        for (int i = 0; i < n; i++) {
            total = sc.nextInt();
            suma = 0;
            for (int j = 0; j < 6; j++) {
                suma += sc.nextInt();
            }
            disponibles = total - suma;
            System.out.println(disponibles);
        }
    }
}
