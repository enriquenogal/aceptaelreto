package level2;

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
public class Ejercicio610 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int n, s, p, k, muertos, posicionMuerto, muertosObjetivo;
        for (int i = 0; i < v; i++) {
            n = sc.nextInt(); //número de personas
            s = sc.nextInt() - 1; //posición ironman
            p = sc.nextInt() - 1; //posición spiderman
            k = sc.nextInt(); //posición salto
            muertos = 0;
            boolean[] muerto = new boolean[n];
            posicionMuerto = 0;
            if (n % 2 == 0) {
                muertosObjetivo = n / 2;
            } else {
                muertosObjetivo = (n / 2) + 1;
            }

            while (muertos < muertosObjetivo) {
                muertos++;
                posicionMuerto = calculaPosicion(muerto, posicionMuerto, k);
                //System.out.println("Posición a matar: " + posicionMuerto);
                muerto[posicionMuerto] = true;
                //imprimeArray(muerto);
            }

            if (muerto[p] == true && muerto[s] == false) {
                System.out.println("No quiero irme, Sr. Stark!");
            } else if (muerto[p] == false && muerto[s] == true) {
                System.out.println("No quiero irme, Peter!");
            } else {
                System.out.println("No hay abrazo");
            }
            
            //System.out.println("Peter muere: " + muerto[p]);
            //System.out.println("Stark muere: " + muerto[s]);

        }
    }

    public static int calculaPosicion(boolean[] muerto, int inicio, int salto) {
        while (!(muerto[inicio] == false)) {
            inicio = (inicio + 1) % muerto.length;
        }
        while (salto != 0) {
            inicio = (inicio + 1) % muerto.length;
            if (muerto[inicio] == false) {
                salto--;
            }
        }
        return inicio;
    }

    public static void imprimeArray(boolean[] b) {
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }

}
