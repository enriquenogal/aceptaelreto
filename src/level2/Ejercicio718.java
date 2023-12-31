package level2;


import java.util.HashSet;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enriquenogal
 */
public class Ejercicio718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, id, suma;
        HashSet<Integer> hs;
        do {
            n = sc.nextInt();
            if (n != 0) {
                hs = new HashSet<Integer>();
                suma = 0;
                for (int i = 0; i < n; i++) {
                    id = sc.nextInt();
                    if (hs.contains(id)) {
                        suma++;
                        hs.remove(id);
                    } else {
                        hs.add(id);
                    }
                }
                System.out.println(suma);
            }
        } while (n != 0);
    }
}
