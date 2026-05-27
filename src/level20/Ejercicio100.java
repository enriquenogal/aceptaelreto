package level20;


import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio100 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            tratarCaso(sc.nextInt());
        }
    }

    private static void tratarCaso(int n) {
        String s;
        int c = 0;
        int n1, n2;
        char[] a;
        while (n != 6174) {
            c++;
            s = Integer.toString(n);
            s = rellena(s);
            a = s.toCharArray();
            Arrays.sort(a);
            s = new String(a);
            n1 = Integer.parseInt(s);
            s = reverse(s);
            n2 = Integer.parseInt(s);
            n = n2 - n1;
            if (n == 0) {
                c = 8;
                break;
            }
        }
        System.out.println(c);
    }

    private static String rellena(String s) {
        while (s.length() < 4) {
            s = '0' + s;
        }
        return s;
    }

    private static String reverse(String s) {
        String r = "";
        for (char c : s.toCharArray()) {
            r = c + r;
        }
        return r;
    }
}
