package level2;

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
public class Ejercicio446 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = Integer.parseInt(sc.nextLine());
        long numeroNietos;
        String nombreNieto, lastNombre;
        boolean encontrado;

        for (int i = 0; i < numero; i++) {
            nombreNieto = sc.next();
            numeroNietos = sc.nextLong();
            lastNombre = "";
            encontrado = false;
            for (long j = 1; j <= numeroNietos; j++) {
                lastNombre = sc.next();
                if (nombreNieto.equals(lastNombre)) {
                    if (numeroNietos == j) {
                        encontrado = true;
                    } else {
                        break;
                    }
                }
            }
            if (encontrado && numeroNietos != 1) {
                System.out.println("VERDADERA");
            } else {
                System.out.println("FALSA");
            }
            sc.nextLine();
        }
    }
}
