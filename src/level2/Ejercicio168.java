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
public class Ejercicio168 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio = 1, posicion;
        String[] entradas;
        int[] piezas;

        while (inicio > 0) {
            inicio = Integer.parseInt(sc.nextLine());

            if (inicio > 0) {
                piezas = new int[inicio];
                entradas = sc.nextLine().split(" ");
                for (int i = 0; i < entradas.length; i++) {
                    piezas[Integer.parseInt(entradas[i])-1] = 1;
                }
                posicion = 0;
                for (int i = 0; i < piezas.length; i++) {
                    if (piezas[i] == 0) {
                        posicion = i + 1;
                        break;
                    }
                }
                System.out.println(posicion);
            }
        }
    }
}
