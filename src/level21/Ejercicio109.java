package level21;

import java.util.HashMap;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
public class Ejercicio109 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String categoria = sc.nextLine();
        String partido, nombreWinner, nombreSecond;
        String[] datosPartido;
        String equipo1, equipo2;
        int puntos1, puntos2, puntosWinner, puntosSecond, partidosJugados;
        long numeroEquipos, numeroPartidosNecesarios;
        HashMap<String, Integer> equipos = new HashMap<String, Integer>();

        while (!categoria.equals("FIN")) {
            partidosJugados = 0;
            equipos.clear();
            partido = sc.nextLine();
            while (!partido.equals("FIN")) {
                datosPartido = partido.split(" ");
                equipo1 = datosPartido[0];
                equipo2 = datosPartido[2];
                puntos1 = Integer.parseInt(datosPartido[1]);
                puntos2 = Integer.parseInt(datosPartido[3]);
                if (puntos1 > puntos2) {
                    puntos1 = 2;
                    puntos2 = 1;
                } else {
                    puntos1 = 1;
                    puntos2 = 2;
                }
                //añadir al hashmap cada equipo si no existe
                if (!equipos.containsKey(equipo1)) {
                    equipos.put(equipo1, 0);
                }
                if (!equipos.containsKey(equipo2)) {
                    equipos.put(equipo2, 0);
                }
                //añadir puntos a los equipos
                equipos.put(equipo1, (int) equipos.get(equipo1) + puntos1);
                equipos.put(equipo2, (int) equipos.get(equipo2) + puntos2);
                //sumar uno a los partidos jugados
                partidosJugados++;
                partido = sc.nextLine();
            }
            //buscar ganador
            numeroEquipos = 0;
            puntosWinner = 0;
            nombreWinner = "";
            for (String i : equipos.keySet()) {
                numeroEquipos++;

                if (equipos.get(i) > puntosWinner) {
                    nombreWinner = i;
                    puntosWinner = equipos.get(i);
                }
            }
            //borro al ganador y busco al segundo
            equipos.remove(nombreWinner);
            puntosSecond = 0;
            nombreSecond = "";
            for (String i : equipos.keySet()) {
                if (equipos.get(i) > puntosSecond) {
                    nombreSecond = i;
                    puntosSecond = equipos.get(i);
                }
            }
            //comparo puntos del primero y segundo y si son iguales imprimo EMPATE, sino imprimo al ganador
            if (puntosWinner == puntosSecond) {
                System.out.print("EMPATE ");
            } else {
                System.out.print(nombreWinner + " ");
            }

            //calcular el número de partidos necesario, restarle en número de partidos jugados e imprimir - println
            numeroPartidosNecesarios = numeroEquipos * (numeroEquipos - 1);
            System.out.println(numeroPartidosNecesarios - partidosJugados);
            categoria = sc.nextLine();
        }
    }

}
