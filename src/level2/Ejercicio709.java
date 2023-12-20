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
 * @author enogal
 */
public class Ejercicio709 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> hs;
        int n;
        String s;
        do {
            n = sc.nextInt();
            if (n > 0) {
                hs = new HashMap<String, Integer>();
                for (int i = 0; i < n; i++) {
                    s = sc.next();
                    if (hs.containsKey(s)) {
                        hs.put(s, hs.get(s) + 1);
                    } else {
                        hs.put(s, 1);
                    }
                }
                System.out.println(winner(hs));
            }
        } while (n > 0);
    }
    
    public static String winner(HashMap<String,Integer> hs) {
        String winner = "";
        int max = 0;
        for (Map.Entry<String, Integer> entry : hs.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            if (value > max) {
                winner = key;
                max = value;
            } else if (value == max) {
                winner = "EMPATE";
            }
        }
        return winner;
    }
}
