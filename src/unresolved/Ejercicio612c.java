package unresolved;

//WA
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio612c {

    class Point {

        public double x;
        public double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

    }

    int contador;

    public static void main(String[] args) {
        new Ejercicio612c().run();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        int radio, x, y, contador;

        while (sc.hasNextLine()) {
            radio = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            sc.nextLine();

            this.contador = 0;
            if (radio >= 1) {
                generaCirculos(radio, 0, 0, x, y);
            }
            System.out.println(this.contador);

        }

    }

    public void generaCirculos(int radio, int x, int y, int puntoX, int puntoY) {
        int distancia2 = (x - puntoX) * (x - puntoX) + (y - puntoY) * (y - puntoY);
        if (distancia2 <= radio * radio) {
            this.contador++;
        }
        if (radio / 2 >= 1) {
            if (checkCuadrante(x, y, x, y + radio, puntoX, puntoY, radio)) {
                generaCirculos(radio / 2, x, y + radio, puntoX, puntoY);
            } else if (checkCuadrante(x, y, x, y - radio, puntoX, puntoY, radio)) {
                generaCirculos(radio / 2, x, y - radio, puntoX, puntoY);
            } else if (checkCuadrante(x, y, x + radio, y, puntoX, puntoY, radio)) {
                generaCirculos(radio / 2, x + radio, y, puntoX, puntoY);
            } else if (checkCuadrante(x, y, x - radio, y, puntoX, puntoY, radio)) {
                generaCirculos(radio / 2, x - radio, y, puntoX, puntoY);
            }
        }
    }

    public boolean checkCuadrante(int aX, int aY, int centroX, int centroY, int puntoX, int puntoY, int radio) {
        //ahora tendría que calcular otros vertices y ver si el punto está dentro
        //me falta el dato de la orientación a la que está el cuadrante que lo puedo sacar a través del centro
        //los otros vertices
        int bX, bY, cX, cY, dX, dY;
        //los calculo
        if (aX == centroX) {
            bX = centroX - radio;
            bY = centroY;
            cX = centroX + radio;
            cY = centroY;
            dX = centroX;
            if (centroY > aY) {
                dY = centroY + radio;
            } else {
                dY = centroY - radio;
            }
        } else {
            bX = centroX;
            bY = centroY - radio;
            cX = centroX;
            cY = centroY - radio;
            dY = centroY;
            if (centroX > aX) {
                dX = centroX + radio;
            } else {
                dX = centroX - radio;
            }
        }
        Point punto = new Point(puntoX, puntoY);
        Point puntos[] = new Point[4];
        puntos[0] = new Point(aX, aY);
        puntos[1] = new Point(bX, bY);
        puntos[2] = new Point(cX, cY);
        puntos[3] = new Point(dX, dY);

        //a partir de los vértices ya puedo determinar si el punto está dentro
        if (contains(punto, puntos)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean contains(Point test, Point[] points) {
        int i;
        int j;
        boolean result = false;
        for (i = 0, j = points.length - 1; i < points.length; j = i++) {
            if ((points[i].y > test.y) != (points[j].y > test.y)
                    && (test.x < (points[j].x - points[i].x) * (test.y - points[i].y) / (points[j].y - points[i].y) + points[i].x)) {
                result = !result;
            }
        }
        return result;
    }

}
