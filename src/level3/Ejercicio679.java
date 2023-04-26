package level3;


import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio679 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] palabras;
        ArrayList<String> salida, borrados;
        for (int i = 0; i < n; i++) {
            palabras = sc.nextLine().split(" ");
            salida = new ArrayList<String>();
            borrados = new ArrayList<String>();

            for (int j = 0; j < palabras.length; j++) {
                if (!palabras[j].equals("<") && !palabras[j].equals(">")) {
                    salida.add(palabras[j]);
                    borrados.clear();
                } else {
                    if (palabras[j].equals("<")) {
                        if (salida.size() > 0) {
                            borrados.add(salida.get(salida.size() - 1));
                            salida.remove(salida.size() - 1);
                        }
                    } else {
                        if (borrados.size() > 0) {
                            salida.add(borrados.get(borrados.size() - 1));
                            borrados.remove(borrados.size() -1);
                        } else if (salida.size() > 0) {
                            salida.add(salida.get(salida.size() - 1));
                        }
                    }
                }
                //System.out.println("Salida: " + salida);                
            }
            for (int j = 0; j < salida.size() - 1; j++) {
                if (j == salida.size() - 2) {
                    System.out.print(salida.get(j));
                } else {
                    System.out.print(salida.get(j) + " ");
                }
            }
            System.out.println();
        }

    }
}
