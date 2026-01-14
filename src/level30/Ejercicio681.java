package level30;

//WA


import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio681 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n;
        ArrayList<Long> escaleras = new ArrayList<Long>();
        while (sc.hasNext()) {
            n = sc.nextLong();
            escaleras.clear();
            for (long i = 0; i < n; i++) {
                escaleras.add(sc.nextLong());
            }
            tratarCaso(escaleras);
        }
    }

    public static void tratarCaso(ArrayList<Long> escaleras) {
        long piezasTmp = 0, escalones = 0, piezasDiferencia = 0;
        Collections.sort(escaleras);
        Collections.reverse(escaleras);
        for (int i = 0; i < escaleras.size() -1 ; i++) {
            if (Objects.equals(escaleras.get(i), escaleras.get(i + 1))) {
                piezasTmp = escaleras.get(i + 1) - 1;
                escaleras.set(i + 1, piezasTmp);
            } else if (escaleras.get(i) < escaleras.get(i + 1)) {
                piezasDiferencia = escaleras.get(i + 1) - escaleras.get(i);
                escaleras.set(i + 1, escaleras.get(i + 1) - (piezasDiferencia + 1));
            }
            if (escaleras.get(i + 1) <= 0) {
                escaleras.remove(i + 1);
                i--;
            }
        }
        for (int i = 0; i < escaleras.size(); i++) {
            escalones = escalones + escaleras.get(i);
        }

        System.out.println(escalones);
    }
}
