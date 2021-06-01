package level3;


import java.util.ArrayList;
import java.util.Collections;
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
public class Ejercicio325 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c, v;
        ArrayList<String> combinaciones = new ArrayList<String>();
        String salida;

        for (int i = 0; i < n; i++) {
            c = sc.nextInt();
            v = sc.nextInt();
            combinaciones.clear();
            salida = "";

            combinar(c, v, combinaciones, "");

            Collections.sort(combinaciones);

            for (String combinacion : combinaciones) {
                salida = salida + combinacion + " ";
            }

            System.out.println(salida.trim());
        }

    }

    public static void combinar(int c, int v, ArrayList<String> combinaciones, String cadena) {
        if (c == 0 && v == 0) {
            combinaciones.add(cadena);
        } else {
            if (c > 0) {
                combinar(c - 1, v, combinaciones, cadena + "C");
            }
            if (v > 0) {
                combinar(c, v - 1, combinaciones, cadena + "V");
            }
        }
    }
}
