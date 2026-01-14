package level10;


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
public class Ejercicio112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distancia = -1, velMax = -1, tiempo = -1, velReal;
        while (!(distancia == 0 && velMax == 0 && tiempo == 0)) {
            distancia = sc.nextDouble();
            velMax = sc.nextDouble();
            tiempo = sc.nextDouble();
            if (!(distancia == 0 && velMax == 0 && tiempo == 0)) {
                if (distancia <= 0 || velMax <= 0 || tiempo <= 0) {
                    System.out.println("ERROR");
                } else {
                    velMax = velMax * 1000 / 3600;
                    velReal = distancia / tiempo;
                    if (velReal <= velMax) {
                        System.out.println("OK");
                    } else if (velReal >= velMax * 1.2d) {
                        System.out.println("PUNTOS");
                    } else {
                        System.out.println("MULTA");
                    }
                }
            }
        }
    }
}
