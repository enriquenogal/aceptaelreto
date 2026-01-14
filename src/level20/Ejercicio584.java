/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level20;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Ejercicio584 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int horas, encendidos, horasEncendidos, totalHorasEncendidos;
        for (int i = 0; i < n; i++) {
            horas = sc.nextInt();
            encendidos = sc.nextInt();
            horasEncendidos = sc.nextInt();
            sc.nextLine();
            totalHorasEncendidos = encendidos * horasEncendidos;
            if (horas > totalHorasEncendidos) {
                System.out.println("ENCENDIDOS");
            } else if (horas < totalHorasEncendidos) {
                System.out.println("HORAS");
            } else {
                System.out.println("AMBAS");
            }
        }   
    }
}
