package level30;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enogal
 */
public class Ejercicio767b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[] a;
        int posMayor, valorMayor, tmpMayor;
        do {
            n = sc.nextInt();
            if (n != 0) {
                a = new int[n];
                posMayor = 0;
                valorMayor = Integer.MIN_VALUE;
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                    tmpMayor = a[i] + 1;
                    if (a[i] >= valorMayor) {
                        posMayor = i;
                        valorMayor = a[i];
                    } else if (tmpMayor >= valorMayor) {
                        posMayor = i;
                        valorMayor = valorMayor + (i - posMayor) - 1;
                    }
                    //System.out.println(posMayor + " --- " + valorMayor);
                }
                tratarCaso(a, posMayor, valorMayor);
            }
        } while (n != 0);
    }

    private static void tratarCaso(int[] a, int posMayor, int valorMayor) {
        int[] r = new int[a.length];
        int objetivo;
        r[posMayor] = 0;
        objetivo = valorMayor + 1;
        for (int i = posMayor - 1; i >= 0; i--) {
            r[i] = objetivo - a[i];
            objetivo++;
        }
        objetivo = valorMayor - 1;
        for (int i = posMayor + 1; i < a.length; i++) {
            r[i] = objetivo - a[i];
            objetivo--;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < r.length; i++) {
            sb.append(r[i]);
            if (i < r.length - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
