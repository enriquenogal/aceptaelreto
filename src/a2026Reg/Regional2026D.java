/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a2026Reg;

import java.util.Scanner;

/**
 *
 * @author enogal
 */
public class Regional2026D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int libras, valorDolar, valorEuro;
        do {
            libras = sc.nextInt();
            valorDolar = sc.nextInt();
            valorEuro = sc.nextInt();
            if (!(libras == 0 && valorDolar == 0 && valorEuro == 0)) {
                tratarCaso(libras, valorDolar, valorEuro);
            }
        } while (!(libras == 0 && valorDolar == 0 && valorEuro == 0));
    }

    private static void tratarCaso(int libras, int valorDolar, int valorEuro) {
        int dolares, euros, cambio;
        dolares = libras / valorDolar; //número de dolares mínimo para llegar a esas libras
        if (libras > dolares * valorDolar) {
            //es por que no llega con ese mínimo y le falta uno
            dolares++;
        }
        //me valgo de un bucle infinito porque el enunciado dice que va a tener solución seguro
        //ojo al posible TLE - me libro porque dicen que como mucho van a ser 10000 libras y no han puesto demasiada atención en el tiempo
        while (true) {
            cambio = (dolares * valorDolar) - libras; //cálculo el cambio restando el total de libras pagadas en dolares de las libras iniciales
            euros = cambio / valorEuro; //obtengo los euros que representan el cambio
            if (libras == (dolares * valorDolar) - (euros * valorEuro)) {
                //si las libras iniciales son iguales exactamente a lo que he pagado en dolares menos la devolución en euros
                //eso es que da exacto y termino el bucle infinito
                break;
            } else {
                //si no da exacto pruebo de nuevo sumándole un dolar
                dolares++;
            }
        }
        System.out.println(dolares + " " + euros);
    }

}
