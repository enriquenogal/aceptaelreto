package level3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author enriquenogal
 */
public class Ejercicio660 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] palabras;
        for (int i = 0; i < n; i++) {
            palabras = sc.nextLine().toLowerCase().split(" ");
            tratarCaso(palabras);
        }
    }

    public static void tratarCaso(String[] palabras) {
        //paso por cada palabra
        //voy extrayendo del principio de la palabra sílabas
        //las añado al set
        //y las voy borrando
        //cuando se quede vacía la palabra es que he terminado con ella
        HashSet silabas = new HashSet<String>();
        for (String palabra : palabras) {
            while (palabra.length() > 0) {
                if (palabra.length() == 1) {
                    silabas.add(palabra);
                    palabra = "";
                } else if (palabra.length() == 2) {
                    silabas.add(palabra);
                    palabra = "";
                } else if (palabra.length() == 3) {
                    if (isVowel(palabra.charAt(0))) {
                        silabas.add("" + palabra.charAt(0));
                        palabra = palabra.substring(1);
                    } else {
                        if (isVowel(palabra.charAt(1)) && !isVowel(palabra.charAt(2))) {
                            silabas.add("" + palabra.charAt(0) + palabra.charAt(1) + palabra.charAt(2));
                            palabra = palabra.substring(3);
                        } else {
                            silabas.add("" + palabra.charAt(0) + palabra.charAt(1));
                            palabra = palabra.substring(2);
                        }
                    }
                } else {
                    if (isVowel(palabra.charAt(0))) {
                        silabas.add("" + palabra.charAt(0));
                        palabra = palabra.substring(1);
                    } else {
                        if (isVowel(palabra.charAt(1)) && !isVowel(palabra.charAt(2))) {
                            if (!isVowel(palabra.charAt(3))) {
                                silabas.add("" + palabra.charAt(0) + palabra.charAt(1) + palabra.charAt(2));
                                palabra = palabra.substring(3);
                            } else {
                                silabas.add("" + palabra.charAt(0) + palabra.charAt(1));
                                palabra = palabra.substring(2);
                            }
                        }
                    }
                }
            }
        }
        //System.out.print(silabas + " --- ");
        System.out.println(silabas.size());
    }

    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
