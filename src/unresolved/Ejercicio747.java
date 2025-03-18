package unresolved;


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
public class Ejercicio747 {

    static class Nodo {

        int x;
        int y;

        public Nodo(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 97 * hash + this.x;
            hash = 97 * hash + this.y;
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Nodo other = (Nodo) obj;
            if (this.x != other.x) {
                return false;
            }
            return this.y == other.y;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dimA, dimB;
        ArrayList<Nodo> al;
        char[][] mapa;
        String linea;
        do {
            dimA = sc.nextInt();
            dimB = sc.nextInt();
            sc.nextLine();
            if (!(dimA == 0 && dimB == 0)) {
                mapa = new char[dimA][dimB];
                for (int i = 0; i < dimA; i++) {
                    linea = sc.nextLine();
                    for (int j = 0; j < dimB; j++) {
                        mapa[i][j] = linea.charAt(j);
                    }
                }
                tratarCaso(mapa);
            }
        } while (!(dimA == 0 && dimB == 0));
    }

    static boolean fin;

    private static void tratarCaso(char[][] mapa) {
        ArrayList<Nodo> pendientes = new ArrayList<Nodo>();
        ArrayList<Nodo> procesados = new ArrayList<Nodo>();
        fin = false;
        pendientes.add(new Nodo(0, 0));
        while (pendientes.size() != 0) {
            procesados.add(pendientes.get(0));
            tratarNodo(pendientes.get(0), pendientes, procesados, mapa);
        }
        if (fin == true) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }

    private static void tratarNodo(Nodo n, ArrayList<Nodo> pendientes, ArrayList<Nodo> procesados, char[][] mapa) {
        pendientes.remove(0);
        if (n.x == mapa.length - 1 && n.y == mapa[0].length - 1) {
            fin = true;
            pendientes.clear();
        } else {
            try {
                if (mapa[n.x + 1][n.y] == '.' && !procesados.contains(new Nodo(n.x + 1, n.y))) {
                    pendientes.add(new Nodo(n.x + 1, n.y));
                }
            } catch (Exception e) {
            }
            try {
                if (mapa[n.x - 1][n.y] == '.' && !procesados.contains(new Nodo(n.x - 1, n.y))) {
                    pendientes.add(new Nodo(n.x - 1, n.y));
                }
            } catch (Exception e) {
            }
            try {
                if (mapa[n.x][n.y + 1] == '.' && !procesados.contains(new Nodo(n.x, n.y + 1))) {
                    pendientes.add(new Nodo(n.x, n.y + 1));
                }
            } catch (Exception e) {
            }
            try {
                if (mapa[n.x][n.y - 1] == '.' && !procesados.contains(new Nodo(n.x, n.y - 1))) {
                    pendientes.add(new Nodo(n.x, n.y - 1));
                }
            } catch (Exception e) {
            }
        }
    }
} 

