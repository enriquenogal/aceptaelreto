package level2;


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
public class Ejercicio546 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nCromosA, nCromosM;
        int[] cromosA, cromosM;
        int aux;
        boolean cambio1, cambio2;
        String salida1, salida2;

        for (int i = 0; i < n; i++) {
            nCromosA = sc.nextInt();
            cromosA = new int[5001];
            for (int j = 0; j < nCromosA; j++) {
                aux = sc.nextInt();
                cromosA[aux]++;
            }
            nCromosM = sc.nextInt();
            cromosM = new int[5001];
            for (int j = 0; j < nCromosM; j++) {
                aux = sc.nextInt();
                cromosM[aux]++;
            }
            cambio1 = false;
            salida1 = "";
            for (int j = 1; j < cromosA.length; j++) {
                if (cromosA[j] > 1 && cromosM[j] == 0) {
                    salida1 = salida1 + " " + j;
                    cambio1 = true;
                }
            }
            salida1 = salida1.trim();
            if (cambio1) {
                System.out.println(salida1); 
            } else {
                System.out.println("Nada que intercambiar");
            }
            
            cambio2 = false;
            salida2 = "";
            for (int j = 1; j < cromosM.length; j++) {
                if (cromosM[j] > 1 && cromosA[j] == 0) {
                    salida2 = salida2 + " " + j;
                    cambio2 = true;
                }
            }
            salida2 = salida2.trim();
            if (cambio2) {
                System.out.println(salida2); 
            } else {
                System.out.println("Nada que intercambiar");
            }
        }
    }
}
