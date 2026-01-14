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
public class Ejercicio665 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] entrada;
        int mayorI, minorI, patchI;
        int mayorF, minorF, patchF;
        for (int i = 0; i < n; i++) {
            entrada = sc.next().split("\\.");
            mayorI = Integer.parseInt(entrada[0]);
            minorI = Integer.parseInt(entrada[1]);
            patchI = Integer.parseInt(entrada[2]);
            entrada = sc.next().split("\\.");
            mayorF = Integer.parseInt(entrada[0]);
            minorF = Integer.parseInt(entrada[1]);
            patchF = Integer.parseInt(entrada[2]);
            sc.nextLine();
            
            if (mayorI == mayorF) {
                if (minorI == minorF) {
                    if (patchI + 1 == patchF) {
                        System.out.println("SI");
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    if (minorI + 1 == minorF && patchF == 0) {
                        System.out.println("SI");
                    } else {
                        System.out.println("NO");
                    }
                }
            } else {
                if (mayorI + 1 == mayorF && minorF == 0 && patchF == 0) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
