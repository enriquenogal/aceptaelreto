package level20;


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
public class Ejercicio441 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada, salida;
        int indice, acarreo, contador;
        int aux;
        char c;
        while (sc.hasNextLine()) {
            entrada = sc.nextLine();
            salida = "";
            entrada = entrada.replaceAll("\\.", "");
            indice = entrada.length() - 1;
            acarreo = 1;
            contador = 0;
            while (indice >= 0) {
                contador++;
                c = entrada.charAt(indice);
                if (acarreo == 1) {
                    aux = Character.getNumericValue(c);
                    aux++;
                    if (aux == 10) {
                        aux = 0;
                        acarreo = 1;
                    } else {
                        acarreo = 0;
                    }
                    c = Character.forDigit(aux, 10);
                }
                salida = String.valueOf(c) + salida;
                if (contador == 3 && indice != 0) {
                    salida = "." + salida;
                    contador = 0;
                }
                indice--;
            }
            if (acarreo == 1) {
                if (contador == 3) {
                    salida = "." + salida;
                }
                salida = "1" + salida;
            }
            System.out.println(salida);

        }
    }
}
