package level20;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio667 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anno, annoTmp, cont, cifraAnno;
        boolean salir, todoBien;
        int[] uvas;
        do {
            anno = sc.nextInt();
            if (anno != 0) {
                uvas = new int[10];
                for (int i = 0; i < 10; i++) {
                    uvas[i] = sc.nextInt();
                }
                cont = 0;
                salir = false;
                while (salir == false) {
                    annoTmp = anno;
                    todoBien = true;
                    for (int i = 0; i < 4; i++) {
                        cifraAnno = annoTmp % 10;
                        annoTmp = annoTmp / 10;
                        uvas[cifraAnno] = uvas[cifraAnno] - 3;
                        if (uvas[cifraAnno] < 0) {
                            todoBien = false;
                            break;
                        } 
                    }
                    if (todoBien) {
                        cont++;
                    } else {
                        salir = true;
                    }
                }
                System.out.println(cont);
            }
        } while (anno != 0);
    }
}
