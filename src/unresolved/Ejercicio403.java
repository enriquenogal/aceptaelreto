package unresolved;


//Wrong answer (WA)


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
public class Ejercicio403 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        long minimo = 90 * 45;
        long maximo = 120 * 90;
        long medida, nCampos;

        for (int i = 0; i < n; i++) {
            medida = sc.nextLong();
            nCampos = sc.nextLong();
            sc.nextLine();
            minimo = minimo * nCampos;
            maximo = maximo * nCampos;
            if (medida >= minimo && medida <= maximo) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }            
        }

    }

}
