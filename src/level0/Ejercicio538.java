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
public class Ejercicio538 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=-1, b=-1;    
        while (!(a==0 && b==0)){
            a = sc.nextInt();
            b = sc.nextInt();
            if (!(a==0 && b==0)){
                if (a>=b) {
                    System.out.println("CUERDO");
                } else {
                    System.out.println("SENIL");
                }
            }   
        } 
    }

}
