package unresolved;


//Wrong answer (WA)
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
public class Ejercicio102 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String entrada;
        String salida = "";
        String alfabeto = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String vocales = "aeiouAEIOU";
        int key, claro, cifrado, contador;

        while (!salida.equals("FIN")) {
            entrada = sc.nextLine();
            salida = "";
            contador = 0;
            key = alfabeto.indexOf('p') - alfabeto.indexOf(entrada.charAt(0));
            //System.out.print("longitud:" + alfabeto.length() + ":key:" + key);
            for (int i = 1; i < entrada.length(); i++) {
                claro = alfabeto.indexOf(entrada.charAt(i));
                if (claro != -1) {
                    cifrado = (claro + key);
                    //System.out.print(":cifrado:" + cifrado);
                    if (cifrado > 0) {
                        cifrado = cifrado % alfabeto.length();
                    } else if (cifrado < 0) {
                        cifrado = alfabeto.length() + cifrado;
                    }
                    //System.out.print(":cifrado:" + cifrado);
                    if (vocales.indexOf(alfabeto.charAt(cifrado))!=-1) {
                        contador++;
                    }
                    salida = salida + alfabeto.charAt(cifrado);
                } else {
                    salida = salida + entrada.charAt(i);
                }
            }

            if (!salida.equals("FIN")) {
                //System.out.println(":salida:" + salida);
                System.out.println(contador);
            }
        }
    }
}
