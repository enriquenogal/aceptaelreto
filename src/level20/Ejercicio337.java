package level20;

//Run-time error (RTE)
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
public class Ejercicio337 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int veces = Integer.parseInt(sc.nextLine().trim());
        String[] arriba, abajo;
        long valor;
        boolean alineados;
        for (int i = 0; i < veces; i++) {
            arriba = sc.nextLine().trim().split(" ");
            abajo = sc.nextLine().trim().split(" ");
            alineados = true;
            valor = Long.parseLong(arriba[0]) + Long.parseLong(abajo[0]);
            for (int j = 1; j < arriba.length; j++) {
                if (Long.parseLong(arriba[j]) + Long.parseLong(abajo[j]) != valor) {
                    alineados = false;
                    break;
                }
            }
            if (alineados) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}
