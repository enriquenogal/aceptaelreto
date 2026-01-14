/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level20;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Ejercicio588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n;
        String bin, rev;
        do {
            n = sc.nextLong();
            if (n!=0) {
                bin = Long.toBinaryString(n);
                rev = reverso(bin);
                bin = quitarCeros(bin);
                rev = quitarCeros(rev);
                //System.out.print(bin + ":" + rev + " ");
                if (bin.equals(rev)) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            }
        } while (n!=0);
        
    }
    
    public static String quitarCeros(String s) {
        return s.replace("0"," ").trim().replace(" ","0");
    }
    
    public static String reverso(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result = s.charAt(i) + result;
        }
        return result;
    }
}
