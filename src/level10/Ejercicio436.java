package level10;

//Wrong answer (WA)

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
public class Ejercicio436 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;
        String[] entradas;
        Long papel, edificio, resultado;

        while (sc.hasNextLine()) {
            entrada = sc.nextLine();
            entradas = entrada.split(" ");
            papel = Long.parseLong(entradas[0]);
            edificio = Long.parseLong(entradas[1]) * 1000000L;
            resultado = 0L;
            while (papel < edificio) {
                papel = papel * 2;
                resultado++;
            }
            System.out.println(resultado);
        }
    }
}
