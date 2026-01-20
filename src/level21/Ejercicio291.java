package level21;


import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
public class Ejercicio291 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, TreeSet<Integer>> tm = new TreeMap<>();
        int n = -1;
        String[] linea;

        while (n != 0) {
            n = Integer.parseInt(sc.nextLine());
            if (n != 0) {
                tm.clear();
                for (int i = 0; i < n; i++) {
                    linea = sc.nextLine().toLowerCase().trim().split(" ");
                    for (int j = 0; j < linea.length; j++) {
                        if (linea[j].length() > 2) {
                            if (!tm.containsKey(linea[j])) {
                                tm.put(linea[j], new TreeSet<Integer>());
                            }
                            tm.get(linea[j]).add(i+1);
                        }
                    }
                }
                for (String key: tm.keySet()) {
                    System.out.print(key);
                    for (Integer numero: tm.get(key)) {
                        System.out.print(" " + numero);
                    }
                    System.out.println("");   
                }
                System.out.println("----");
            }
        }
    }
}