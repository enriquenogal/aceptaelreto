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
public class Ejercicio607 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int frasesEscritas, frastesRequeridas, operacionesCopia;
        for (int i = 0; i < n; i++) {
            frasesEscritas = 1;
            operacionesCopia = 0;
            frastesRequeridas = sc.nextInt();
            while (frasesEscritas < frastesRequeridas) {
                frasesEscritas = frasesEscritas * 2;
                operacionesCopia++;
            }
            System.out.println(operacionesCopia);           
        }      
    }
}
