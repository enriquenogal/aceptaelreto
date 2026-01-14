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
public class Ejercicio664 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, carriles, maxPuente, min, tmp;
        do {
            n = sc.nextInt();
            if (n != 0) {
                min = Integer.MAX_VALUE;
                for (int i = 0; i < n; i++) {
                    carriles = sc.nextInt();
                    maxPuente = Integer.MIN_VALUE;
                    for (int j = 0; j < carriles; j++) {
                        tmp = sc.nextInt();
                        if (tmp > maxPuente) {
                            maxPuente = tmp;
                        }
                    }
                    if (maxPuente < min) {
                        min = maxPuente;
                    }
                }
                System.out.println(min);
            }

        } while (n != 0);
    }
}
