
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
public class Regional2025G {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
            if (n != 0) {
                tratarCaso(n, sc);
            }
        } while (n != 0);
    }

    private static void tratarCaso(int n, Scanner sc) {
        boolean correcto = true;
        String anterior = "", actual = "";
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int v0, v1, f, max = 0;
        for (int i = 0; i < n; i++) {
            actual = sc.next();
            if (actual.length() < 2) {
                actual = "0" + actual;
            }
            if (i != 0) {
                if (anterior.charAt(1) != actual.charAt(0)) {
                    correcto = false;
                    sc.nextLine();
                    break;
                }
            }
            v0 = Character.getNumericValue(actual.charAt(0));
            v1 = Character.getNumericValue(actual.charAt(1));
            f = Math.max(v0, v1) * 10 + Math.min(v0, v1);
            if (!map.containsKey(f)) {
                map.put(f, 1);
            } else {
                map.put(f, map.get(f) + 1);
            }
            anterior = actual;
        }
        if (!correcto) {
            System.out.println("ERROR");
        } else {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int key = entry.getKey();
                int value = entry.getValue();
                if (value > max) {
                    max = value;
                }
            }
            System.out.println(max);
        }
    }
}
