package level30;


import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio609c {

    public static void main(String[] args) {
        new Ejercicio609c().run();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int nTorres;
        int[] filas;
        int[] columnas;

        while (sc.hasNextLine()) {
            sc.nextInt();
            nTorres = sc.nextInt();
            sc.nextLine();
            filas = new int[nTorres];
            columnas = new int[nTorres];
            for (int i = 0; i < nTorres; i++) {
                filas[i] = sc.nextInt();
                columnas[i] = sc.nextInt();
                sc.nextLine();
            }
            System.out.println(medianaVector(filas) + " " + medianaVector(columnas));
        }
    }

    public static int medianaVector(int[] a) {
        Arrays.sort(a);
        if (a.length % 2 == 0) {
            return a[(a.length / 2) - 1];
        } else {
            return a[(a.length / 2)];
        }
    }

}
