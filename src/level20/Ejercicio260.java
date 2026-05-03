package level20;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enogal
 */
public class Ejercicio260 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String s;
        for (int i = 0; i < n; i++) {
            tratarCaso(sc.nextLine());
        }
    }

    private static void tratarCaso(String s) {
        int suma = 0;
        for (int i = 0; i < s.length(); i++) {
            suma += (int)s.charAt(i);
        }
        //System.out.print(suma + "    ");
        for (int i = suma - 1; i > 2; i--) {
            if (esPrimo(i)) {
                System.out.println(i);
                break;
            }
        }    
    }

    private static boolean esPrimo(int n) {
        if (n % 2 == 0) return false;
        if (n == 1) return false;
        for (int i = 3; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
