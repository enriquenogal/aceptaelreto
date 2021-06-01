package level3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author enrique.nogal
 */
public class Ejercicio144 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;
        char[] charArrayEntrada;
        char[] charArraySalida;
        int indiceSalida;
        int indiceMaximo;
        String resultado;

        while (sc.hasNextLine()) {

            entrada = sc.nextLine();

            charArrayEntrada = entrada.toCharArray();
            charArraySalida = new char[charArrayEntrada.length];
            indiceSalida = 0;
            indiceMaximo = 0;
            for (int i = 0; i < charArrayEntrada.length; i++) {
                switch (charArrayEntrada[i]) {
                    case '-':
                        indiceSalida = 0;
                        break;
                    case '+':
                        indiceSalida = indiceMaximo;
                        break;
                    case '*':
                        if (indiceSalida < indiceMaximo) {
                            indiceSalida++;
                        }
                        break;
                    case '3':
                        if (indiceMaximo != 0  && indiceMaximo!=indiceSalida) {
                            for (int j = indiceSalida; j < charArraySalida.length - 1; j++) {
                                charArraySalida[j] = charArraySalida[j + 1];
                            }
                            charArraySalida[charArraySalida.length - 1] = ' ';
                            indiceMaximo--;
                        }
                        break;
                    default:
                        for (int j = charArraySalida.length - 1; j > indiceSalida; j--) {
                            charArraySalida[j] = charArraySalida[j - 1];
                        }
                        charArraySalida[indiceSalida] = charArrayEntrada[i];
                        indiceSalida++;
                        indiceMaximo++;
                        break;
                }
            }
            resultado = new String(charArraySalida);
            System.out.println(resultado.substring(0, indiceMaximo));
        }
    }

}
