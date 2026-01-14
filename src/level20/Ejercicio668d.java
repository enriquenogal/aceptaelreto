package level20;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio668d {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, n;
        do {
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
            if (!(a == 0 && b == 0 && n == 0)) {
                System.out.println(restanacci(a, b, n));
            }
        } while (!(a == 0 && b == 0 && n == 0));
    }

    public static int restanacci(int a, int b, int n) {
        int[] resultado = new int[6];
        resultado[0] = a;
        resultado[1] = b;
        resultado[2] = b - a;
        resultado[3] = -a;
        resultado[4] = -b;
        resultado[5] = -(b - a);
        n = n % 6;
        return resultado[n];
    }

}
