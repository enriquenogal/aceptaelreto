package level20;


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
public class Ejercicio520 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cubiletes = -1;
        int posicion = -1;
        int inicio, fin, aux;
        int[] juego;

        while (!(cubiletes == 0 && posicion == 0)) {
            cubiletes = sc.nextInt();
            posicion = sc.nextInt();
            if (!(cubiletes == 0 && posicion == 0)) {
                juego = new int[cubiletes];
                juego[posicion - 1] = 1;
                inicio = -1;
                fin = -1;
                while (!(inicio == 0 && fin == 0)) {
                    inicio = sc.nextInt();
                    fin = sc.nextInt();
                    if (!(inicio == 0 && fin == 0)) {
                        inicio--;
                        fin--;
                        aux = juego[inicio];
                        juego[inicio] = juego[fin];
                        juego[fin] = aux;
                    }
                }
                for (int i = 0; i < juego.length; i++) {
                    if (juego[i] == 1) {
                        System.out.println(i + 1);
                        break;
                    }
                }
            }
        }
    }
}
