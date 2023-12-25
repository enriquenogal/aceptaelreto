package unresolved;


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
public class Ejercicio630 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jugadores, rondas, partidos, rondasTmp;
        String lectura, siguiente;

        do {
            jugadores = sc.nextInt();
            rondas = sc.nextInt();
            partidos = 0;
            sc.nextLine();
            if (rondas != 0 && jugadores != 0) {
                lectura = sc.nextLine();
                rondasTmp = rondas;
                while (rondasTmp > 0) {
                    siguiente = "";
                    for (int i = 0; i < lectura.length() - 1; i = i + 2) {
                        if (lectura.charAt(i) == '1' && lectura.charAt(i + 1) == '1') {
                            partidos++;
                            siguiente += "1";
                        } else if (lectura.charAt(i) == '0' && lectura.charAt(i + 1) == '0') {
                            siguiente += "0";
                        } else if (lectura.charAt(i) == '1' && lectura.charAt(i + 1) == '0') {
                            siguiente += "1";                             
                        } else if (lectura.charAt(i) == '0' && lectura.charAt(i + 1) == '1') {
                            siguiente += "1";                             
                        }
                    }
                    //System.out.println("Lectura: " + lectura + " siguiente: " + siguiente + " partidos: " + partidos);
                    lectura = siguiente;
                    rondasTmp--;
                }
                System.out.println(partidos);
            }
        } while (rondas != 0 && jugadores != 0);

    }

}
