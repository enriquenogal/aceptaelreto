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
public class Ejercicio635 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int year, siglo;
        for (int i = 0; i < n; i++) {
            year = sc.nextInt();
            siglo = (year / 100) + 1;
            if (year % 100 == 0) {
                siglo--;
            }
            System.out.println(siglo);
        }
    }
}
