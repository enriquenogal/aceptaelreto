package level30;


import java.util.HashSet;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enogal
 */
public class Ejercicio328 {

    public static class Casilla {

        int x;
        int y;

        public Casilla(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 47 * hash + this.x;
            hash = 47 * hash + this.y;
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            final Casilla other = (Casilla) obj;
            return this.y == other.y && this.y == other.y;
        }
    }
    
    public static class Pollito {
        int v;
        int h;
        String dir;
        int pasos;
        public Pollito(int v, int h, String dir, int pasos) {
            this.v = v;
            this.h = h;
            this.dir = dir;
            this.pasos = pasos;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        int f, c, n;
        int a[][];
        Pollito p[];
        for (int i = 0; i < casos; i++) {
            f = sc.nextInt();
            c = sc.nextInt();
            n = sc.nextInt();
            a = new int[f][c];
            p = new Pollito[n];
            for (int j = 0; j < n; j++) {
                p[j] = new Pollito(sc.nextInt(), sc.nextInt(), sc.next(), sc.nextInt());
            }
            tratarCaso(a, p);
        }
    }

    public static void tratarCaso(int[][] a, Pollito[] p) {
        Casilla c;
        for (int i = 0; i < p.length; i++) {
            HashSet<Casilla> recorrido = new HashSet<Casilla>();
            for (int j = 0; j <= p[i].pasos; j++) {
                try {
                    //System.out.print("Paso por: " + p[i].v + "::" + p[i].h);
                    a[p[i].v - 1][p[i].h - 1]++;
                    recorrido.add(new Casilla(p[i].v, p[i].h));
                    //mostrarSalida(a);
                } catch (Exception e) {
                    break;
                }
                if (p[i].dir.equals("N")) {
                    c = new Casilla(p[i].v - 1, p[i].h);
                    if (!recorrido.contains(c)) {
                        p[i].v = p[i].v - 1;
                        p[i].dir = "E";
                    } else {
                        p[i].h = p[i].h - 1;
                        p[i].dir = "N";
                    }
                } else if (p[i].dir.equals("S")) {
                    c = new Casilla(p[i].v + 1, p[i].h);
                    if (!recorrido.contains(c)) {
                        p[i].v = p[i].v + 1;
                        p[i].dir = "W";
                    } else {
                        p[i].h = p[i].h + 1;
                        p[i].dir = "S";
                    }
                } else if (p[i].dir.equals("E")) {
                    c = new Casilla(p[i].v, p[i].h + 1);
                    if (!recorrido.contains(c)){
                        p[i].h = p[i].h + 1;
                        p[i].dir = "S";
                    } else {
                        p[i].v = p[i].v -1;
                        p[i].dir = "E";
                    }
                } else if (p[i].dir.equals("W")) {
                    c = new Casilla(p[i].v, p[i].h - 1);
                    if (!recorrido.contains(c)){
                        p[i].h = p[i].h - 1;
                        p[i].dir = "N";
                    } else {
                        p[i].v = p[i].v + 1;
                        p[i].dir = "W";
                    }
                }
                //System.out.println(" siguiente: " + p[i].v + "::" + p[i].h);
            }
        }
        mostrarSalida(a);
    }

    private static void mostrarSalida(int[][] a) {
        String salida = "";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                salida += a[i][j] + " ";
            }
            salida = salida.trim() + "\n";
        }
        salida += "---";
        System.out.println(salida);
    }
}
