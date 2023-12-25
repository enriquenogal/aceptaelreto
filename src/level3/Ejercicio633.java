package level3;


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
public class Ejercicio633 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        HashSet<String> machos = new HashSet<String>();
        HashSet<String> hembras = new HashSet<String>();
        String animal, sexo;
        int parejasCompletas, parejasIncompletas, sobrantes;
        do {
            n = Integer.parseInt(sc.nextLine());
            if (n != 0) {
                machos.clear();
                hembras.clear();
                parejasCompletas = 0;
                parejasIncompletas = 0;
                sobrantes = 0;
                for (int i = 0; i < n; i++) {
                    animal = sc.next();
                    sexo = animal.substring(animal.length() - 1);
                    animal = animal.substring(0, animal.length() - 1);
                    if (sexo.equals("o")) {
                        if (machos.contains(animal)){
                            sobrantes++;
                        } else {
                            machos.add(animal);
                            if (hembras.contains(animal)) {
                                parejasCompletas++;
                            }
                        }
                    } else {
                        if (hembras.contains(animal)){
                            sobrantes++;
                        } else {
                            hembras.add(animal);
                            if (machos.contains(animal)) {
                                parejasCompletas++;
                            }
                        }
                    }
                }
                sc.nextLine();
                //System.out.println("Machos: " + machos);
                //System.out.println("Hembras: " + hembras);
                for (String hembra : hembras) {
                    if (!machos.contains(hembra)) {
                        parejasIncompletas++;
                    }
                }
                for (String macho : machos) {
                    if (!hembras.contains(macho)) {
                        parejasIncompletas++;
                    }
                }
                System.out.println(parejasCompletas + " " + parejasIncompletas + " " + sobrantes);
            }
        } while (n != 0);
    }
}
