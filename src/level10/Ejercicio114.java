package level10;


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
public class Ejercicio114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n;
        for (int i = 0; i < m; i++) {
            n = sc.nextInt();
            if (n>=5){
                System.out.println("0");
            } else if (n ==4){
                System.out.println("4");
            } else if (n == 3){
                System.out.println("6");
            } else if (n == 2){
                System.out.println("2");
            } else {
                System.out.println("1");
            }
        } 
    } 
}
