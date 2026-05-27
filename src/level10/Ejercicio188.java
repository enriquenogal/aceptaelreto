package level10;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enriquenogal
 */
public class Ejercicio188 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            tratarCaso(sc.nextLine());
        }
    }

    private static void tratarCaso(String linea) {
        String encadenadas = "SI";
        String[] a = linea.split(" ");
        String actual, siguiente;
        for (int i = 0; i < a.length - 1; i++) {
            actual = a[i].substring(a[i].length() - 2);
            siguiente = a[i + 1].substring(0,2);
            //System.out.println(actual + "   " + siguiente);
            if (!actual.equals(siguiente)) {
                encadenadas = "NO";
                break;
            }
        }
        System.out.println(encadenadas);
    }
}
