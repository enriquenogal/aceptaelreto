/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a2026Reg;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author enogal
 */
public class Regional2026E {
    
    static class Nodo {
        int posicion;
        int coste;
        int salto;

        public Nodo(int posicion, int coste, int salto) {
            this.posicion = posicion;
            this.coste = coste;
            this.salto = salto;
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[] datos;
        do {
            n = sc.nextInt();
            if (n != 0) {
                datos = new int[n];
                for (int i = 0; i < n; i++) {
                    datos[i] = sc.nextInt();
                }
                tratarCaso(datos);
            }
        } while (n != 0);
    }

    private static void tratarCaso(int[] datos) {
        ArrayList<Nodo> pdtes = new ArrayList<Nodo>();
        ArrayList<Integer> procesados = new ArrayList<Integer>();
        int fin = datos.length;
        boolean encontrado = false;
        int resultado = 0;
        Nodo nodoTratar = null;
        //inserto el primer nodo
        pdtes.add(new Nodo(1, 0, datos[0]));
        
        while (pdtes.size() != 0 && encontrado == false) {
            nodoTratar = pdtes.get(0);
            pdtes.remove(0);
            if (nodoTratar.salto + nodoTratar.posicion >= fin) {
                resultado = nodoTratar.coste + 1;
                encontrado = true;
            } else {
                //genero los nuevos nodos y los añado al arraylist
                for (int i = 1; i <= nodoTratar.salto; i++) {
                    pdtes.add(new Nodo(nodoTratar.posicion + i, nodoTratar.coste + 1,datos[nodoTratar.posicion + i -1]));
                }
            }
        }
        
        if (encontrado) {
            System.out.println(resultado);
        } else {
            System.out.println("IMPOSIBLE");
        }
        
    }
}
