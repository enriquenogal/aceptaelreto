package level3;


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
public class Ejercicio400b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;
        int maxLibres, libresD, libresI, libres;

        while (sc.hasNextLine()) {
            entrada = sc.nextLine();
            maxLibres = 0;
            for (int i = 0; i < entrada.length(); i++) {
                if (entrada.charAt(i) == '.') {
                    //miro libres hacia la derecha
                    libresD = 0;
                    for (int j = i + 1; j < entrada.length(); j++) {
                        if (entrada.charAt(j) == '.') {
                            libresD++;
                        } else {
                            break;
                        }

                    }
                    //miro libres hacia la izquierda
                    libresI = 0;
                    for (int j = i - 1; j >= 0; j--) {
                        if (entrada.charAt(j) == '.') {
                            libresI++;
                        } else {
                            break;
                        }
                    }
                    //dejo en libres la cantidad menor (izquierda o derecha) o la derecha o la izquierda (si están en los extremos)
                    if (i == 0) {
                        libres = libresD;
                    } else if (i == entrada.length() - 1) {
                        libres = libresI;
                    } else {
                        libres = Math.min(libresI, libresD);
                    }
                    //actualizo si procede el máximo de libres
                    if (maxLibres < libres) {
                        maxLibres = libres;
                    }
                    
                    
                    
                }
            }
            System.out.println(maxLibres);
        }
    }
}
