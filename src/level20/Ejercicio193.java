package level20;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
public class Ejercicio193 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = -1;
        String suma;
        boolean impar;
        while (n != 0) {
            n = sc.nextInt();
            if (n != 0) {
                if (n % 10 == 0) {
                    System.out.println("NO");
                } else {
                    suma = Integer.toString(n + invertido(n));
                    impar = true;
                    for (int i = 0; i < suma.length(); i++) {
                        if (Character.getNumericValue(suma.charAt(i))%2 == 0) {
                            impar = false;
                            break;
                        }
                    }
                    if (impar) {
                        System.out.println("SI");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
    }
    
    public static int invertido(int n) {
        int invertido = 0, resto;
        while (n > 0) {
            resto = n % 10;
            invertido = invertido * 10 + resto;
            n = n / 10;      
        }
        return invertido;
    }

}
