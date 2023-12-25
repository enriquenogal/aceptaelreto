package level2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio625 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tiras;
        int max;
        ArrayList<Integer> al;
        for (int i = 0; i < n; i++) {
            tiras = sc.nextInt();
            al = new ArrayList<Integer>();
            for (int j = 0; j < tiras; j++) {
                al.add(sc.nextInt());
            }
            
            Collections.sort(al, Collections.reverseOrder());
            max = 0;
            for (int j = 0; j < al.size() && max == 0; j++) {
                for (int k = 0; k < al.size() && max == 0; k++) {
                    for (int l = 0; l < al.size() && max == 0; l++) {
                        if (j != k && j != l && k != l) {
                            if (al.get(j) < al.get(k) + al.get(l)
                                    && al.get(k) < al.get(j) + al.get(l)
                                    && al.get(l) < al.get(k) + al.get(j)) {
                                    max = al.get(j) + al.get(k) + al.get(l); 
                            }
                        }
                    }
                }
            }

            if (max == 0) {
                System.out.println("NO HAY NINGUNO");
            } else {
                System.out.println(max);
            }
        }

    }

}
