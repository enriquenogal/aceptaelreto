
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enogal
 */
public class Ejercicio822 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tren, burro;
        int estaciones;
        do {
            estaciones = sc.nextInt();
            if (estaciones != 0) {
                tren = new int[estaciones];
                burro = new int[estaciones];
                tren[0] = 0;
                burro[0] = 0;
                for (int i = 1; i < estaciones; i++) {
                    tren[i] = sc.nextInt();
                }
                for (int i = 1; i < estaciones; i++) {
                    burro[i] = sc.nextInt();
                }
                tratarCaso(estaciones, tren, burro);
            }
        } while (estaciones != 0);
    }

    private static void tratarCaso(int estaciones, int[] tren, int[] burro) {
        int cont = 0;
        for (int saltos = 1; saltos < estaciones - 1; saltos++) {
            for (int estacionInicio = 0; estacionInicio < estaciones - saltos; estacionInicio++) {
                if (calculaTiempo(burro,estacionInicio, saltos) < calculaTiempo(tren, estacionInicio, saltos)) {
                    cont++;
                }
            }
        }
        System.out.println(cont);
    }

    private static int calculaTiempo(int[] array, int estacionInicio, int saltos) {
        int sumaTiempos = 0;
        for (int i = estacionInicio; i < estacionInicio + saltos; i++) {
            sumaTiempos += array[i];
        }
        return sumaTiempos;
    }
}
