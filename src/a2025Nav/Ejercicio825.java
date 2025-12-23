package a2025Nav;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enriquenogal
 */
public class Ejercicio825 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int toneladas, distancia, peniquesToneladaMilla,
                costeCombustibleMilla, costeMateriaPrima, salarioPeones, total;
        int nCasos = sc.nextInt();
        for (int i = 0; i < nCasos; i++) {
            toneladas = sc.nextInt();
            distancia = sc.nextInt();
            peniquesToneladaMilla = sc.nextInt();
            costeCombustibleMilla = sc.nextInt();
            costeMateriaPrima = sc.nextInt();
            salarioPeones = sc.nextInt();
            total = (toneladas *  distancia * peniquesToneladaMilla) - 
                    (distancia * 2 * costeCombustibleMilla) - 
                    costeMateriaPrima - salarioPeones;
            System.out.println(total);
        }
    }
    
}
