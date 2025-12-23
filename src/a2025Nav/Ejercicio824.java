package a2025Nav;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enogal
 */
public class Ejercicio824 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nTramos, tramo, max, cont, vel;
        do {
            nTramos = sc.nextInt();
            if (nTramos != 0) {
                vel = 0;
                max = 0;
                cont = 0;
                for (int i = 0; i < nTramos; i++) {
                    tramo = sc.nextInt();
                    if (vel + tramo > 0 || (vel + tramo == 0 && tramo != 0)) {
                        vel += tramo;
                        cont++;
                        if (cont > max) {
                            max = cont;
                        }
                    } else {
                        cont = 0;
                        vel = 0;
                    }
                }
                System.out.println(max);
            }
        } while (nTramos != 0);
    }
}
