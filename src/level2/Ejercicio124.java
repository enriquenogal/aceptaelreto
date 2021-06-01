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
public class Ejercicio124 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine().trim();
        String[] numeros;
        int acarreo, vecesAcarreo, suma, digito0, digito1, difLongitud;

        while (!entrada.equals("0 0")) {
            acarreo = 0;
            vecesAcarreo = 0;
            numeros = entrada.split(" ");
            difLongitud = Math.abs(numeros[1].length() - numeros[0].length());
            //primero comparo las longitudes y relleno de ceros a la izquierda el que tenga menos longitud
            if (difLongitud!=0) {
                if (numeros[0].length() > numeros[1].length()) {
                    //relleno el 1
                    for (int i = 0; i < difLongitud; i++) {
                        numeros[1] = "0" + numeros[1];
                    }
                } else {
                    //relleno el 0
                    for (int i = 0; i < difLongitud ; i++) {
                        numeros[0] = "0" + numeros[0];
                    }
                }
            }
            //ahora hago la suma cifra a cifra calculando acarreos
            for (int i = numeros[0].length() - 1; i >= 0; i--) {
                digito0 = Character.digit(numeros[0].charAt(i), 10);
                digito1 = Character.digit(numeros[1].charAt(i), 10);
                suma = digito0 + digito1 + acarreo;
                if (suma > 9) {
                    acarreo = 1;
                    vecesAcarreo++;
                } else {
                    acarreo = 0;
                }
            }
            System.out.println(vecesAcarreo);
            entrada = sc.nextLine().trim();
        }
    }
}
