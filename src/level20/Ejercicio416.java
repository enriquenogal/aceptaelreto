package level20;




import java.util.ArrayList;
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
public class Ejercicio416 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cumples = new ArrayList<String>();
        String[] entradas;
        String cumple;
        boolean coincide;
        int n = -1, i;

        while (n != 0) {
            n = Integer.parseInt(sc.nextLine());
            if (n != 0) {
                cumples.clear();
                coincide = false;
                for (i = 0; i < n; i++) {
                    entradas = sc.next().split("/");
                    cumple = entradas[0] + "/" + entradas[1];
                    if (cumples.contains(cumple)) {
                        coincide = true;
                        break;
                    } else {
                        cumples.add(cumple);
                    }
                }
                sc.nextLine();
                if (coincide) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            }
        }

    }
}
