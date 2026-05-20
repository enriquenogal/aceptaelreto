package level30;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enriquenogal
 */
public class Ejercicio310 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nCasos = sc.nextInt();
        for (int i = 0; i < nCasos; i++) {
            System.out.println(alturaMaxima(sc.nextInt(), sc));
        }
    }

    private static int alturaMaxima(int nHijos, Scanner sc) {
        if (nHijos == 0) return 1;
        else {
            int max = 0;
            for (int i = 0; i < nHijos; i++) {
                max = Math.max(max, alturaMaxima(sc.nextInt(), sc));
            }
            return max + 1;
        }
    }
}
