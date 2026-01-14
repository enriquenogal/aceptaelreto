/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level20;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Ejercicio583 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        double rComprometedora, rNoComprometedora, total, obligados, salida;
        for (int i = 0; i < n; i++) {
            rComprometedora = sc.nextDouble();
            rNoComprometedora = sc.nextDouble();
            sc.nextLine();
            total = rComprometedora + rNoComprometedora;
            obligados = total / 2;

            rComprometedora = rComprometedora - obligados;
            total = rComprometedora + rNoComprometedora;
            salida = (rComprometedora * 100) / total;

            System.out.println((int)salida);
        }
    }
}
