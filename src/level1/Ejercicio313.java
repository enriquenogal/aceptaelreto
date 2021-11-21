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
public class Ejercicio313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] entradas;
        int resultado;
        for (int i = 0; i < n; i++) {
            resultado = 0;
            entradas = sc.nextLine().split(" ");
            resultado = Integer.parseInt(entradas[0]) + Integer.parseInt(entradas[1]);
            if (resultado >= 0) {
                System.out.println("SI");                
            } else {
                System.out.println("NO");
            }
        }     
    }
    
}
