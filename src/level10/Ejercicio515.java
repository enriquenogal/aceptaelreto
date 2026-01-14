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
public class Ejercicio515 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = -1;
        
        while (n!=0) {
            n = sc.nextInt();
            if (n!=0){
                if (n%2 == 0){
                    System.out.println(n);
                } else if (n==1) {
                    System.out.println(1);
                } else {
                    System.out.println(n-1);
                }
            }
        }
    }    
}
