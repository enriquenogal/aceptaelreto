package level10;


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
public class Ejercicio434 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;
        String entradas[];
        int numero = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numero; i++) {
            entrada = sc.nextLine();
            entradas = entrada.split(" ");
            if (Integer.parseInt(entradas[0]) > Integer.parseInt(entradas[1])){
                System.out.println("PRINCIPIO");
            } else {
                System.out.println("ROMANCE");
            }
        }
    }

}
