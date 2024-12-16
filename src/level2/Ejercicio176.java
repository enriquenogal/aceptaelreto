package level2;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enogal
 */
public class Ejercicio176 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ancho, alto;
        char[][] a;
        String linea;
        do {
            ancho = sc.nextInt();
            alto = sc.nextInt();
            sc.nextLine();
            if (!(ancho == 0 || alto == 0)) {
                a = new char[alto][ancho];
                for (int i = 0; i < alto; i++) {
                    linea = sc.nextLine();
                    for (int j = 0; j < ancho; j++) {
                        a[i][j] = linea.charAt(j);
                    }
                }
                tratarCaso(a);
            }
        } while (!(ancho == 0 || alto == 0));
    }

    private static void tratarCaso(char[][] a) {
        int acum = 0;
        int cont = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == '-') {
                    cont = 0;
                    for (int k = -1; k <= 1; k++) {
                        for (int l = -1; l <= 1; l++) {
                            try {
                                if (a[i + k][j + l] == '*') {
                                    cont++;
                                }
                            } catch (Exception e) {
                            }
                        }
                    }
                    if (cont >= 6) {
                        acum++;
                    }
                }

            }
        }
        System.out.println(acum);
    }
}
