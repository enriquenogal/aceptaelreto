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
public class Ejercicio155 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        
        while (x>=0 && y>=0){
            x = sc.nextInt();
            y = sc.nextInt();
            if (x>=0 && y>=0) {
                System.out.println(2* Math.abs(x) + 2* Math.abs(y));     
            }

        }        
    }
    
}
