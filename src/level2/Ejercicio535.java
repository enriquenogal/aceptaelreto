package level2;


import java.util.Scanner;

public class Ejercicio535 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = -1;
        int resultado, max;
        int[] alturas;

        while (n != 0) {
            n = sc.nextInt();
            if (n != 0) {
                resultado = 0;
                alturas = new int[n];
                max = 0;
                for (int i = 0; i < n; i++) {
                    alturas[i] = sc.nextInt();
                    if (alturas[i] > max) {
                        max = alturas[i];
                    }
                }
                for (int i = 0; i < n; i++) {
                    resultado += max - alturas[i];
                }
                System.out.println(resultado);
            }
        }
    }

}
