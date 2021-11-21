package level1;


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
public class Ejercicio407 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = "";
        String[] entradas;
        int tablero, inicio, tirada, fin;

        while (!entrada.equals("0 0 0")) {
            entrada = sc.nextLine();
            if (!entrada.equals("0 0 0")) {
                entradas = entrada.split(" ");
                tablero = Integer.parseInt(entradas[0]);
                inicio = Integer.parseInt(entradas[1]);
                tirada = Integer.parseInt(entradas[2]);
                fin = inicio + tirada;
                if (fin < tablero) {
                    System.out.println(fin);
                } else {
                    fin = fin % tablero;
                    fin = tablero - fin;
                    System.out.println(fin);
                }
            }
        }

    }

}
