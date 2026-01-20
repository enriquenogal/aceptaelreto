package level21;


import java.util.HashSet;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enriquenogal
 */
public class Ejercicio416b {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        int n;
        String s;
        String resultado;
        do {
            n = sc.nextInt();
            sc.nextLine();       
            if (n!=0) {
                set.clear();
                resultado = "NO";
                for (int i = 0; i < n; i++) {
                    s = sc.next();
                    s = s.substring(0,s.length()-5);
                    if (set.contains(s)) {
                        resultado = "SI";
                        break;
                    } else {
                        set.add(s);
                    }
                }
                sc.nextLine();
                System.out.println(resultado);
            } 
        } while (n!=0);
    }
    
}
