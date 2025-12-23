package a2025Nav;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enriquenogal
 */
public class Ejercicio823 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nCasos = sc.nextInt();
        for (int i = 0; i < nCasos; i++) {
            tratarCaso(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
        }
    }

    private static void tratarCaso(int dentroNormal, int fueraNormal, int dentroComodo, int fueraComodo) {
        int peniquesTotal, libras, chelines;
        peniquesTotal = 12 * dentroNormal + 9 * fueraNormal + 18 * dentroComodo + 12 * fueraComodo;
        libras = peniquesTotal / 240;
        peniquesTotal = peniquesTotal % 240;
        chelines = peniquesTotal / 12;
        peniquesTotal = peniquesTotal % 12;
        System.out.println(libras + " " + chelines + " " + peniquesTotal);
    }
}
