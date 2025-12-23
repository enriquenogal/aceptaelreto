
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
                tren = new int[estaciones - 1];
                burro = new int[estaciones - 1];
                for (int i = 0; i < tren.length; i++) {
                    tren[i] = sc.nextInt();
                }
                for (int i = 0; i < burro.length; i++) {
                    burro[i] = sc.nextInt();
                }
                tratarCaso(tren, burro);
            }
        } while (estaciones != 0);
    }

    private static void tratarCaso(int[] tren, int[] burro) {
        int cont = 0;
        int sumaTren, sumaBurro;
        
        for (int inicio = 0; inicio < tren.length; inicio++) {
            sumaTren = 0;
            sumaBurro = 0;
            for (int j = inicio; j < tren.length; j++) {
                sumaTren += tren[j];
                sumaBurro += burro[j];
                if (sumaBurro < sumaTren) {
                    cont++;
                }
            }
        }
        System.out.println(cont);
    }
}
