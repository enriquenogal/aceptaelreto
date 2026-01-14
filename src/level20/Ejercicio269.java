package level20;


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
public class Ejercicio269 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = Integer.parseInt(sc.nextLine().trim());
        int resultado, anterior, nuevo, dia;
        String entrada;
        String[] entradas;
        
        for (int i = 0; i < numero; i++) {
            resultado = 0;
            anterior = 0;
            entrada = sc.nextLine();
            entradas = entrada.split(" ");
            for (int j = 0; j < entradas.length - 1; j++) {
                nuevo = Integer.parseInt(entradas[j]) * 2;
                dia = anterior + nuevo;
                anterior = dia;
                resultado+= dia;
            }
            System.out.println(resultado);         
        }
    }
    
}
