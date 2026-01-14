package level30;


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
public class Ejercicio479 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        String direccion;
        String[] entradas;
        char[][] tablero;
        int numeroIntentos, distancia, fila, columna;
        boolean encontrado;

        while (!entrada.equals("0 0")) {
            entradas = entrada.split(" ");
            tablero = new char[Integer.parseInt(entradas[0])][Integer.parseInt(entradas[1])];
            for (int i = 0; i < tablero.length; i++) {
                entrada = sc.nextLine();
                for (int j = 0; j < tablero[i].length; j++) {
                    tablero[i][j] = entrada.charAt(j);
                }
            }
            numeroIntentos = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < numeroIntentos; i++) {
                distancia = 0;
                encontrado = false;
                entrada = sc.nextLine();
                entradas = entrada.split(" ");
                fila = Integer.parseInt(entradas[0]) - 1;
                columna = Integer.parseInt(entradas[1]) - 1;
                direccion = entradas[2];

                if (direccion.equals("ARRIBA")) {
                    for (int j = fila; j >= 0; j--) {
                        if (tablero[j][columna] == 'X') {
                            encontrado = true;
                            break;
                        }
                        distancia++;
                    }
                } else if (direccion.equals("ABAJO")) {
                    for (int j = fila; j < tablero.length; j++) {
                        if (tablero[j][columna] == 'X') {
                            encontrado = true;
                            break;
                        }
                        distancia++;
                    }
                } else if (direccion.equals("IZQUIERDA")) {
                    for (int j = columna; j >= 0; j--) {
                        if (tablero[fila][j] == 'X') {
                            encontrado = true;
                            break;
                        }
                        distancia++;
                    }
                } else if (direccion.equals("DERECHA")) {
                    for (int j = columna; j < tablero[0].length; j++) {
                        if (tablero[fila][j] == 'X') {
                            encontrado = true;
                            break;
                        }
                        distancia++;
                    }
                }

                if (encontrado) {
                    System.out.println(distancia);
                } else {
                    System.out.println("NINGUNO");
                }
            }
            System.out.println("---");
            entrada = sc.nextLine();
        }
    }
}