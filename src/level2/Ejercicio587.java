/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level2;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Ejercicio587 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s;
        int cont;
        for (int i = 0; i < n; i++) {
            cont = 0;
            s = sc.nextLine();
            for (int j = 0; j < s.length() - 1; j++) {
                if (j % 2 == 0) {
                    if (s.charAt(j) == s.charAt(j+1)) cont++;
                } else {
                    cont++;
                }
            }
            System.out.println(cont+1);
        }
    }
}
