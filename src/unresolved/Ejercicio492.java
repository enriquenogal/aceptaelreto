package unresolved;

//Time limit exceeded (TLE)

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
public class Ejercicio492 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, fin, cont;
        do {
            a = sc.nextInt();
            b = sc.nextInt();
            fin = sc.nextInt();
            cont = 0;
            if (!(a == 0 && b == 0 && fin == 0)) {
                cont = 0;
                for (int i = 1; i <= fin; i++) {
                    if (i % a == 0 && i % b == 0) {
                        cont++;
                    }
                }
                System.out.println(cont);
            }
        } while (!(a == 0 && b == 0 && fin == 0));

    }
}
