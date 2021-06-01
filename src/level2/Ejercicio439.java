package level2;


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
public class Ejercicio439 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] entradas;
        int d = 0, t = 0, v = 0;
        boolean distancia, tiempo, velocidad;

        for (int i = 0; i < n; i++) {
            entradas = sc.nextLine().split(" ");
            distancia = false;
            tiempo = false;
            velocidad = false;
            for (int j = 0; j < 2; j++) {
                if (entradas[j].charAt(0) == 'V') {
                    v = Integer.parseInt(entradas[j].substring(2));
                    velocidad = true;
                } else if (entradas[j].charAt(0) == 'T') {
                    t = Integer.parseInt(entradas[j].substring(2));
                    tiempo = true;
                } else if (entradas[j].charAt(0) == 'D') {
                    d = Integer.parseInt(entradas[j].substring(2));
                    distancia = true;
                }
            }
            if (velocidad == false) {
                v = d / t;
                System.out.println("V=" + v);;
            } else if (distancia == false) {
                d = v * t;
                System.out.println("D=" + d);;
            } else if (tiempo == false) {
                t = d / v;
                System.out.println("T=" + t);;
            }
        }

    }

}
