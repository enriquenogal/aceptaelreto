package level20;

import java.util.Scanner;

public class Ejercicio826 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nTrenes;
        int[] trenes;
        while (sc.hasNextInt()) {
            nTrenes = sc.nextInt();
            trenes = new int[nTrenes];
            for (int i = 0; i < nTrenes; i++) {
                trenes[i] = sc.nextInt();
            }
            tratarCaso(trenes);
        }
    }

    private static void tratarCaso(int[] trenes) {
        int grupos = 1;
        for (int i = trenes.length - 1; i > 0; i--) {
            if (trenes[i] > trenes[i - 1]) { // a mi gusto debería ser >= pero parece que los trenes salen todos a la vez
                grupos++;
            } else {
                trenes[i - 1] = trenes[i];
            }
        }
        System.out.println(grupos);
    }
}
