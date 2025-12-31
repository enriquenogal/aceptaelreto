//WA - si lo hago con double y un redondeo
//TLE - si lo hago con BigInteger
//TLE - si lo hago con la alternativa de la simplificación de la fórmula para no usar factoriales

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a2025Las12Uvas;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author enriquenogal
 */
public class Ejercicio832 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nCasos = sc.nextInt();
        for (int i = 0; i < nCasos; i++) {
            tratarCaso(sc.nextInt(), sc.nextInt());
        }
    }
    
    private static void tratarCaso(int n, int k) {
        // Validaciones
        if (k < 0 || k > n) {
            System.out.println("0");
            return;
        }
        
        // Casos especiales rápidos
        if (k == 0 || k == n) {
            System.out.println("1");
            return;
        }
        if (k == 1 || k == n - 1) {
            System.out.println(n);
            return;
        }
        k = Math.min(k, n - k);
        
        // Algoritmo optimizado sin factoriales completos
        // C(n,k) = Π_{i=1}^{k} (n - k + i) / i
        BigInteger resultado = BigInteger.ONE;
        
        for (int i = 1; i <= k; i++) {
            // Multiplicar por (n - k + i)
            resultado = resultado.multiply(BigInteger.valueOf(n - k + i));
            // Dividir por i (siempre división exacta en combinatoria)
            resultado = resultado.divide(BigInteger.valueOf(i));
        }
        
        System.out.println(resultado.toString());
    }
}
    
    

//    private static void tratarCaso(int n, int k) {
//        Alternativa 1
//        double r = factorial(n) / (factorial(k) * factorial(n - k));
//        Alternativa 2
//        double r = 1;
//        for (int i = 1; i <= k; i++) {
//            r *= ((1.0 * (n - k) + i) / i);
//        }
//        Alternativa 3
//        BigInteger r = BigInteger.ONE;
//        r = r.multiply(factorial(n).divide(factorial(k).multiply(factorial(n - k))));
//        System.out.println(r.toString());
//    }

//    private static double factorial(int n) {
//        BigInteger r = new BigInteger();
//        for (int i = 2; i <= n; i++) {
//            r *= i;
//        }
//        return r;
//    }
    
//    private static BigInteger factorial(int a) {
//        BigInteger n = BigInteger.valueOf(a);
//        BigInteger r = BigInteger.ONE;
//        for (int i = 2; i <= a; i++) {
//            r = r.multiply(n);
//            n = n.subtract(BigInteger.ONE);
//        }
//        return r;
//    }

