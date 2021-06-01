package level1;


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
public class Ejercicio467 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] linea;
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            linea = sc.nextLine().toLowerCase().split(" ");
            if (linea[0].equals(linea[2])) {
                System.out.println("TAUTOLOGIA");
            } else {
                System.out.println("NO TAUTOLOGIA");
            }
        }
    }
}
