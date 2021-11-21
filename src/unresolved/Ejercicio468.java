package unresolved;

//Wrong answer (WA)

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
public class Ejercicio468 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int diaIni = 0;
        int diaActual = 0;
        int resultado = 0;
        while (sc.hasNextLine()){
            n = sc.nextInt(); sc.nextLine();
            diaIni = sc.nextInt();
            resultado = 0;
            for (int i = 1; i < n; i++) {
                diaActual = sc.nextInt();
                if (diaIni - diaActual < resultado) {
                    resultado = diaIni - diaActual;
                }
            }
            System.out.println(Math.abs(resultado));
            sc.nextLine();
        }
    }
    
}
