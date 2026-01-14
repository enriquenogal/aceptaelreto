package level20;


import java.util.HashSet;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio619 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        char[][] img;
        String linea;
        do {
            m = sc.nextInt();
            n = sc.nextInt();
            sc.nextLine();
            if (n != 0 && m != 0) {
                img = new char[n][m];
                for (int i = 0; i < n; i++) {
                    linea = sc.nextLine();
                    for (int j = 0; j < m; j++) {
                        img[i][j] = linea.charAt(j);
                    }
                }
                //mostrarArray(img);
                if (dividir(img)) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }

            }
        } while (n != 0 && m != 0);
    }

    public static boolean dividir(char[][] img) {
        int filas = img.length / 8;
        int columnas = img[0].length / 8;
        char[][] miniImg;
        int iTemp, jTemp;
        // tengo que dividir la imagen en mini imágenes y por cada una llamar a checkMiniImg
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                miniImg = new char[8][8];
                iTemp = 0;
                jTemp = 0;
                for (int i = 0 + (fila * 8); i < 8 + (fila * 8); i++) {
                    for (int j = 0 + (columna * 8); j < 8 + (columna * 8); j++) {
                        miniImg[iTemp][jTemp] = img[i][j];
                        jTemp++;        
                    }
                    iTemp++;
                    jTemp = 0;
                }
                //mostrarArray(miniImg);
                if (!checkMiniImg(miniImg)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkMiniImg(char[][] a) {
        HashSet<Character> hs = new HashSet<Character>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                hs.add(a[i][j]);
                if (hs.size() > 2) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void mostrarArray(char[][] a) {
        System.out.println("------------------------");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------------------");
    }

}
