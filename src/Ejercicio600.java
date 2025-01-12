
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
            alto = sc.nextInt();
            ancho = sc.nextInt();
            if (!(ancho == 0 && alto == 0)) {
                a = new int[alto][ancho];
                for (int i = 0; i < a.length; i++) {
                    for (int j = 0; j < a[i].length; j++) {
                        a[i][j] = sc.nextInt();
                    }
                }
                mostrarArray(a);
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
                    System.out.println(i + " " + j);
                    return true;
                } else if (filaMayoresIguales && columnaMenoresIguales) {
                    System.out.println(i + " " + j);
                    return true;
                }
            }
        }
        return false;
    }

    private static void mostrarArray(int[][] a) {
        System.out.println("-------------------------");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------");
    }

}
