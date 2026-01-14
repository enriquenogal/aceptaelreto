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
public class Ejercicio165 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = Integer.parseInt(sc.nextLine());
        int aux;
        String s;
        boolean hyperpar;

        while (numero >= 0) {
            hyperpar = true;
            s = Integer.toString(numero);
            for (int i = 0; i < s.length(); i++) {
                aux = Character.getNumericValue(s.charAt(i));
                if (aux % 2 == 1) {
                    hyperpar = false;
                    break;
                }
            }
            if (hyperpar) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
            numero = Integer.parseInt(sc.nextLine());
        }

    }

}
