package level0;


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
public class Ejercicio427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada1;
        String entrada2;
        int numero = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numero; i++) {
            entrada1 = sc.nextLine();
            entrada2 = sc.nextLine();
            if (entrada1.equals("Luke")&&entrada2.equals("padre")){
                System.out.println("TOP SECRET");
            } else {
                System.out.println(entrada1 + ", yo soy tu " + entrada2);
            }
        }

    }
}


