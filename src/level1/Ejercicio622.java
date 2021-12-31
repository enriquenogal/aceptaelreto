package level1;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio622 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int suma;
        int promesa;
        double objetivo;
        do {
            n = sc.nextInt();
            if (n != 0) {
                suma = 0;
                for (int i = 0; i < n; i++) {
                    suma += sc.nextInt();
                }
                promesa = sc.nextInt();
                objetivo = (promesa * (n + 1)) - suma;
                if (objetivo > 10 || objetivo < 0 || objetivo % 1 != 0) {
                    System.out.println("IMPOSIBLE");
                } else {
                    System.out.println((int)objetivo);
                } 
            }
        } while (n != 0);

    }

}
