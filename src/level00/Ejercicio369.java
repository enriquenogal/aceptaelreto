package level00;


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
public class Ejercicio369 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = Integer.parseInt(sc.nextLine());
            if (n!=0) {
                for (int i = 0; i < n; i++) {
                    System.out.print("1");
                }
                System.out.println("");
            }        
        } while (n!=0);        
    }
}
