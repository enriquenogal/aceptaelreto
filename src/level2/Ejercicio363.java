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
public class Ejercicio363 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entreno = -1, comidas, acumulador, resultado;

        while (entreno != 0) {
            entreno = sc.nextInt();
            if (entreno != 0) {
                comidas = sc.nextInt();
                acumulador = 0;
                for (int i = 0; i < comidas; i++) {
                    acumulador += sc.nextInt();
                }
                resultado = acumulador / entreno;
                if (acumulador % entreno != 0) {
                    resultado++;
                }
                System.out.println(resultado);
            }
        }
    }
}
