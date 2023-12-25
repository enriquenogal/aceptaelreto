package level2;


import java.util.HashSet;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio678 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra, letras, resultado;
        HashSet<Character> hs;
        int fallos, aciertos;
        do {
            palabra = sc.nextLine();
            if (!palabra.equals(".")) {
                letras = sc.nextLine();
                aciertos = 0;
                fallos = 0;
                hs = new HashSet<Character>();
                resultado = "COLGANDO";
                for (int i = 0; i < letras.length(); i++) {
                    if (!hs.contains(letras.charAt(i))) {
                        if (palabra.indexOf(letras.charAt(i)) == -1) {
                            fallos++;
                        } else {
                            aciertos += numAciertos(palabra, letras.charAt(i));
                        }
                        if (fallos == 7) {
                            resultado = "AHORCADO";
                            break;
                        } else if (aciertos == palabra.length()) {
                            resultado = "SALVADO";
                            break;
                        }
                        hs.add(letras.charAt(i));
                    }
                }
                System.out.println(resultado);
            }
        } while (!palabra.equals("."));
    }

    public static int numAciertos(String palabra, char c) {
        int r = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == c) {
                r++;
            }
        }
        return r;
    }
}
