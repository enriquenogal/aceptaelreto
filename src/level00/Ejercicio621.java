package level00;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio621 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p;
        for (int i = 0; i < n; i++) {
            p = sc.nextInt();
            if (p % 2 == 0) {
                System.out.println(p + 1);
            } else {
                System.out.println(p - 1);
            }

        }
    }

}
