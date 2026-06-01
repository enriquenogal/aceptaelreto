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
public class Ejercicio736 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            tratarCaso(sc.nextInt(), sc.nextInt());
        }
    }

    private static void tratarCaso(int escalones, int pasos) {
        int r = escalones / pasos;
        if (escalones % pasos != 0) {
            r++;
        }
        System.out.println(r);
    }
}
