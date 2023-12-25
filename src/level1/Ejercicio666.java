package level1;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enriquenogal
 */
public class Ejercicio666 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a, b;
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            a = tratarCadena(sc.nextLine().toLowerCase());
            b = tratarCadena(sc.nextLine().toLowerCase());
            if (a.equals(b)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }       
    }
    
    public static String tratarCadena(String s){
        s = s.replaceAll(" ", "");
        s = s.replaceAll("\\.", "");
        s = s.replaceAll(",", "");
        s = s.replaceAll(";", "");
        s = s.replaceAll(":", ""); 
        //System.out.print(s + "--- ");
        return s;
    }
}
