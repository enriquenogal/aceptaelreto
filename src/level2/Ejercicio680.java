package level2;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio680 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int longitudRecorrido, delante, detras;
        for (int i = 0; i < n; i++) {
            longitudRecorrido = sc.nextInt();
            delante = sc.nextInt();
            detras = sc.nextInt();
            System.out.println(tratarCaso(longitudRecorrido, delante, detras));
        }
    }

    public static String tratarCaso(int longitudRecorrido, int delante, int detras) {
        if (delante >= longitudRecorrido) {
            return "1";
        } else if (detras >= delante) {
            return "IMPOSIBLE";
        } else {
            int ciclos = 0;
            int recorridoRealizado = 0;
            while (recorridoRealizado < longitudRecorrido) {
                ciclos++;
                recorridoRealizado += delante;
                if (recorridoRealizado < longitudRecorrido) {
                    recorridoRealizado -= detras;
                }
            }
            return "" + ciclos;
        }
    }
}
