package unresolved;

//Time limit exceeded (TLE)

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
public class Ejercicio397 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = Integer.parseInt(sc.nextLine());
        int entrada;
        String text = "";
        for (int i = 0; i < numero; i++) {
            entrada = Integer.parseInt(sc.nextLine());
            text = "";
            for (int j = 1; j <= entrada; j++) {
                if (!(j % 3 == 0)) {
                    text = text + j;
                }
            }
            if (divisible3(text) || text.equals("")) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }

    }

    public static boolean divisible3(String text) {
        if (text.equals("")) {
            return true;
        }
        long acumulador = 0;
        for (int i = 0; i < text.length(); i++) {
            acumulador += Character.getNumericValue(text.charAt(i));
        }
        return acumulador % 3 == 0;
    }
}
