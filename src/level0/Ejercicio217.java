package level0;


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
public class Ejercicio217 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 1;
        while (numero > 0) {
            numero = Integer.parseInt(sc.nextLine());
            if (numero > 0 && numero % 2 == 0) {
                System.out.println("DERECHA");
            } else if (numero > 0 && numero % 2 == 1) {
                System.out.println("IZQUIERDA");
            }
        }
    }
}
