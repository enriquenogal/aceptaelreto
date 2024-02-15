package level3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author enogal
 */
public class Ejercicio713b {
    class Equipo implements Comparable {
        int id;
        int pts = 0;
        int dif = 0;
        int gf = 0;
        public Equipo(int id) {
            this.id = id;
        }
        public void add(int pts, int dif, int gf) {
            this.pts += pts;
            this.dif += dif;
            this.gf += gf;
        }
        @Override
        public int compareTo(Object o) {
            Equipo otro = (Equipo) o;
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
        (new Ejercicio713b()).run();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int nEquipos, nClasificados;
        while (sc.hasNextLine()) {
            nEquipos = sc.nextInt();
            nClasificados = sc.nextInt();
            sc.nextLine();
            tratarCaso(sc, nEquipos, nClasificados);
        }
    }

    public void tratarCaso(Scanner sc, int nEquipos, int nClasificados) {
        ArrayList<Equipo> al = new ArrayList<Equipo>();
        for (int i = 0; i < nEquipos; i++) {
            al.add(new Equipo(i + 1));
        }
        int equipoA, marcadorA, equipoB, marcadorB;
        for (int i = 0; i < (nEquipos * (nEquipos - 1) / 2); i++) {
            equipoA = sc.nextInt();
            equipoB = sc.nextInt();
            marcadorA = sc.nextInt();
            marcadorB = sc.nextInt();
            sc.nextLine();
            if (marcadorA > marcadorB) {
                addPoints(al, equipoA, 3, marcadorA - marcadorB, marcadorA);
                addPoints(al, equipoB, 0, marcadorB - marcadorA, marcadorB);
            } else if (marcadorA < marcadorB) {
                addPoints(al, equipoA, 0, marcadorA - marcadorB, marcadorA);
                addPoints(al, equipoB, 3, marcadorB - marcadorA, marcadorB);
            } else {
                addPoints(al, equipoA, 1, marcadorA - marcadorB, marcadorA);
                addPoints(al, equipoB, 1, marcadorB - marcadorA, marcadorB);
            }
        }
        calculaClasificados(al, nClasificados);
    }

    public void addPoints(ArrayList<Equipo> al, int equipo, int pts, int dif, int gf) {
        al.get(equipo - 1).add(pts, dif, gf);
    }

    public static void calculaClasificados(ArrayList<Equipo> al, int nClasificados) {
        Collections.sort(al);
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
