package level2;


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
public class Ejercicio156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio = 1, contador;
        String[] entradas;
        
        while (inicio>=0) {
            entradas = sc.nextLine().split(" ");
            inicio = Integer.parseInt(entradas[0]);
            if (inicio>=0){
                contador = 0;
                for (int i = 1; i < entradas.length - 1; i++) {
                    contador+= Math.abs(inicio - Integer.parseInt(entradas[i]));
                    inicio = Integer.parseInt(entradas[i]);
                }
                System.out.println(contador);    
            }
        } 
    }
    
}
