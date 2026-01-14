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
public class Ejercicio540 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nPisos, nEscalones, nPisosSubidos, nEscalonesSubidos, total, bajados;

        for (int i = 0; i < n; i++) {
            nPisos = sc.nextInt();
            nEscalones = sc.nextInt();
            nPisosSubidos = sc.nextInt();
            nEscalonesSubidos = sc.nextInt();    
            
            bajados = (nPisosSubidos * nEscalones) + nEscalonesSubidos;
            total = (nPisos * nEscalones) + bajados;
            
            System.out.println(bajados + " " + total);
        }
    }   
}
