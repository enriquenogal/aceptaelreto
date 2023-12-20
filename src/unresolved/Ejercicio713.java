package unresolved;

//RTE
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
public class Ejercicio713 {
    
    
    class Equipo implements Comparable {
        int id;
        int pts = 0;
        int dif = 0;
        int gf = 0;
        public Equipo(int id) {
            this.id = id;
        }
        public void addPuntos(int pts) {
            this.pts += pts;
        }
        public void addDif(int dif) {
            this.dif += dif;
        }
        public void addGF(int gf) {
            this.gf += gf;
        }

        @Override
        public int compareTo(Object o) {
            Equipo otro = (Equipo)o;
            if (this.pts != otro.pts) {
                return Integer.compare(otro.pts, this.pts);
            } else if (this.dif != otro.dif) {
                return Integer.compare(otro.dif, this.dif);
            } else {
                return Integer.compare(otro.gf, this.gf);
            }
        }

        @Override
        public String toString() {
            return "Equipo{" + "id=" + id + ", pts=" + pts + ", dif=" + dif + ", gf=" + gf + '}';
        }

        @Override
        public int hashCode() {
            int hash = 7;
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
            final Equipo other = (Equipo) obj;
            if (this.pts != other.pts) {
                return false;
            }
            if (this.dif != other.dif) {
                return false;
            }
            return this.gf == other.gf;
        }
        
        
    }
    
    public static void main(String[] args) {
        (new Ejercicio713()).run();
    }
    
    public void run() {
        Scanner sc = new Scanner(System.in);
        int nEquipos, nClasificados;
        while (sc.hasNextInt()) {
            nEquipos = sc.nextInt();
            nClasificados = sc.nextInt();
            //sc.nextLine();
            tratarCaso(sc,nEquipos,nClasificados);
        }
    }
    
    public void tratarCaso(Scanner sc, int nEquipos, int nClasificados) {
        HashMap<Integer,Equipo> hs = new HashMap<Integer,Equipo>();
        int equipoA, marcadorA, equipoB, marcadorB;
        for (int i = 0; i < (nEquipos * (nEquipos - 1) / 2); i++) {
            equipoA = sc.nextInt();
            equipoB = sc.nextInt();
            marcadorA = sc.nextInt();
            marcadorB = sc.nextInt();
            //sc.nextLine();
            if (marcadorA > marcadorB) {
                addPoints(hs,equipoA, 3, marcadorA - marcadorB, marcadorA);
                addPoints(hs, equipoB, 0, marcadorB - marcadorA, marcadorB);
            } else if (marcadorA < marcadorB) {
                addPoints(hs,equipoA, 0, marcadorA - marcadorB, marcadorA);
                addPoints(hs, equipoB, 3, marcadorB - marcadorA, marcadorB);
            } else {
                addPoints(hs,equipoA, 0, marcadorA - marcadorB, marcadorA);
                addPoints(hs, equipoB, 0, marcadorB - marcadorA, marcadorB);
            }
        }
        calculaClasificados(hs, nClasificados);
    }
    
    public void addPoints(HashMap<Integer,Equipo> hs, int equipo, int pts, int dif, int gf) {
        if (!hs.containsKey(equipo)) {
            hs.put(equipo, new Equipo(equipo));
        }
        Equipo e = hs.get(equipo);
        e.addPuntos(pts);
        e.addDif(dif);
        e.addGF(gf);
    }
    
    public static void calculaClasificados(HashMap<Integer,Equipo> hs, int nClasificados) {
        ArrayList<Equipo> al = new ArrayList<Equipo>(hs.values());
        Collections.sort(al);
//        for (Equipo equipo : al) {
//            System.out.println(equipo);
//        }
        String s = "";
        for (int i = 0; i < nClasificados; i++) {
            s = s + al.get(i).id + " ";
            if (i <= al.size() - 2) {
                if (al.get(i).equals(al.get(i + 1))) {
                    s = "EMPATE";
                    break;
                }
            }
        }
        System.out.println(s.trim());
    }
}
