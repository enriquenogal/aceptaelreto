package level21;


import java.util.ArrayList;
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
public class Ejercicio624 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, max;
        String calcetin;
        ArrayList<String> al;
        do {
            n = sc.nextInt();
            sc.nextLine();
            if (n != 0) {
                max = 0;
                al = new ArrayList<String>();
                for (int i = 0; i < n; i++) {
                    calcetin = sc.next();
                    if (al.contains(calcetin)) {
                        al.remove(calcetin);
                    } else {
                        al.add(calcetin);
                        if (al.size() > max) {
                            max = al.size();
                        }
                    }
                }
                sc.nextLine();
                System.out.println(max);
            }
        } while (n != 0);

    }

}
