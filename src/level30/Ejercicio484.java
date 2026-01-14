package level30;


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
public class Ejercicio484 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada, salidaI, salidaD, salida;
        boolean ceros, decimal;

        while (sc.hasNextLine()) {
            salida = "";
            decimal = true;
            ceros = true;
            salidaI = "";
            salidaD = "";
            entrada = sc.nextLine();
            int posicionDecimal = entrada.indexOf(".");
            if (posicionDecimal == -1) {
                posicionDecimal = entrada.length();
                decimal = false;
            }
            for (int i = 0; i < posicionDecimal; i++) {
                if (ceros == true && entrada.charAt(i) == '0') {
                    ceros = true;
                } else if (ceros == true && entrada.charAt(i) != '0') {
                    ceros = false;
                    salidaI = salidaI + entrada.charAt(i);
                } else if (ceros == false) {
                    salidaI = salidaI + entrada.charAt(i);
                }

            }
            if (decimal) {
                ceros = true;                
                for (int i = entrada.length() - 1; i > posicionDecimal; i--) {
                    if (ceros == true && entrada.charAt(i) == '0') {
                        ceros = true;
                    } else if (ceros == true && entrada.charAt(i) != '0') {
                        ceros = false;
                        salidaD = entrada.charAt(i) + salidaD;
                    } else if (ceros == false) {
                        salidaD = entrada.charAt(i) + salidaD;
                    }
                }

            }
            if (salidaI.equals("")) {
                salida = "0";
            } else {
                salida = salidaI;
            }
            if (!salidaD.equals("")) {
                salida = salida + "." + salidaD;
            }
            System.out.println(salida);
        }
    }
}
