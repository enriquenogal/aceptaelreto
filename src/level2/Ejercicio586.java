/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Ejercicio586 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int guardados;
        int[] cal;
        for (int i = 0; i < n; i++) {
            guardados = sc.nextInt();
            sc.nextLine();
            cal = new int[guardados];
            for (int j = 0; j < guardados; j++) {
                cal[j] = sc.nextInt();
            }
            sc.nextLine();
            Arrays.sort(cal);
            System.out.println(cal[guardados-1] - cal[0] - guardados +1);
        }
    }
}
