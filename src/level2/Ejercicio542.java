package level2;


import java.util.Arrays;
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
public class Ejercicio542 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] juguete, caja;
        for (int i = 0; i < n; i++) {
            juguete = new int[3];
            juguete[0] = sc.nextInt();
            juguete[1] = sc.nextInt();
            juguete[2] = sc.nextInt();
            caja = new int[3];
            caja[0] = sc.nextInt();
            caja[1] = sc.nextInt();
            caja[2] = sc.nextInt();
            Arrays.sort(juguete);
            Arrays.sort(caja);
            if (caja[0] > juguete[0] && caja[1] > juguete[1] && caja[2] > juguete[2]) {
                System.out.println("SIRVE");
            } else {
                System.out.println("NO SIRVE");
            }
        }
    }
}