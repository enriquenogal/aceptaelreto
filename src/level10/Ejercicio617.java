package level10;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enriquenogal
 */
public class Ejercicio617 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int records;
        char[][] letras;
        String linea;
        for (int z = 0; z < n; z++) {
            records = Integer.parseInt(sc.nextLine());
            letras = new char[records][3];
            for (int i = 0; i < records; i++) {
                linea = sc.nextLine();
                letras[i][0] = linea.charAt(0);
                letras[i][1] = linea.charAt(1);
                letras[i][2] = linea.charAt(2);                
            }
            for (int j = 0; j < letras[0].length; j++) {
                for (int i = 0; i < letras.length; i++) {
                    System.out.print(letras[i][j]);
                }
            }
            System.out.println();
        }
    }
}
