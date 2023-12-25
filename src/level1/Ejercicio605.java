package level1;


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
public class Ejercicio605 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v, i, a;
        char r;
        while (true) {
            v = i = a = 0;
            while (true) {
                r = sc.next().charAt(0);
                if (r == 'V') v++;
                else if (r == 'I') i++;
                else if (r == 'A') a++;
                else if (r == '.') break;
            }
            sc.nextLine();  
            if (!(a == 0 && i == 0 && v == 0)){
                if (v > i) System.out.println("VERANO");
                else if (v < i) System.out.println("INVIERNO");
                else System.out.println("EMPATE");
            } else {
                break;
            }
        }
    }  
}
