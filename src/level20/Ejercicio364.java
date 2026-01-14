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
public class Ejercicio364 {

    public static void main(String[] args) {
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Scanner sc = new Scanner(System.in);
        String entrada = "";
        String salida;

        while (!entrada.equals("FIN")) {
            entrada = sc.nextLine();
            salida = "";
            if (!entrada.equals("FIN")) {
                for (int i = 0; i < entrada.length(); i++) {
                    if (entrada.charAt(i) == ' ') {
                        salida += " ";
                    } else {
                        salida += alfabeto.charAt((alfabeto.indexOf(entrada.charAt(i)) + 1) % alfabeto.length());
                    }
                }
                System.out.println(salida);
            }
        }
    }
}
