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
public class Ejercicio512 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int conejo,caballo,resultado;
        int numero = sc.nextInt();
        for (int i = 0; i < numero; i++) {
            conejo = sc.nextInt();
            caballo = sc.nextInt();   
            caballo = caballo + conejo;
            resultado = conejo*100/caballo;
            System.out.println(resultado);
        }
    }
    
}
