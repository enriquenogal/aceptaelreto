package level00;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enogal
 */
public class Ejercicio763 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String s;
        for (int i = 0; i < n; i++) {
            s = sc.nextLine();
            if (s.equalsIgnoreCase("colgadas")) {
                System.out.println("Bien");
            } else {
                System.out.println("Mal");
            }
        }
        
    }
}
