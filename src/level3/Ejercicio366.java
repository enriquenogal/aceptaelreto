package level3;


import java.util.Arrays;
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
public class Ejercicio366 {

    static class Baby implements Comparable<Baby> {

        int comportamiento;
        int peso;

        public Baby(int comportamiento, int peso) {
            this.comportamiento = comportamiento;
            this.peso = peso;
        }

        @Override
        public int compareTo(Baby o) {
            if (this.comportamiento > o.comportamiento) {
                return -1;
            } else if (this.comportamiento < o.comportamiento) {
                return 1;
            } else {
                if (this.peso < o.peso) {
                    return -1;
                } else if (this.peso > o.peso) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = -1;
        Baby[] array;

        while (n != 0) {
            n = Integer.parseInt(sc.nextLine());
            if (n != 0) {
                array = new Baby[n];
                for (int i = 0; i < n; i++) {
                    array[i] = new Baby(sc.nextInt(), sc.nextInt());
                    sc.nextLine();
                }

                Arrays.sort(array);

                for (int i = 0; i < array.length; i++) {
                    System.out.println(array[i].comportamiento + " " + array[i].peso);
                }
                System.out.println("");

            }
        }

    }

}
