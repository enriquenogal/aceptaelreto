package level10;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enogal
 */
public class Ejercicio784 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            tratarCaso(sc.nextLine().split(" "));
        }
    }

    private static void tratarCaso(String[] datos) {
        String salida = "";
        for (String dato : datos) {
            salida +=  "" + dato.charAt(0) + dato.charAt(0) + ". ";
        }
        System.out.println(salida.trim());
    }
}
