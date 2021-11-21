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
public class Ejercicio481 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] c = {'0','h','g','f','e','d','c','b','a'};
        String entrada = "";
        String[] entradas;
        while (!entrada.equals("0 0")){
            entrada = sc.nextLine();
            if (!entrada.equals("0 0")){
                entradas = entrada.split(" ");
                System.out.println(c[Integer.parseInt(entradas[0])] + entradas[1]);
            }
        }  
    }
}
