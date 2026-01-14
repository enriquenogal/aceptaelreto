package level30;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enriquenogal
 */
public class Ejercicio721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bolas;
        for (int i = 0; i < n; i++) {
            bolas = sc.nextInt();
            tratarCaso(bolas);
        }
    }
    
    public static void tratarCaso(int bolas) {
        int n = 1;
        int suma = 1;
        int contDiferentes = 0;
        while (bolas > 0) {
            bolas = bolas - suma;
            if (bolas >= 0) contDiferentes++;
            n++;
            suma = suma + n;
        }
        System.out.println(contDiferentes);
    }
    

}
