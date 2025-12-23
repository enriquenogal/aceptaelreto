
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enogal
 */
public class Ejercicio826 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nTrenes;
        int[] trenes;
        while (sc.hasNextInt()) {
            nTrenes = sc.nextInt();
            trenes = new int[nTrenes + 1];
            trenes[0] = 0;
            for (int i = 1; i < nTrenes + 1; i++) {
                trenes[i] = sc.nextInt();
            }
            tratarCaso(trenes);
        }
    }

    private static void tratarCaso(int[] trenes) {
        int grupos = 0;
        for (int i = trenes.length - 1; i >= 1; i--) {
            if (trenes[i] >= trenes[i - 1]) {
                grupos++;
            }
        }
        System.out.println(grupos);
    }
}
