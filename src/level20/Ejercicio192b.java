package level20;

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
public class Ejercicio192b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = -1;
        boolean resultado, salir;
        while (n != 0) {
            n = sc.nextInt();
            if (n != 0) {
                resultado = false;
                salir = false;
                while (salir == false) {
                    if (n % 10 == 6 || n % 10 == 1) {
                        resultado = true;
                        salir = true;
                    } else if (n % 3 == 0) {
                        n = n / 3;
                    } else if (n > 6) {
                        n = n - 5;
                    } else {
                        salir = true;
                    }
                }
                if (resultado) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
