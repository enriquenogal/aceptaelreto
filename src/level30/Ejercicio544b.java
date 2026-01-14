package level30;

//MLE
import java.util.Arrays;
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
public class Ejercicio544b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nUvas, contador;
        long pesoMax;
        long uvas[];

        while (sc.hasNextLine()) {
            nUvas = sc.nextInt();
            pesoMax = sc.nextLong();
            sc.nextLine();

            uvas = new long[nUvas];
            for (contador = 0; contador < nUvas; contador++) {
                uvas[contador] = sc.nextLong();
            }
            sc.nextLine();

            Arrays.sort(uvas);
            contador = 0;
            while (contador < nUvas) {
                if (contador == 0 && uvas[contador] > pesoMax) {
                    break;
                } else if (contador != 0 && uvas[contador] + uvas[contador - 1] > pesoMax) {
                    break;
                } else {
                    contador++;
                }
            }
            System.out.println(contador);
        }
    }
}
