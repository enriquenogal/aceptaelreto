package level10;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio772 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ini, n, predicA, predicB;
        do {
            ini = sc.nextInt();
            n = sc.nextInt();
            if (!(ini == 0 && n == 0)) {
                predicA = ini + (74 * n);
                predicB = ini + (79 * n);
                System.out.println("[" + predicA + " .. " + predicB + "]");
            }
        } while (!(ini == 0 && n == 0));
    }
}
