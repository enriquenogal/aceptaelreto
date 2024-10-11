package unresolved;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enogal
 */
public class Ejercicio744 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, n, felicitaciones, inicio, distancia;
        while (sc.hasNext()) {
            t = sc.nextInt();
            felicitaciones = 0;
            inicio = -1;
            do {
                n = sc.nextInt();
                if (n != 0) {
                    if (inicio == -1) {
                        inicio = n;
                    } else {
                        distancia = n - inicio;
                        if (distancia > t) {
                            //felicitaciones += (distancia - 1) / t;
                            felicitaciones++;
                            inicio = n;
                            //inicio = -1;
                        }
                    }
                } else {
                    //if (inicio != -1) {
                        //System.out.println("Suma 1 felicitación final");
                        felicitaciones++;
                    //}
                }
            } while (n != 0);
            System.out.println("Felicitaciones totales: " + felicitaciones);
        }
    }
}
