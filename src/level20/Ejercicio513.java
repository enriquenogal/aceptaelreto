package level20;


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
public class Ejercicio513 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diasTrabajo;
        String[] entradas;
        int trabajoMedio;
        int trabajoTotal;
        int trabajoAnterior;
        int trabajoDia;
        String salida;

        while (sc.hasNextLine()) {
            diasTrabajo = Integer.parseInt(sc.nextLine());
            entradas = sc.nextLine().split(" ");
            trabajoTotal = 0;
            trabajoAnterior = 0;
            salida = "";
            for (int i = 1; i <= entradas.length; i++) {
                trabajoMedio = Integer.parseInt(entradas[i-1]);
                trabajoTotal = trabajoMedio * i;
                trabajoDia = trabajoTotal - trabajoAnterior;
                trabajoAnterior = trabajoTotal;
                salida = salida + trabajoDia + " ";
            }
            System.out.println(salida.trim());
        }

    }
}
