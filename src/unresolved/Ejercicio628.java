package unresolved;


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
public class Ejercicio628 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sabor, piel, mejorSabor, mejorPiel;
        boolean encontrada = false;
        while (sc.hasNextLine()) {
            mejorSabor = Long.MIN_VALUE;
            mejorPiel = Long.MAX_VALUE;
            encontrada = false;
            while (true) {
                sabor = sc.nextLong();
                piel = sc.nextLong();
                if (sabor == 0 && piel == 0) {
                    sc.nextLine();
                    break;
                } else {
                    if ((sabor > mejorSabor) || (piel < mejorPiel)) {
                        if (sabor > mejorSabor) {
                            mejorSabor = sabor;
                        }
                        if (piel < mejorPiel) {
                            mejorPiel = piel;
                        }
                        if (sabor == mejorSabor && piel == mejorPiel) {
                            encontrada = true;
                        } else {
                            encontrada = false;
                        }
                    }
                }
            }
            if (encontrada == true) {
                System.out.println(mejorSabor + " " + mejorPiel);
            } else {
                System.out.println("NO HAY MEJOR");
            }
        }
    }

}
