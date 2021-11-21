package level1;


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
public class Ejercicio293 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int veces = Integer.parseInt(sc.nextLine());
        int insectos, aracnidos, crustis, escalo, anillos;
        long total;
        for (int i = 0; i < veces; i++) {
            total = 0;
            insectos = sc.nextInt();
            aracnidos = sc.nextInt();
            crustis = sc.nextInt();
            escalo = sc.nextInt();
            anillos = sc.nextInt();
            total = (insectos * 6) + (aracnidos * 8) + (crustis * 10) + (escalo * anillos * 2);
            System.out.println(total);
        }
    }
}
