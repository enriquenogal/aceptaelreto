package aReg2025;


import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enogal
 */
public class Regional2025I {
    
    static class Plato {
        int momento;
        int tiempoFregar;

        public Plato(int momento, int tiempoFregar) {
            this.momento = momento;
            this.tiempoFregar = tiempoFregar;
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
            if (n != 0) {
                tratarCaso(sc,n);
            }
        } while (n != 0);
    }

    private static void tratarCaso(Scanner sc, int n) {
        ArrayList<Plato> al = new ArrayList<Plato>();
        Plato p;
        String salida = "";
        for (int i = 0; i < n; i++) {
            p = new Plato(sc.nextInt(),sc.nextInt());
            
            salida += al.size() + " ";
            al.add(p);
        }
        System.out.println(salida);
    }
}
