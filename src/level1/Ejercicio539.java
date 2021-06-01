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
public class Ejercicio539 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c;
        String[] entradas;
        while (sc.hasNextLine()) {
            entradas = sc.nextLine().split(" ");
            c = (Integer.parseInt(entradas[1]) - Integer.parseInt(entradas[0])) % 10;
            if (c == 9) {
                System.out.println("FELIZ DECADA NUEVA");
            } else {
                System.out.println("TOCA ESPERAR");
            }
        }
    }
}
