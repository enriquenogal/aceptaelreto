package level20;


import java.util.Arrays;
import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enogal
 */
public class Ejercicio695 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
            if (n != 0) {
                tratarCaso(n);
            }
        } while (n != 0);
    }

    private static void tratarCaso(int n) {
        char[] num = Integer.toString(n).toCharArray();
        Arrays.sort(num);
        int numMayor = mayor(num);
        int numMenor = menor(num);
        int dif = numMayor - numMenor;
        int div = dif / 9;
        System.out.println(numMayor + " - " + numMenor + " = " + dif + " = " + div + " x 9");
    }

    private static int mayor(char[] num) {
        char[] num2 = new char[num.length];
        for (int i = 0; i < num.length; i++) {
            num2[num2.length - 1 - i] = num[i];
        }
        return Integer.parseInt(new String(num2));
    }

    private static int menor(char[] num) {
        return Integer.parseInt(new String(num));
    }
}
