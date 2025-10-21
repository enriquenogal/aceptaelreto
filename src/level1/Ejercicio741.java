package level1;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enogal
 */
public class Ejercicio741 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos;
        long n;
        casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            n = sc.nextLong();
            n = (((n * (n + 1)) / 2) * 3) - n;
            System.out.println(n);
        }
    }
}
