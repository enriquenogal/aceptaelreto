package level1;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio638 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c, n, menor, mayor;
        double cuantasPorPersona;
        for (int i = 0; i < a; i++) {
            c = sc.nextInt();
            n = sc.nextInt();
            cuantasPorPersona = 1.0 * n / (c - 1);
            mayor = (int) (cuantasPorPersona * c);
            if (Math.floor(cuantasPorPersona * c) == cuantasPorPersona * c) {
                menor = mayor - 1;
            } else {
                menor = mayor;
            }
            System.out.println(menor + " " + mayor);
        }
    }
}
