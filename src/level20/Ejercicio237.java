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
public class Ejercicio237 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;
        boolean polidivisible;
        while (sc.hasNextLine()) {
            entrada = sc.nextLine();
            polidivisible = true;
            for (int i = entrada.length(); i > 0; i--) {
                entrada = entrada.substring(0, i);
                if (Long.parseLong(entrada) % entrada.length() != 0) {
                    polidivisible = false;
                    break;
                }
            }
            if (polidivisible) {
                System.out.println("POLIDIVISIBLE");
            } else {
                System.out.println("NO POLIDIVISIBLE");
            }
        }
    }
}