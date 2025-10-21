/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package level3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author enogal
 */
public class Ejercicio109a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String categoria;
        do {
            categoria = sc.next();
            if (!categoria.equals("FIN")) {
                tratarCategoria(sc);
            }
        } while (!categoria.equals("FIN"));
    }

    private static void tratarCategoria(Scanner sc) {
        HashMap<String, Integer> clasificacion = new HashMap<String, Integer>();
        String eq1, eq2;
        int sets1, sets2, c = 0;
        do {
            eq1 = sc.next();
            if (!eq1.equals("FIN")) {
                c++;
                sets1 = sc.nextInt();
                eq2 = sc.next();
                sets2 = sc.nextInt();
                if (sets1 > sets2) {
                    addPts(clasificacion, eq1, 2);
                    addPts(clasificacion, eq2, 1);
                } else {
                    addPts(clasificacion, eq2, 2);
                    addPts(clasificacion, eq1, 1);
                }
            } 
        } while (!eq1.equals("FIN"));
        generarSalida(clasificacion, c);
    }

    private static void generarSalida(HashMap<String, Integer> clasificacion, int c) {
        String winner = "";
        int ptsWinner = 0;
        int partidosRestantes  = (clasificacion.size() * (clasificacion.size() - 1)) - c;
        for (Map.Entry<String, Integer> entry : clasificacion.entrySet()) {
            String key = entry.getKey();
            int val = entry.getValue();
            if (val > ptsWinner) {
                ptsWinner = val;
                winner = key;
            } else if (val == ptsWinner) {
                winner = "EMPATE";
            }
        }
        System.out.println(winner + " " + partidosRestantes);
    }

    private static void addPts(HashMap<String, Integer> clasificacion, String eq, int pts) {
        if (!clasificacion.containsKey(eq)) {
            clasificacion.put(eq, pts);
        } else {
            clasificacion.put(eq, pts + clasificacion.get(eq));
        }
    }
}
