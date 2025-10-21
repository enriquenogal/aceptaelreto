package level3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enogal
 */
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio779Map {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numFotogramas;
        int numCopias;
        do {
            numFotogramas = sc.nextInt();
            numCopias = sc.nextInt();
            if (numFotogramas != 0 && numCopias != 0) {
                tratarCaso(sc, numFotogramas, numCopias);
            }
        } while (numFotogramas != 0 && numCopias != 0);
    }

    private static void tratarCaso(Scanner sc, int numFotogramas, int numCopias) {
        TreeMap<Integer, Integer> fragmentos = new TreeMap<Integer, Integer>();
        for (int i = 0; i < numCopias; i++) {
            int numFragmentos = sc.nextInt();
            for (int j = 0; j < numFragmentos; j++) {
                String[] fragmento = sc.next().split(",");
                int inicio = Integer.parseInt(fragmento[0]);
                int fin = Integer.parseInt(fragmento[1]);
                if (fragmentos.containsKey(inicio)) {
                    if (fin > fragmentos.get(inicio)) {
                        fragmentos.put(inicio, fin);
                    }
                } else {
                    fragmentos.put(inicio, fin);
                }
            }
        }
        generarSalida(fragmentos, numFotogramas);
    }

    private static void generarSalida(TreeMap<Integer, Integer> fragmentos, int numFotogramas) {
        int acumuladoInicio = 0;
        int acumuladoFin = 0;
        boolean primero = true;
        boolean esPosible = true;
        for (Map.Entry<Integer, Integer> entry : fragmentos.entrySet()) {
            int actualInicio = entry.getKey();
            int actualFin = entry.getValue();
            if (primero) {
                acumuladoInicio = actualInicio;
                acumuladoFin = actualFin;
                primero = false;
            } else {
                if (actualInicio <= acumuladoFin + 1) {
                    acumuladoFin = Math.max(acumuladoFin, actualFin);
                } else {
                    esPosible = false;
                    break;
                }
            }
        }
        if (acumuladoInicio != 1 || acumuladoFin != numFotogramas) {
            esPosible = false;
        }

        if (esPosible) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }

}
