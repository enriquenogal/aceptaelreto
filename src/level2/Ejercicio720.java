package level2;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enriquenogal
 */
public class Ejercicio720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int suma;
        long num, numAnterior;
        while (sc.hasNext()) {
            n = sc.nextInt();
            sc.nextLine();
            suma = 1;
            numAnterior = sc.nextLong();
            for (int i = 1; i < n; i++) {
                num = sc.nextLong();
                if (num >= numAnterior) {
                    suma++;
                } else {
                    suma = 1;
                }
                numAnterior = num;
            }
            sc.nextLine();
            //System.out.println(suma);
            
            while (n > 1) {
                if (n <= suma) {
                    break;
                }
                n = n / 2;
            }
            System.out.println(n);
            
            
        }
    }
}
