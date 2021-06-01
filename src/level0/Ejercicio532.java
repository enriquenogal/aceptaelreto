package level0;


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
public class Ejercicio532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a,b;
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(b-a);      
        }
    }
}
