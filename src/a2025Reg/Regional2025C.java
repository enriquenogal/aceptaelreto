package a2025Reg;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enogal
 */
public class Regional2025C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
            if (n != 0) {
                tratarCaso(sc, n);
            }
        } while (n != 0);
    }

    private static void tratarCaso(Scanner sc, int n) {
        TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
        int tmp;
        int[] keys = new int[n];
        for (int i = 0; i < n; i++) {
            keys[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            tmp = sc.nextInt();
            tm.put(keys[i], tmp);
        }
        mostrarSalida(tm);
    }

    private static void mostrarSalida(TreeMap<Integer, Integer> tm) {
        boolean correcto = true, primero = true;
        int resta, anterior = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : tm.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            resta = value - key;
            if (resta >= anterior && !primero) {
                correcto = false;
                break;
            } else {
                anterior = resta;
                primero = false;
            }
        }
        if (correcto) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}
