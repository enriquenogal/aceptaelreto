package unresolved;



//Run-time error (RTE)
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
public class Ejercicio227b {

    public static long factorial(long x) {
        long f = 1;
        for (long i = 1; i <= x; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine().trim();
        String[] entradas;
        long n, m, resultado;
        String salida;
        while (!entrada.equals("0 0")) {
            salida = "";
            entradas = entrada.split(" ");
            n = Integer.parseInt(entradas[0]);
            m = Integer.parseInt(entradas[1]);
            for (long i = 0; i <= m; i++) {
                resultado = (factorial(n) / (factorial(i) * factorial(n - i))) % 1000000007;
                salida = salida + resultado + " ";
            }
            System.out.println(salida.trim());
            entrada = sc.nextLine().trim();
        }
    }
}
