/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level3;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Ejercicio585 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        double a, b;
        String[] linea;
        double minutosA, minutosB, horasA, horasB;
        String agujaHoras;
        for (int i = 0; i < n; i++) {
            linea = sc.nextLine().split(" ");
//            a = Double.parseDouble(linea[0]) % 360;
//            b = Double.parseDouble(linea[1]) % 360;
            a = Double.parseDouble(linea[0]);
            b = Double.parseDouble(linea[1]);
            
            minutosA = (a / 6);
            minutosB = (b / 6);
            horasA = (a / 30);
            horasB = (b / 30);

            agujaHoras = "E";
            if (corresponde(horasA, minutosB)) {
                agujaHoras = "A";
            } else if (corresponde(horasB, minutosA)) {
                agujaHoras = "B";
            }

            if (agujaHoras.equals("A")) {
                System.out.printf("%02d:%02d\n", (int) horasA, (int) Math.round(minutosB));
            } else if (agujaHoras.equals("B")) {
                System.out.printf("%02d:%02d\n", (int) horasB, (int) Math.round(minutosA));
            } else {
                System.out.println("ERROR");
            }

        }
    }

    public static boolean corresponde(double horas, double minutos) {
        //System.out.println(Math.round((horas - Math.floor(horas)) * 60) + ":::" + minutos);
        return Math.round((horas - Math.floor(horas)) * 60) == minutos;
    }

}
