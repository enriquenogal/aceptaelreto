
import java.util.ArrayList;
import java.util.List;
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
            if (this.distancia != o.distancia) return Integer.compare(this.distancia, o.distancia);
            else return this.lado.compareTo(o.lado);
        }
                
        
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nRamales;
        List<Ramal> listaRamales = new ArrayList<Ramal>();
        do {
            nRamales = sc.nextInt();
            if (nRamales != 0) {
                listaRamales.clear();
                for (int i = 0; i < nRamales; i++) {
                    listaRamales.add(new Ramal(sc.next(), sc.next(), sc.nextInt()));
                }
            }
        } while (nRamales != 0);
        
    }
    
}
