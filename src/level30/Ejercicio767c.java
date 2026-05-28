package level30;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enogal
 */

public class Ejercicio767c {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        do {
            n = sc.nextInt();
            if (n != 0) {
                int[] terreno = new int[n];
                for (int i = 0; i < n; i++) {
                    terreno[i] = sc.nextInt();
                }
                tratarCaso(terreno);
            }
        } while (n != 0);
    }

    private static void tratarCaso(int[] terreno) {
        int n = terreno.length;
        
        // Paso 1: Encontrar la altura mínima del canal en el último punto
        // usando las restricciones desde atrás hacia adelante
        int x = 0; // x = C[n-1]
        
        // La condición es: C[i] = C[i+1] + 1, y C[i] >= terreno[i]
        // Despejando: C[n-1] + (n-1-i) >= terreno[i]
        // Es decir: x >= terreno[i] - (n-1-i) para todo i
        
        for (int i = 0; i < n; i++) {
            int necesario = terreno[i] - (n - 1 - i);
            if (necesario > x) {
                x = necesario;
            }
        }
        
        // Asegurar que x >= terreno[n-1] (condición del último punto)
        if (x < terreno[n-1]) {
            x = terreno[n-1];
        }
        
        // Paso 2: Construir el canal absoluto
        int[] canal = new int[n];
        canal[n-1] = x;
        for (int i = n-2; i >= 0; i--) {
            canal[i] = canal[i+1] + 1;
        }
        
        // Paso 3: Calcular altura sobre suelo
        int[] sobreSuelo = new int[n];
        for (int i = 0; i < n; i++) {
            sobreSuelo[i] = canal[i] - terreno[i];
        }
        
        // Paso 4: Imprimir resultado
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(sobreSuelo[i]);
            if (i < n-1) sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}