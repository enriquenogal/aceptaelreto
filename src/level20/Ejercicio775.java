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
public class Ejercicio775 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n;
        long diaAnterior, diaActual, suma, max;
        do {
            n = sc.nextLong();
            if (n != 0) {
                diaAnterior = n;
                max = diaAnterior;
                do {
                    diaActual = sc.nextLong();
                    if (diaActual != 0) {
                        suma = diaAnterior + diaActual;
                        diaAnterior = diaActual;
                        if (suma > max) {
                            max = suma;
                        }
                    }
                } while (diaActual != 0);
                System.out.println(max);
            }
        } while (n != 0);
    }
}
