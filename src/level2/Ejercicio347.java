package level2;


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
public class Ejercicio347 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = -1, b = -1, resultado;
        boolean salir;

        while (!(a == 0 && b == 0)) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (!(a == 0 && b == 0)) {
                resultado = 0;
                salir = false;
                while (salir == false) {
                    if (a >= 10 && b >= 10) {
                        if (a < b) {
                            resultado += b / a;
                            b = b - ((b / a) * a);
                        } else if (b < a) {
                            resultado += a / b;
                            a = a - ((a / b) * b);
                        } else {
                            resultado++;
                            salir = true;
                        }
                    } else {
                        salir = true;
                    }
                }
                System.out.println(resultado);
            }
        }
    }
}
