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
public class Ejercicio428 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long entrada1;
        String base5;
        int contador;
        int numero = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numero; i++) {
            entrada1 = Long.parseLong(sc.nextLine());
            base5 = Long.toString(entrada1, 5);
            contador = 0;
            for (int j = 0; j < base5.length(); j++) {
                if (base5.charAt(j) == '4'){
                    contador++;
                }
            }
            if (contador>1) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

        }
    }
}
