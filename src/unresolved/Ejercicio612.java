package unresolved;

//TLE
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
public class Ejercicio612 {

    int contador;

    class Circulo {

        private int x;
        private int y;
        private int radio;

        public Circulo(int x, int y, int radio) {
            this.x = x;
            this.y = y;
            this.radio = radio;
        }

        public boolean puntoDentro(int puntoX, int puntoY) {
            double distancia = Math.sqrt(Math.pow(this.x - puntoX, 2) + Math.pow(this.y - puntoY, 2));
            if (distancia <= this.radio) {
                return true;
            } else {
                return false;
            }
        }

    }

    public static void main(String[] args) {
        new Ejercicio612().run();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        int radio, x, y;

        while (sc.hasNextLine()) {
            radio = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            sc.nextLine();

            this.contador = 0;
            if (radio >= 1) {
                generaCirculos(radio, 0, 0, x, y);
            }

            System.out.println(this.contador);

        }

    }

    public void generaCirculos(int radio, int x, int y, int puntoX, int puntoY) {
        Circulo c = new Circulo(x, y, radio);
        if (c.puntoDentro(puntoX, puntoY)) {
            this.contador++;
        }
        if (radio / 2 >= 1) {
            generaCirculos(radio / 2, x, y + radio, puntoX, puntoY);
            generaCirculos(radio / 2, x, y - radio, puntoX, puntoY);
            generaCirculos(radio / 2, x + radio, y, puntoX, puntoY);
            generaCirculos(radio / 2, x - radio, y, puntoX, puntoY);
        }
    }
}


