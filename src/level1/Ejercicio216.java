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
public class Ejercicio216 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int gotas, horas, minutos, segundos;
        for (int i = 0; i < n; i++) {
            gotas = sc.nextInt();
            horas = gotas / 3600;
            minutos = (gotas % 3600) / 60;
            segundos = (gotas % 3600) % 60;
            System.out.printf("%02d:%02d:%02d\n",horas,minutos,segundos);
        }
    }
}
