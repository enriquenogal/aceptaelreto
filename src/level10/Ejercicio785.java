package level10;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enogal
 */
public class Ejercicio785 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            tratarCaso(sc.nextLong(), sc.nextLong());
        }
    }

    private static void tratarCaso(long n1, long n2) {
        String s1 = Long.toBinaryString(n1);
        String s2 = Long.toBinaryString(n2);
        if (s1.length() < s2.length()) {
            s1 = rellena(s1, s2.length());
        }
        if (s2.length() < s1.length()) {
            s2 = rellena(s2, s1.length());
        }
        int contador = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) contador++;
        }
        System.out.println(contador);
    }

    private static String rellena(String s, int length) {
        while (s.length() < length) {
            s = "0" + s;
        }
        return s;
    }
}
