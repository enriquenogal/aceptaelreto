package level2;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio668c {

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
        if (n == 0) {
            return a;
        } else if (n == 1) {
            return b;
        } else {
            int i3 = b - a;
            int i4 = i3 - b;
            int i5 = i4 - i3;
            int i6 = i5 - i4;
            int i7 = i6 - i5;
            int i8 = i7 - i6;
            //System.out.println("i3=" + i3 + " i4=" + i4 + " i5=" + i5 + " i6=" + i6 + " i7=" + i7 + " i8=" + i8);
            n = n - 2;
            n = n % 6;
            if (n == 0) {
                return i3;
            } else if (n == 1) {
                return i4;
            } else if (n == 2) {
                return i5;
            } else if (n == 3) {
                return i6;
            } else if (n == 4) {
                return i7;
            } else if (n == 5) {
                return i8;
            }
        }
        return 0;
    }

}
