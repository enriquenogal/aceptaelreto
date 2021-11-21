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
public class Ejercicio365 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int nPers, posicion, minutos;
        String[] regalosS;
        int[] regalos;
        boolean encontrado;

        for (int i = 0; i < n; i++) {
            encontrado = false;
            nPers = Integer.parseInt(sc.nextLine());
            posicion = Integer.parseInt(sc.nextLine()) - 1;
            regalosS = sc.nextLine().split(" ");
            regalos = new int[nPers];
            minutos = 0;
            for (int j = 0; j < nPers; j++) {
                regalos[j] = Integer.parseInt(regalosS[j]);
            }
            while (!encontrado) {
                for (int j = 0; j < regalos.length; j++) {
                    if (regalos[j] > 0) {
                        regalos[j]--;
                        minutos = minutos + 2;
                    }
                    if (j == posicion && regalos[j] == 0) {
                        encontrado = true;
                        break;
                    }
                }
            }
            System.out.println(minutos);

        }

    }

}
