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
public class Ejercicio717 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] a;

        for (int i = 0; i < n; i++) {
            a = new String[3];
            a[0] = sc.next();
            a[1] = sc.next();
            a[2] = sc.next();
            sc.nextLine();

            String s1 = a[0] + a[1] + a[2];
            String s2 = a[0] + a[2] + a[1];
            String s3 = a[1] + a[0] + a[2];
            String s4 = a[1] + a[2] + a[0];
            String s5 = a[2] + a[1] + a[0];
            String s6 = a[2] + a[0] + a[1];

            if (esDivertido(s1)) {
                System.out.println("DIVERTIDOS");
            } else if (esDivertido(s2)) {
                System.out.println("DIVERTIDOS");
            } else if (esDivertido(s3)) {
                System.out.println("DIVERTIDOS");
            } else if (esDivertido(s4)) {
                System.out.println("DIVERTIDOS");
            } else if (esDivertido(s5)) {
                System.out.println("DIVERTIDOS");
            } else if (esDivertido(s6)) {
                System.out.println("DIVERTIDOS");
            } else {
                System.out.println("INSULSOS");
            }
        }
    }

    public static boolean esDivertido(String s) {
        String s1 = s.substring(0, 3);
        String s2 = s.substring(3);
        //System.out.println(s1 + " " + s2);
        if (s1.equals(s2)) {
            return true;
        } else {
            return false;
        }
    }
}
