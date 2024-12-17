
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enogal
 */
public class Ejercicio600 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ancho, alto;
        int[][] a;
        do {
            ancho = sc.nextInt();
            alto = sc.nextInt();
            if (!(ancho == 0 && alto == 0)) {
                a = new int[alto][ancho];
                for (int i = 0; i < alto; i++) {
                    for (int j = 0; j < ancho; j++) {
                        a[i][j] = sc.nextInt();
                    }
                }
                if (tratarCaso(a)) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            }
        } while (!(ancho == 0 && alto == 0));
    }

    public static boolean tratarCaso(int[][] a) {
        boolean filaMenoresIguales, filaMayoresIguales, columnaMenoresIguales, columnaMayoresIguales;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                filaMenoresIguales = true; 
                filaMayoresIguales = true;
                columnaMenoresIguales = true; 
                columnaMayoresIguales = true;
                for (int c = 0; c < a[i].length; c++) {
                    if (a[i][j] > a[i][c]) {
                        filaMenoresIguales = false;
                    }
                    if (a[i][j] < a[i][c]) {
                        filaMayoresIguales = false;
                    }
                }
                for (int f = 0; f < a.length; f++) {
                    if (a[i][j] > a[f][j]) {
                        columnaMenoresIguales = false;
                    }
                    if (a[i][j] > a[f][j]) {
                        columnaMayoresIguales = false;
                    }
                }
                if (filaMenoresIguales && columnaMayoresIguales) {
                    return true;
                } else if (filaMayoresIguales && columnaMenoresIguales) {
                    return true;
                }
            }
        }
        return false;
    }

}
