package level20;


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
public class Ejercicio765{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String s, ganadorMinus, ganadorMayus;
        Map<String, Integer> minus = new HashMap<String, Integer>();
        Map<String, Integer> mayus = new HashMap<String, Integer>();
        do {
            n = sc.nextInt();
            if (n != 0) {
                for (int i = 0; i < n; i++) {
                    s = sc.next().trim();
                    if (Character.isLowerCase(s.charAt(0))) {
                        sumaVoto(s, minus);
                    } else {
                        sumaVoto(s, mayus);
                    }
                }
                ganadorMinus = calculaWinner(minus);
                ganadorMayus = calculaWinner(mayus);
                System.out.print(ganadorMinus.toLowerCase() + " ");
                System.out.println(ganadorMayus.toUpperCase());
                minus.clear();
                mayus.clear();
            }
        } while (n != 0);
    }
    public static void sumaVoto(String s, Map<String, Integer> m) {
        if (!m.containsKey(s)) {
            m.put(s, 1);
        } else {
            m.put(s, m.get(s) + 1);
        }
    }

    public static String calculaWinner(Map<String, Integer> mayus) {
        String winner = "";
        int votosWinner = 0;
        for (Map.Entry<String, Integer> entry : mayus.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            if (value > votosWinner) {
                winner = key;
                votosWinner = value;
            } else if (value == votosWinner) {
                winner = "empate";
            }
        }
        return winner;
    }
}