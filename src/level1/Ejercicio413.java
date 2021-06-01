package level1;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
public class Ejercicio413 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ancho, alto, total;

        for (int i = 0; i < n; i++) {
            ancho = sc.nextInt();
            alto = sc.nextInt();
            total = ancho * alto;
            if (total % 2 == 0) {
                System.out.println(total / 2 + " " + total / 2);
            } else {
                System.out.println((total / 2) + 1 + " " + total / 2);
            }

        }
    }
}
