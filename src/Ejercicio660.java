/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


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
        for (int i = 0; i < n; i++) {
            palabras = sc.nextLine().split(" ");
            tratarCaso(palabras);
            
        }
    }
    
    public static void tratarCaso(String[] palabras) {
        HashSet silabas = new HashSet<String>();
        for (int i = 0; i < palabras.length; i++) {
             if (palabras[i].length() == 1 || palabras[i].length() == 2) {
                 silabas.add(palabras[i]);
             }  else {
                 //TODO - resto de cosas para separar sílabas
             }        
        }
        System.out.println(silabas.size());
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
