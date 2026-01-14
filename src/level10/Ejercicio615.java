package level10;


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
public class Ejercicio615 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pasosBarraPotencia, factorMultiplica, tiempo;

        for (int i = 0; i < n; i++) {
            pasosBarraPotencia = sc.nextInt();
            factorMultiplica = sc.nextInt();
            tiempo = sc.nextInt();
            procesa(pasosBarraPotencia, factorMultiplica, tiempo);
        }

    }
    
    public static void procesa(int pasosBarraPotencia, int factorMultiplica, int tiempo){
        pasosBarraPotencia++;
        int fin = (tiempo % pasosBarraPotencia) * factorMultiplica;
        System.out.println(fin);  
    }
}
