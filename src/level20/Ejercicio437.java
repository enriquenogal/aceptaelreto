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
public class Ejercicio437 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;
        String entradas[];
        int horas, minutos, segundos, horasResultado, minutosResultado, segundosResultado;
        int numero = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numero; i++) {
            entrada = sc.nextLine();
            entradas = entrada.split(":");
            horas = Integer.parseInt(entradas[0]);
            minutos = Integer.parseInt(entradas[1]);
            segundos = Integer.parseInt(entradas[2]);
            horasResultado = 24 - horas;
            minutosResultado = 60 - minutos;
            segundosResultado = 60 - segundos;
            if (minutos > 0 || segundos > 0) {
                horasResultado--;
            }
            if (segundos > 0) {
                minutosResultado--;
            }
            if (minutosResultado == 60) {
                minutosResultado = 0;
            }
            if (segundosResultado == 60) {
                segundosResultado = 0;
            }
            System.out.printf("%02d:%02d:%02d\n", horasResultado, minutosResultado, segundosResultado);
        }
    }
}
