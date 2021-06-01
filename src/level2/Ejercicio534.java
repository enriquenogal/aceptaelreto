package level2;


import java.util.Arrays;
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
public class Ejercicio534 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = -1, distanciaMayor;
        int[] pesos;
        
        while (n!=0){
            n = sc.nextInt();
            if (n!=0) {
                pesos = new int[n];
                for (int i = 0; i < n; i++) {
                    pesos[i] = sc.nextInt();
                }
                Arrays.sort(pesos);
                distanciaMayor = pesos[1] - pesos[0];
                for (int i = 2; i < pesos.length-1; i=i+2) {
                    if (pesos[i+1]-pesos[i] > distanciaMayor) {
                        distanciaMayor = pesos[i+1]-pesos[i];
                    }
                }
                System.out.println(distanciaMayor);
            }
        }
    }
    
}
