package level2;


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
public class Ejercicio683 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mayor, menor, dif, n, t;
        int lastMayor, lastMenor;
        do {
            n = sc.nextInt();
            if (n != 0) {
                mayor = Integer.MIN_VALUE;
                menor = Integer.MAX_VALUE;
                dif = Integer.MAX_VALUE;
                lastMenor = Integer.MAX_VALUE;
                lastMayor = Integer.MAX_VALUE;
                for (int i = 0; i < n; i++) {
                    t = sc.nextInt();
                    if (t >= mayor) {
                        lastMayor = i;
                        if (t > mayor) {
                            dif = Math.abs(lastMayor - lastMenor);
                        } else {
                            if (dif >= Math.abs(lastMayor - lastMenor)) {
                                dif = Math.abs(lastMayor - lastMenor);
                            }
                        }
                        mayor = t;
                    }
                    if (t <= menor) {
                        lastMenor = i;
                        if (t < menor) {
                            dif = Math.abs(lastMayor - lastMenor);
                        } else {
                            if (dif >= Math.abs(lastMayor - lastMenor)) {
                                dif = Math.abs(lastMayor - lastMenor);
                            }
                        }
                        menor = t;
                    }
                }
                System.out.println(menor + " " + mayor + " " + dif);
            }
        } while (n != 0);
    }

}
