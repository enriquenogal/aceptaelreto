package level3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enogal
 */
public class Ejercicio700 {
    
    class Serie implements Comparable {
        String nombre;
        int minutos;

        public Serie(String nombre, int minutos) {
            this.nombre = nombre;
            this.minutos = minutos;
        }

        @Override
        public String toString() {
            //return nombre + " " + minutos;
            return nombre;
        }

        @Override
        public int compareTo(Object o) {
            Serie otra = (Serie)o;
            if (this.minutos != otra.minutos) {
                return Integer.compare(otra.minutos, this.minutos);
            } else {
                return this.nombre.compareTo(otra.nombre);
            }
        }
        
        
    }
    
    public static void main(String[] args) {
        (new Ejercicio700()).run();
    }
    
    public void run() {
        Scanner sc = new Scanner(System.in);
        int n, min;
        String nombreSerie;
        String[] datos;
        HashMap<String,Integer> m = new HashMap<String,Integer>();
        do {
            n = sc.nextInt();
            sc.nextLine();
            if (n!=0) {
                for (int i = 0; i < n; i++) {
                    datos = sc.nextLine().split(" ",2);
                    min = Integer.parseInt(datos[0]);
                    nombreSerie = datos[1];
                    if (!m.containsKey(nombreSerie)) {
                        m.put(nombreSerie, min);
                    } else {
                        m.put(nombreSerie, m.get(nombreSerie) + min);
                    }
                }
                tratarCaso(m);
                m.clear();
            }
        } while (n!=0);
    }
    
    public void tratarCaso(HashMap<String,Integer> m) {
        ArrayList<Serie> al = new ArrayList<Serie>();
        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            String key = entry.getKey();
            int val = entry.getValue();
            al.add(new Serie(key,val));
        }
        Collections.sort(al);
        //System.out.println(al);
        for (int i = 0; i < 3 && i < al.size(); i++) {
            if (al.get(i).minutos >= 30) {
                System.out.println(al.get(i));
            }
        }
        System.out.println("---");
    }
}
