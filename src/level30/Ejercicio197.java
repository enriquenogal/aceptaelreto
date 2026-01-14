package level30;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enogal
 */
public class Ejercicio197 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada, salida;
        while (sc.hasNextLine()) {
            entrada = sc.nextLine();
            salida = primerPasoCifrar(segundoPasoDescifrar(entrada));
            System.out.println(entrada + " => " + salida);
        }
    }

    public static String primerPasoCifrar(String entrada) {
        String salida = "";
        String aux = "";
        for (int i = 0; i < entrada.length(); i++) {
            if (isVowel(entrada.charAt(i))){
                salida += darLaVuelta(aux) + entrada.charAt(i);
                aux = "";
            } else {
                aux += entrada.charAt(i);
            }
        }
        if (!aux.equals("")) {
            salida += darLaVuelta(aux);
        }
        return salida;
    }

    public static String segundoPasoCifrar(String entrada) {
        String salida = "";
        for (int i = 0; i < entrada.length() / 2; i++) {
            salida += "" + entrada.charAt(i) + entrada.charAt(entrada.length() - 1 - i);
        }
        return salida;
    }
    
    public static String segundoPasoDescifrar(String entrada) {
        String salida = "";
        String principio = "";
        String fin = "";
        for (int i = 0; i < entrada.length(); i++) {
            if (i % 2 == 0) {
                principio = principio + entrada.charAt(i);
            } else {
                fin = entrada.charAt(i) + fin;
            }
        }
        salida = principio + fin;
        return salida;
    }
            

    public static String darLaVuelta(String entrada) {
        String salida = "";
        for (int i = 0; i < entrada.length(); i++) {
            salida = entrada.charAt(i) + salida;
        }
        return salida;
    }
    
    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
