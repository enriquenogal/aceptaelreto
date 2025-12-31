/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a2025Las12Uvas;

import java.util.Scanner;

/**
 *
 * @author enriquenogal
 */
public class Ejercicio830 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pisoActualFran, pisoFinFran, pisoAscensor, tiempoPorPisoFran, tiempoPorPisoAscensor;
        do {
            pisoActualFran = sc.nextInt();
            pisoFinFran = sc.nextInt();
            pisoAscensor = sc.nextInt();
            tiempoPorPisoFran = sc.nextInt();
            tiempoPorPisoAscensor = sc.nextInt();
            if (!(pisoActualFran == 0 && pisoFinFran == 0 && pisoAscensor == 0
                    && tiempoPorPisoFran == 0 && tiempoPorPisoAscensor == 0)) {
                System.out.println(procesaCaso(pisoActualFran, pisoFinFran, pisoAscensor, tiempoPorPisoFran, tiempoPorPisoAscensor));
            }
        } while (!(pisoActualFran == 0 && pisoFinFran == 0 && pisoAscensor == 0
                && tiempoPorPisoFran == 0 && tiempoPorPisoAscensor == 0));
    }

    private static int procesaCaso(int pisoActualFran, int pisoFinFran, int pisoAscensor, int tiempoPorPisoFran, int tiempoPorPisoAscensor) {
        if (pisoFinFran == pisoActualFran) {
            return 0;
        }
        int plantasFranInicio = Math.abs(pisoFinFran - pisoActualFran);
        int tiempoFran = plantasFranInicio * tiempoPorPisoFran;
        int min = tiempoFran;
        if (tiempoPorPisoFran <= tiempoPorPisoAscensor || min == 0) {
            return min;
        }
        int plantasAscensor;
        int tiempoAscensor;
        int tiempoTotal;
        int plantasFran;
        if (pisoFinFran > pisoActualFran) {
            for (int i = 0; i < plantasFranInicio; i++) {
                plantasFran = Math.abs(pisoFinFran - pisoActualFran);
                tiempoFran = i * tiempoPorPisoFran;
                plantasAscensor = Math.abs(pisoActualFran - pisoAscensor) + plantasFran;
                tiempoAscensor = plantasAscensor * tiempoPorPisoAscensor;
                tiempoTotal = tiempoAscensor + tiempoFran;
                if (tiempoTotal < min) {
                    min = tiempoTotal;
                }
                pisoActualFran++;
            }
        } else {
            for (int i = 0; i < plantasFranInicio; i++) {
                plantasFran = Math.abs(pisoFinFran - pisoActualFran);
                tiempoFran = i * tiempoPorPisoFran;
                plantasAscensor = Math.abs(pisoActualFran - pisoAscensor) + plantasFran;
                tiempoAscensor = plantasAscensor * tiempoPorPisoAscensor;
                tiempoTotal = tiempoAscensor + tiempoFran;
                if (tiempoTotal < min) {
                    min = tiempoTotal;
                }
                pisoActualFran--;
            }
        }
        return min;
    }
}
