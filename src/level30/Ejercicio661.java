package level30;


import java.util.Scanner;


/**
 *
 * @author enriquenogal
 */
public class Ejercicio661 {

    static int agua;
    static int celdasInundadas;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a;
        int alto, ancho;
        while (sc.hasNext()) {
            ancho = sc.nextInt();
            alto = sc.nextInt();
            a = new int[alto][ancho];
            for (int i = 0; i < alto; i++) {
                for (int j = 0; j < ancho; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            tratarCaso(a);
        }
    }

    public static void tratarCaso(int[][] a) {
        boolean[][] b;
        boolean continuar = true;
        int filaComienzo = a.length / 2;
        agua = 0;
        while (continuar) {
            celdasInundadas = 0;
            b = new boolean[a.length][a[0].length];
            tratarCelda(filaComienzo, 0, agua, a, b);
            if (celdasInundadas >= ((a.length * a[0].length / 2) + 1)) {
                continuar = false;
            } else {
                agua++;
            }
        }
        System.out.println(agua + " " + celdasInundadas);
    }

    public static void tratarCelda(int i, int j, int agua, int[][] a, boolean[][] b) {
        try {
            if (b[i][j] == false) {
                b[i][j] = true;
                if (a[i][j] <= agua) {
                    celdasInundadas++;
                    //recursividad
                    tratarCelda(i - 1, j, agua, a, b);
                    tratarCelda(i, j - 1, agua, a, b);
                    tratarCelda(i, j + 1, agua, a, b);
                    tratarCelda(i + 1, j, agua, a, b);
                } 
            }
        } catch (Exception e) {
        }
    }
}
