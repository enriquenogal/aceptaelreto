package level30;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio776 {

    static class Pasaje {

        int ini;
        int fin;

        public Pasaje(int ini, int fin) {
            this.ini = ini;
            this.fin = fin;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, platillo, contador, inicioSig;
        Pasaje[] pasajes;
        boolean sePuede;
        do {
            n = sc.nextInt();
            if (n != 0) {
                pasajes = new Pasaje[n];
                contador = 0;
                inicioSig = 0;
                for (int i = 0; i < n; i++) {
                    pasajes[i] = new Pasaje(sc.nextInt(), sc.nextInt());
                }
                do {
                    platillo = sc.nextInt();
                    if (platillo != 0) {
                        sePuede = true;
                        for (int i = inicioSig; i < pasajes.length; i++) {
                            if (platillo < pasajes[i].ini) {
                                inicioSig = i;
                                break;
                            }
                            if (platillo >= pasajes[i].ini && platillo <= pasajes[i].fin) {
                                sePuede = false;
                                inicioSig = i;
                                break;
                            }
                        }
                        if (sePuede) {
                            contador++;
                        }
                    }
                } while (platillo != 0);
                System.out.println(contador);
            }
        } while (n != 0);
    }
}
