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
public class Regional2026B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double nAlumnos, tasa;
        int r;
        for (int i = 0; i < n; i++) {
            nAlumnos = Double.parseDouble(sc.next());
            tasa = Double.parseDouble(sc.next());
            r = (int)Math.round(nAlumnos * tasa / 100);
            System.out.println(r);
        }
    }
}
