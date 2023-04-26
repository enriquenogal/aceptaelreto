package level1;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio676 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ini, fin;
        int contNB, contB;
        for (int i = 0; i < n; i++) {
            ini = sc.nextInt();
            fin = sc.nextInt();
            contNB = 0;
            contB = 0;
            for (int j = ini; j <= fin; j++) {
                if (isBisiesto(j)) {
                    contB++;
                } else {
                    contNB++;
                }
            }
            System.out.println(contNB + " " + contB);
        }
    }

    public static boolean isBisiesto(int n) {
        if (n % 4 == 0 && n % 100 != 0) {
           return true; 
        } else if (n % 4 == 0 && n % 100 == 0 && n % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
