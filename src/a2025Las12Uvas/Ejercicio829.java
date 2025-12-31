/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a2025Las12Uvas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author enriquenogal
 */
public class Ejercicio829 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, turno;
        String jugada;
        HashMap<String, Integer> hs = new HashMap<String, Integer>();
        do {
            n = Integer.parseInt(sc.nextLine());
            if (n != 0) {
                hs.clear();
                for (int i = 0; i < n; i++) {
                    turno = i % 2;
                    jugada = turno + "-" + sc.nextLine();
                    if (hs.containsKey(jugada)) {
                        hs.put(jugada, hs.get(jugada) + 1);
                    } else {
                        hs.put(jugada, 1);
                    }
                }
                procesarCaso(hs);
            }
        } while (n != 0);
    }

    private static void procesarCaso(HashMap<String, Integer> hs) {
        boolean tablas = false;
        for (Map.Entry<String, Integer> entry : hs.entrySet()) {
            int val = entry.getValue();
            if (val >= 5) {
                tablas = true;
                break;
            }
        }
        if (tablas) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}
