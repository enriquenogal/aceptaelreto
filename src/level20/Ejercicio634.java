package level20;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enogal
 */
public class Ejercicio634 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String linea;
        int n = Integer.parseInt(sc.nextLine());
        int contador, puntuacionFinal;
        for (int i = 0; i < n; i++) {
            linea = sc.nextLine();
            contador = 0;
            puntuacionFinal = 0;
            for (int j = 0; j < linea.length(); j++) {
                if (linea.charAt(j) == 'O') {
                    contador += 10;
                    puntuacionFinal += contador;
                } else {
                    contador = 0;
                }
            }
            System.out.println(puntuacionFinal);
        }
        
    }
}
