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
public class Ejercicio533 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int botellasEvitar, acumulador, posicion, entrada, posicionExcede;
        boolean encontrado;
        for (int i = 0; i < n; i++) {
            botellasEvitar = sc.nextInt() * 8;
            entrada = -1;
            acumulador = 0;
            posicion = 0;
            posicionExcede = 0;
            encontrado = false;
            while (entrada != 0 && encontrado == false) {
                entrada = sc.nextInt();
                if (entrada != 0) {
                    posicion++;
                    acumulador += entrada;
                    if (acumulador >= botellasEvitar) {
                        posicionExcede = posicion;
                        encontrado = true;
                    }
                }
            }
            sc.nextLine();
            if (posicionExcede == 0) {
                System.out.println("SIGAMOS RECICLANDO");
            } else {
                System.out.println(posicionExcede);
            }

        }
    }

}
