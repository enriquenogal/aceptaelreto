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
public class Ejercicio596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada, salida;
        while (sc.hasNextLine()) {
            salida = "";
            entrada = sc.nextLine();
            for (int i = 0; i < entrada.length(); i++) {
                if (entrada.charAt(i) != '.') {
                    if (entrada.charAt(i+1) == '.' && entrada.charAt(i+2) == '.'){
                        salida = salida + entrada.charAt(i);
                    }
                }
            }
            System.out.println(salida);
        }
    }
}
