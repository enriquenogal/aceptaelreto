package level10;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enriquenogal
 */
public class Ejercicio715 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nUvas, nPersonas;
        for (int i = 0; i < n; i++) {
            nUvas = sc.nextInt();
            nPersonas = sc.nextInt();
            if (nUvas / nPersonas >= 12) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}
