/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a2026Reg;

import java.util.Scanner;

/**
 *
 * @author enogal
 */
public class Regional2026F {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total, cerradas, abiertas;
        for (int i = 0; i < n; i++) {
            total = sc.nextInt();
            abiertas = total / 2;
            cerradas = total - abiertas;
            System.out.println(cerradas + " " + abiertas);
        }
    }
}
