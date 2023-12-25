package unresolved;


import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio639b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sumaC, tmp;
        ArrayList<Integer> a;
        ArrayList<Integer> b;
        ArrayList<Integer> c;
        while (sc.hasNextInt()) {
            n = sc.nextInt();
            a = new ArrayList<Integer>();
            a.add(sc.nextInt());
            b = new ArrayList<Integer>();
            b.add(sc.nextInt());
            c = new ArrayList<Integer>();
            sumaC = 0;
            for (int i = 2; i < n; i++) {
                tmp = sc.nextInt();
                sumaC += tmp;
                c.add(tmp);
            }
            System.out.println(tratarCaso(a, b, c, sumaC));
        }

    }

    public static int tratarCaso(ArrayList<Integer> a, ArrayList<Integer> b, ArrayList<Integer> c, int sumaC) {
        int min, minTmp, sumaA, sumaB, difAB, difAC, difBC;
        sumaA = a.get(0);
        sumaB = b.get(0);
        //sumaC = c.stream().mapToInt(Integer::intValue).sum();
        difAB = Math.abs(sumaA - sumaB);
        difAC = Math.abs(sumaA - sumaC);
        difBC = Math.abs(sumaB - sumaC);
        min = Math.max(Math.max(difAB, difAC), difBC);
        if (min == 0) {
            return 0;
        }
        for (int i = 0; i < c.size() - 1; i++) {
            sumaC -= c.get(0);
            sumaB += c.get(0);
            b.add(c.get(0));
            c.remove(0);
            difAB = Math.abs(sumaA - sumaB);
            if (difAB < min) {
                difAC = Math.abs(sumaA - sumaC);
                if (difAC < min) {
                    difBC = Math.abs(sumaB - sumaC);
                    if (difBC < min) {
                        minTmp = Math.max(Math.max(difAB, difAC), difBC);
                        if (minTmp == 0) {
                            return 0;
                        } else if (minTmp < min) {
                            min = minTmp;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < b.size() - 1; i++) {
            sumaB -= b.get(0);
            sumaA += b.get(0);
            a.add(b.get(0));
            b.remove(0);
            difAB = Math.abs(sumaA - sumaB);
            if (difAB < min) {
                difAC = Math.abs(sumaA - sumaC);
                if (difAC < min) {
                    difBC = Math.abs(sumaB - sumaC);
                    if (difBC < min) {
                        minTmp = Math.max(Math.max(difAB, difAC), difBC);
                        if (minTmp == 0) {
                            return 0;
                        } else if (minTmp < min) {
                            min = minTmp;
                        }
                    }
                }
            }
        }
        return min;
    }
}
