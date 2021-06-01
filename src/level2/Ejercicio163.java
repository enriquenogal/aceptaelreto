package level2;


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
public class Ejercicio163 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine().trim().toUpperCase();
        String salida;
        int acarreo, indice, cifra, suma;

        while (!entrada.equals("FIN")) {
            indice = entrada.length() - 1;
            salida = "";
            acarreo = 1;
            while (indice >= 0) {
                cifra = Integer.parseInt(Character.toString(entrada.charAt(indice)), 16);
                if (acarreo == 0) {
                    salida = entrada.charAt(indice) + salida;
                } else {
                    suma = cifra + acarreo;
                    if (suma > 15) {
                        acarreo = suma - 15;
                        suma = suma % 15 - 1;
                    } else {
                        acarreo = 0;
                    }
                    salida = Integer.toHexString(suma).toUpperCase() + salida;
                }
                indice--;
            }

            if (acarreo > 0) {
                salida = Integer.toHexString(acarreo).toUpperCase() + salida;
            }

            System.out.println(salida);
            entrada = sc.nextLine().trim().toUpperCase();
        }

    }

}
