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
public class Ejercicio153 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = Integer.parseInt(sc.nextLine());
        String[] entradas;
        int horas, minutos, horasN, minutosN;
        for (int i = 0; i < numero; i++) {
            entradas = sc.nextLine().split(":");
            horas = Integer.parseInt(entradas[0]);
            minutos = Integer.parseInt(entradas[1]);
            minutosN = (60 - minutos) % 60;
            horasN = 11 - horas;
            if (minutosN == 0) {
                horasN++;
            }
            if (horasN <= 0) {
                horasN = 12 + horasN;
            }
            System.out.printf("%02d:%02d%n", horasN, minutosN);
        }
    }
}
