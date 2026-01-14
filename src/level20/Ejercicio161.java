package level20;


import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
public class Ejercicio161 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = -1;
        int[] a;

        while (n != 0) {
            n = sc.nextInt();
            if (n != 0) {
                a = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }
                Arrays.sort(a);
                
                if (a.length%2==1) {
                    System.out.println(a[a.length/2]*2);
                } else {
                    System.out.println(a[a.length/2] + a[(a.length/2)-1]);
                }
            }
        }
    }
}
