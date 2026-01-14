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
public class Ejercicio474 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;
        String entradas[];
        int comisaria, bomba1, bomba2, dist1, dist2;
        int numero = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numero; i++) {
            entrada = sc.nextLine();
            entradas = entrada.split(" ");
            comisaria = Integer.parseInt(entradas[0]);
            bomba1 = Integer.parseInt(entradas[1]);
            bomba2 = Integer.parseInt(entradas[2]);
            dist1 = Math.abs(comisaria-bomba1) + Math.abs(bomba1-bomba2);
            dist2 = Math.abs(comisaria-bomba2) + Math.abs(bomba1-bomba2);
            System.out.println(Math.min(dist1, dist2));
        }       
    }
}
