package level2;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio774 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, tmp;
        long acum;
        Map<Integer, Integer> primeraLuz;
        Map<Integer, Integer> ultimaLuz;
        do {
            n = sc.nextInt();
            if (n != 0) {
                acum = 0;
                primeraLuz = new HashMap<Integer, Integer>();
                ultimaLuz = new HashMap<Integer, Integer>();
                for (int i = 0; i < n; i++) {
                    tmp = sc.nextInt();
                    if (!primeraLuz.containsKey(tmp)) {
                        primeraLuz.put(tmp, i);
                    }
                    ultimaLuz.put(tmp, i);
                }
                for (Map.Entry<Integer, Integer> entry : primeraLuz.entrySet()) {
                    int key = entry.getKey();
                    int value = entry.getValue();
                    acum += ultimaLuz.get(key) - value;
                }
                System.out.println(acum);
            }
        } while (n != 0);
    }
}
