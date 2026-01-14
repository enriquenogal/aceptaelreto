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
public class Ejercicio372 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = Integer.parseInt(sc.nextLine().trim());
        String entrada;
        char[] aEntrada, aSalida;
        for (int i = 0; i < numero; i++) {
            entrada = sc.nextLine();
            aEntrada = entrada.toCharArray();
            aSalida = new char[aEntrada.length];
            for (int j = 0; j < aEntrada.length; j++) {
                if (Character.isLowerCase(aEntrada[j])){             
                    aSalida[j] = Character.toLowerCase(aEntrada[aEntrada.length-1-j]);                  
                } else {
                    aSalida[j] = Character.toUpperCase(aEntrada[aEntrada.length-1-j]);
                }
            }
            System.out.println(aSalida);
        }
    } 
}
