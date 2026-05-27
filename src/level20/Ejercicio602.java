package level20;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio602 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            tratarCaso(sc.nextInt());
        }
    }

    private static void tratarCaso(int objetivo) {
        if (objetivo == 1) {
            System.out.println(1);
        } else {
            int dia1 = 1;
            int dia2 = 1;
            int cts = 2;
            int tmp = 0;
            int dias = 2;
            while (cts < objetivo) {
                dias++;
                cts = cts + 2 * dia1 + dia2;
                tmp = dia1;
                dia1 = dia2;
                dia2 = 2 * tmp + dia2;
            }
            System.out.println(dias);
        }
    }
}
