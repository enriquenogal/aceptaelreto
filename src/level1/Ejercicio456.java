package level1;


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
public class Ejercicio456 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int medida, minimo, resultado;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            medida = sc.nextInt() * sc.nextInt();
            minimo = sc.nextInt();
            resultado = minimo / medida;
            if (minimo % medida != 0) {
                resultado++;
            }
            System.out.println(resultado);
        }
    }

}
