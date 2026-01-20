package level21;


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
public class Ejercicio338 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> hm;
        int n, k, r, profe, real;
        while (sc.hasNextLine()) {
            hm = new HashMap<Integer, Integer>();
            n = sc.nextInt();
            k = sc.nextInt();
            profe = 0;
            real = 0;
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                r = sc.nextInt();
                if (hm.containsKey(r)) {
                    real++;
                    if (hm.get(r) >= (i - k)) {
                        profe++;
                    }
                }
                hm.put(r, i);
            }
            sc.nextLine();
            System.out.println(real + " " + profe);
        }

    }

}
