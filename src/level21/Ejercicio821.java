package level21;


import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio821 {

    static class Ramal implements Comparable<Ramal> {

        String nombrePropietario;
        String lado;
        int distancia;

        public Ramal(String nombrePropietario, String lado, int distancia) {
            this.nombrePropietario = nombrePropietario;
            this.lado = lado;
            this.distancia = distancia;
        }

        @Override
        public int compareTo(Ramal o) {
            if (this.distancia != o.distancia) {
                return Integer.compare(this.distancia, o.distancia);
            } else {
                return o.lado.compareTo(this.lado);
            }
        }

        @Override
        public String toString() {
            return nombrePropietario;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nRamales;
        Ramal[] aRamales;
        do {
            nRamales = sc.nextInt();
            if (nRamales != 0) {
                aRamales = new Ramal[nRamales];
                for (int i = 0; i < nRamales; i++) {
                    aRamales[i] = new Ramal(sc.next(), sc.next(), sc.nextInt());
                }
                Arrays.sort(aRamales);
                for (Ramal r : aRamales) {
                    System.out.println(r);
                }
                System.out.println("---");
            }
        } while (nRamales != 0);
    }
}
