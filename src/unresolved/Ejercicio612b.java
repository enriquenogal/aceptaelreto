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
public class Ejercicio612b {

    int contador;

    public static void main(String[] args) {
        new Ejercicio612b().run();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        int radio, x, y, contador;

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
        double distancia = Math.sqrt(Math.pow(x - puntoX, 2) + Math.pow(y - puntoY, 2));
        if (distancia <= radio) {
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
