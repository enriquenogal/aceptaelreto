package level30;


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
public class Ejercicio620 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutosCara, nJuegos;
        int[] juegosViejos;
        while (sc.hasNextLine()) {
            minutosCara = sc.nextInt();
            nJuegos = sc.nextInt();
            sc.nextLine();
            juegosViejos = new int[nJuegos];
            for (int i = 0; i < juegosViejos.length; i++) {
                juegosViejos[i] = sc.nextInt();
            }
            sc.nextLine();
            procesar(minutosCara, juegosViejos);
        }
    }

    public static void procesar(int minutosCara, int[] juegosViejos) {
        boolean encontrado = false;
        long fin = (int) Math.pow(2, juegosViejos.length);
        long contador = 0;
        // hay que hacer combinaciones, y si alguna cumple hacer encontrado = true
        // cada combinación se corresponderá con un número
        // siendo el 0 todo en la cara A y el fin del contador todo en la cara B
        // se puede hacer mejor porque no creo que haga falta llegar hasta el final de la combinación de casos
        // en realidad con chequear la mitad de los casos sería suficiente 
        // de esto último no estoy seguro así que si no me da un TLE no buscaré reducir los casos
        while (encontrado == false && contador < fin) {
//            System.out.println("Contador: " + contador + " Fin: " + fin);
            encontrado = checkCaso(minutosCara, juegosViejos, contador);
            contador++;
        }
        if (encontrado) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean checkCaso(int minutosCara, int[] juegosViejos, long caso) {
        //convierto el caso a binario rellenando con ceros a la izquierda sin son menor a la longitud de los juegosViejos
        //cada posición ese binario definirá a que cara corresponde el juego
        // 0 para la cara A y 1 para la cara B
        // llamo a un método para que me haga la suma y después comparo con el límite
        String sCaso = binarioConCeros(caso, juegosViejos.length);
        int caraA = sumaCintas(juegosViejos, sCaso, '0');
        int caraB = sumaCintas(juegosViejos, sCaso, '1');
//        System.out.println("Caso: " + caso + "::" + sCaso);
//        System.out.println("CaraA: " + caraA);
//        System.out.println("CaraB: " + caraB);

        if (caraA > minutosCara) {
            return false;
        } else if (caraB > minutosCara) {
            return false;
        } else {
            return true;
        }
    }

    public static int sumaCintas(int[] juegosViejos, String sCaso, char c) {
        int r = 0;
        for (int i = 0; i < juegosViejos.length; i++) {
            if (sCaso.charAt(i) == c) {
                r += juegosViejos[i];
            }
        }
        return r;
    }

    public static String binarioConCeros(long caso, int l) {
        String r = Long.toBinaryString(caso);
        int dif = l - r.length();
        for (int i = 0; i < dif; i++) {
            r = "0" + r;
        }
        return r;
    }
}
