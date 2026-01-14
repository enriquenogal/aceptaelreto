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
public class Ejercicio157 {
    public static void main(String[] args) {
        int[] meses = {31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner sc = new Scanner(System.in);
        int numero = Integer.parseInt(sc.nextLine());
        String entradas[];
        int dia, mes;
        for (int i = 0; i < numero; i++) {
            entradas = sc.nextLine().split(" ");
            dia = Integer.parseInt(entradas[0]);
            mes = Integer.parseInt(entradas[1]);
            for (int j = 0; j < mes - 1; j++) {
                dia = dia + meses[j];            
            }
            System.out.println((365 - dia));
        }
    }
}
