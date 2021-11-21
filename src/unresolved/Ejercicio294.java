package unresolved;

//TLE

import java.util.ArrayList;
import java.util.Collections;
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
public class Ejercicio294 {

    ArrayList<Cuerda> cuerdas = new ArrayList<Cuerda>();
    long nCuerdas, longTotal, maneras, cuerdasMin, costeMin;

    private class Cuerda implements Comparable<Cuerda>{

        public Cuerda(long longitud, long precio) {
            this.longitud = longitud;
            this.precio = precio;
        }
        long longitud;
        long precio;

        @Override
        public int compareTo(Cuerda o) {
            if (this.longitud < o.longitud) {
                return -1;
            } else if (this.longitud > o.longitud){
                return 1;
            } else {
                return 0;
            }

        }
    }

    public static void main(String[] args) {
        new Ejercicio294().run();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        long longCuerda;
        long precioCuerda;

        while (sc.hasNextLine()) {
            this.maneras = 0;
            this.cuerdasMin = -1;
            this.costeMin = -1;
            this.nCuerdas = sc.nextLong();
            this.longTotal = sc.nextLong();
            this.cuerdas.clear();
            sc.nextLine();
            for (int i = 0; i < this.nCuerdas; i++) {
                longCuerda = sc.nextLong();
                precioCuerda = sc.nextLong();
                if (longCuerda < this.longTotal) {
                    this.cuerdas.add(new Cuerda(longCuerda, precioCuerda));
                } else if (longCuerda == this.longTotal) {
                    this.maneras++;
                    this.cuerdasMin = 1;
                    if (this.costeMin == -1 || this.costeMin > precioCuerda) {
                        this.costeMin = precioCuerda;
                    }
                }
                sc.nextLine();
            }
            Collections.sort(cuerdas);
            for (int i = 0; i < this.cuerdas.size(); i++) {
                this.combinar(i, 0, 0, 0);
            }
            if (this.maneras == 0) {
                System.out.println("NO");
            } else {
                System.out.println("SI " + this.maneras + " " + this.cuerdasMin + " " + this.costeMin);
            }
        }
    }

    public void combinar(int posicion, long longAcumPrevia, long cuerdasAcumPrevia, long precioAcumPrevia) {
        long longAcum = longAcumPrevia + this.cuerdas.get(posicion).longitud;
        long cuerdasAcum = cuerdasAcumPrevia + 1;
        long precioAcum = precioAcumPrevia + this.cuerdas.get(posicion).precio;
        if (longAcum == this.longTotal) {
            this.maneras++;
            if (this.costeMin == -1 || this.costeMin > precioAcum) {
                this.costeMin = precioAcum;
            }
            if (this.cuerdasMin == -1 || this.cuerdasMin > cuerdasAcum) {
                this.cuerdasMin = cuerdasAcum;
            }
        } else if (longAcum < this.longTotal) {
            for (int i = posicion + 1; i < this.cuerdas.size(); i++) {
                combinar(i, longAcum, cuerdasAcum, precioAcum);
            }
        }
    }
}
