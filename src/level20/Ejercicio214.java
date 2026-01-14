package level20;


import java.util.HashMap;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
public class Ejercicio214 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> hs = new HashMap<String, Integer>();
        int n = -1, m;
        String rey;
        while (n != 0) {
            n = Integer.parseInt(sc.nextLine());
            if (n != 0) {
                hs.clear();
                for (int i = 0; i < n; i++) {
                    rey = sc.next();
                    if (hs.containsKey(rey)) {
                        hs.put(rey, hs.get(rey) + 1);
                    } else {
                        hs.put(rey, 1);
                    }
                }
                sc.nextLine();
                m = Integer.parseInt(sc.nextLine());
                for (int i = 0; i < m; i++) {
                    rey = sc.next();
                    if (hs.containsKey(rey)) {
                        System.out.println(hs.get(rey) + 1);
                        hs.put(rey, hs.get(rey) + 1);
                    } else {
                        System.out.println("1");
                        hs.put(rey, 1);
                    }
                }
                System.out.println("");
                sc.nextLine();
            }
        }

    }
}
