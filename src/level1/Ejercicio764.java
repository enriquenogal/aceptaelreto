package level1;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enogal
 */
public class Ejercicio764 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int capturadas, anterior, acum;
        do {
            n = sc.nextInt();
            if (n != 0) {
                acum = 0;
                for (int i = 0; i < n; i++) {
                    capturadas = sc.nextInt();
                    anterior = sc.nextInt();
                    acum += (capturadas - anterior);
                }
                System.out.println(acum);
            }
        } while (n != 0);

    }
}
