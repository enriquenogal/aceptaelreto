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
public class Ejercicio140 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numero = sc.nextLine().trim();
        long acumuladorEntero;
        String acumuladorTexto;
        while (Integer.parseInt(numero) >= 0) {
            acumuladorEntero = 0;
            acumuladorTexto = "";
            for (int i = 0; i < numero.length(); i++) {
                acumuladorEntero += Character.getNumericValue(numero.charAt(i));
                acumuladorTexto += numero.charAt(i);
                if (i != numero.length() - 1) {
                    acumuladorTexto += " + ";
                }
            }
            System.out.println(acumuladorTexto + " = " + acumuladorEntero);
            numero = sc.nextLine().trim();
        }
    }
}
