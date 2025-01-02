
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio779d {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fotogramas, copias;
        do {
            fotogramas = sc.nextInt();
            copias = sc.nextInt();
            if (!(fotogramas == 0 && copias == 0)) {
                tratarCaso(fotogramas, copias, sc);
            }
        } while ((!(fotogramas == 0 && copias == 0)));
    }

    private static void tratarCaso(int fotogramas, int copias, Scanner sc) {
        boolean[] pics = new boolean[fotogramas];
        int n;
        int ini, fin;
        String tmp[];
        for (int i = 0; i < copias; i++) {
            n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                tmp = sc.next().split(",");
                ini = Integer.parseInt(tmp[0]);
                fin = Integer.parseInt(tmp[1]);
                for (int k = ini; k <= fin; k++) {
                    pics[k - 1] = true;
                }
            }
        }
        mostrarSalida(pics);
    }

    private static int mostrarSalida(boolean[] pics) {
        for (int i = 0; i < pics.length; i++) {
            if (pics[i] == false) {
                System.out.println("NO");
                return 0;
            }
        }
        System.out.println("SI");
        return 0;
    }
}
