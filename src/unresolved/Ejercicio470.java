//TLE
package unresolved;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enogal
 */
public class Ejercicio470 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s;
        while (sc.hasNextLine()) {
            s = new StringBuilder(sc.nextLine());
            int cont = 0;
            for (int i = 0; i < s.length() - 2; i++) {
                if (s.charAt(i) == 'R' && s.charAt(i + 1) == 'A' && s.charAt(i + 2) == 'V') {
                    cont++;
                    s.delete(i, i + 3);
                    if (i > 2) {
                        i = i - 3;
                    } else if (i > 1) {
                        i = i -2;
                    } else {
                        i = i -1;
                    }
//                    if (i > 2 && s.charAt(i - 2) == 'R' && s.charAt(i - 1) == 'A') {
//                        i = i - 3;
//                    } else if (i > 2 && s.charAt(i - 1) == 'R') {
//                        i = i - 2;
//                    } else {
//                        i = -1;
//                    }
                }
            }
            System.out.println(cont);
        }
    }
}
