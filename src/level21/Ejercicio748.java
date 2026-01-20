package level21;


import java.util.HashMap;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enogal
 */
public class Ejercicio748 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> hs = new HashMap<String, Integer>();
        int nLineas;
        int armas, nPersonas;
        String inicio, persona;
        do {
            nLineas = Integer.parseInt(sc.nextLine());
            if (nLineas != 0) {
                hs.clear();
                for (int i = 0; i < nLineas; i++) {
                    inicio = sc.next();
                    if (!inicio.equals("?")) {
                        armas = sc.nextInt();
                        addArmas(inicio, armas, hs);
                    } else {
                        nPersonas = sc.nextInt();
                        armas = 0;
                        for (int j = 0; j < nPersonas; j++) {
                            persona = sc.next();
                            armas += hs.get(persona);
                            hs.remove(persona);
                        }
                        System.out.println(armas);
                    }
                    sc.nextLine();
                }
                System.out.println("---");
            }
        } while (nLineas != 0);
    }

    private static void addArmas(String nombre, int armas, HashMap<String, Integer> hs) {
        if (hs.containsKey(nombre)) {
            hs.put(nombre, armas + hs.get(nombre));
        } else {
            hs.put(nombre, armas);
        }
    }

}
