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
public class Ejercicio371 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio = 1, contador;
        
        while (inicio!=0) {
            inicio = Integer.parseInt(sc.nextLine());
            if (inicio!=0){
                contador = 0;
                for (int i = 1; i <= inicio; i++) {
                    contador+= i * 3;
                }
                System.out.println(contador);    
            }
        } 
    }
    
}
