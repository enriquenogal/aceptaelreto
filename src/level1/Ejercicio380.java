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
public class Ejercicio380 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numero = sc.nextLine();
        String[] entradas;
        int acumulador;
        while (!numero.equals("0")){
            acumulador = 0;
            entradas = sc.nextLine().split(" ");
            for (int i = 0; i < entradas.length; i++) {
                acumulador+= Integer.parseInt(entradas[i]);
            }
            System.out.println(acumulador);
            numero = sc.nextLine();
        }
        
    }
    
}
