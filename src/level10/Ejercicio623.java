package level10;


import java.util.Arrays;
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
public class Ejercicio623 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] premio;
        String[] juego;
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            premio = sc.next().split("");
            juego = sc.next().split("");
            if (iguales(premio,juego)) {
                System.out.println("GANA");
            } else {
                System.out.println("PIERDE");
            }
        }
    }
    
    public static boolean iguales(String[] a, String[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }
    
}
