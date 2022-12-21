/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unresolved;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author enriquenogal
 */
public class Ejercicio660 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] palabras;
        HashSet silabas = new HashSet<String>();
        for (int i = 0; i < n; i++) {
            palabras = sc.nextLine().split(" ");
            silabas.clear();
            for (int j = 0; j < palabras.length; j++) {
                separarSilabas(palabras[i],silabas);
            }
            System.out.println(silabas.size());
        }
    }
    
    public static void separarSilabas(String palabra, HashSet<String> silabas) {
        String silaba = "";
        for (int i = 0; i < palabra.length(); i++) {
            if (i == 0) {
                silaba = "" + palabra.charAt(i);
            } else {
                
                
                
                
                
            }
        }
        
    }
    
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        } else {
            return false;
        }      
    }
    
}
