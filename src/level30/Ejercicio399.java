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
 * @author enrique
 */
public class Ejercicio399 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = "";
        String salida = "";
        String salidaFin = "";
        String[] entradas;
        int[] perlas;
        int anterior;

        while (!entrada.equals("0")) {
            entrada = sc.nextLine();
            if (!entrada.equals("0")) {
                entradas = entrada.split(" ");
                salida = "";
                salidaFin = "";
                if (entradas.length == 2) {
                    System.out.println(entradas[0]);
                } else {
                    perlas = new int[entradas.length - 1];
                    for (int i = 0; i < entradas.length - 1; i++) {
                        perlas[i] = Integer.parseInt(entradas[i]);
                    }
                    Arrays.sort(perlas);
                    anterior = -1;
                    for (int i = 0; i < perlas.length; i++) {
                        if (i < perlas.length - 1) {
                            if (perlas[i] == perlas[i + 1] && perlas[i] > anterior) {
                                salida = salida + perlas[i] + " ";
                                salidaFin = " " + perlas[i] + salidaFin;
                                anterior = perlas[i];
                                if (i != perlas.length - 2) {
                                    i++;
                                }
                            } else {
                                salida = "NO";
                                salidaFin = "";
                                break;
                            }
                        } else {
                            if (perlas[i] > anterior) {
                                salida = salida + perlas[i];
                            } else {
                                salida = "NO";
                                salidaFin = "";
                            }
                        }

                    }
                    System.out.println(salida + salidaFin);
                }
            }
        }
    }
}
