package level30;


import java.util.HashSet;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enogal
 */
public class Ejercicio139 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
            if (n != 0) {
                tratarCaso(n);
            }
        } while (n != 0);
    }

    public static void tratarCaso(int n) {
        boolean cubinfinito = true;
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(n);
        System.out.print(n + " -");
        if (n != 1) {
            for (;;) {
                n = sumaCuboCifras(n);
                System.out.print(" " + n + " -");
                if (n == 1) {
                    break;
                } else if (hs.contains(n)) {
                    cubinfinito = false;
                    break;
                } else {
                    hs.add(n);
                }
            }
        }
        if (cubinfinito) {
            System.out.println("> cubifinito.");
        } else {
            System.out.println("> no cubifinito.");
        }
    }

    public static int sumaCuboCifras(int n) {
        int r = 0;
        String number = Integer.toString(n);
        for (char c : number.toCharArray()) {
            r += Math.pow(Character.getNumericValue(c), 3);
        }
        return r;
    }

}
