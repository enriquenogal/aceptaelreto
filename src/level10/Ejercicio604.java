package level10;


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
public class Ejercicio604 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        char carta;
        char palo;
        int valor;
        int suma;
        int C, D, P, T;
        for (int i = 0; i < n; i++) {
            suma = C = D = P = T = 0;
            for (int j = 0; j < 13; j++) {
                carta = sc.next().charAt(0);
                palo = sc.next().charAt(0);
                valor = 0;
                if (carta == 'A') valor = 4;
                else if (carta == 'J') valor = 1;
                else if (carta == 'Q') valor = 2;
                else if (carta == 'K') valor = 3;
                if (palo == 'C') C++;
                else if (palo == 'D') D++;
                else if (palo == 'P') P++;
                else if (palo == 'T') T++;
                suma += valor;
            }
            if (C == 0) suma += 3;
            else if (C == 1) suma += 2;
            else if (C == 2) suma += 1;
            if (D == 0) suma += 3;
            else if (D == 1) suma += 2;
            else if (D == 2) suma += 1;
            if (P == 0) suma += 3;
            else if (P == 1) suma += 2;
            else if (P == 2) suma += 1;
            if (T == 0) suma += 3;
            else if (T == 1) suma += 2;
            else if (T == 2) suma += 1;
            
            sc.nextLine();
            
            System.out.println(suma);
        }
    }
    
}
