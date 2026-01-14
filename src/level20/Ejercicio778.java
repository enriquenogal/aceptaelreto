package level20;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio778 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n;
        long cont;
        long numAnt, num, max;
        do {
            n = sc.nextLong();
            if (n != 0) {
                numAnt = sc.nextLong();
                cont = 1;
                max = numAnt;
                for (long i = 1; i < n; i++) {
                    num = sc.nextLong();
                    if (num < max) {
                        cont = 0;
                    } else if (num >= numAnt) {
                        cont++;
                    } else {
                        cont = 1;
                    }
                    if (num > max) {
                        max = num;
                    }
                    
                }
                System.out.println(cont);
            }
        } while (n != 0);
    }
}
