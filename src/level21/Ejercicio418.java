package level21;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
public class Ejercicio418 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, String> tm;
        ArrayList<String[]> al;
        int n = Integer.parseInt(sc.nextLine());
        int contador;
        String linea[];

        for (int i = 0; i < n; i++) {
            contador = 10;
            tm = new TreeMap<String, String>();
            al = new ArrayList<String[]>();
            do {
                linea = sc.nextLine().split(" ");
                if (!(linea[0].equals("0"))) {
                    al.add(linea);
                    tm.put(linea[0], Integer.toString(contador));
                    contador += 10;
                }
            } while (!(linea[0].equals("0")));
//            System.out.println(al);
//            System.out.println(tm);
            for (String s[] : al) {
                System.out.print(tm.get(s[0]));
                System.out.print(" ");
                System.out.print(s[1]);
                if (!s[1].equals("RETURN")) {
                    System.out.print(" ");
                    System.out.print(tm.get(s[2]));
                }
                System.out.println();
            }
            System.out.println("---");
        }

    }

}
