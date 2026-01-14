package level30;

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
public class Ejercicio144b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;
        int indiceSalida;
        StringBuilder sb;

        while (sc.hasNextLine()) {

            entrada = sc.nextLine();
            sb = new StringBuilder();
            indiceSalida = 0;
            for (int i = 0; i < entrada.length(); i++) {
                switch (entrada.charAt(i)) {
                    case '-':
                        indiceSalida = 0;
                        break;
                    case '+':
                        indiceSalida = sb.length();
                        break;
                    case '*':
                        if (indiceSalida < sb.length()) {
                            indiceSalida++;
                        }
                        break;
                    case '3':
                        if (sb.length() != 0 && sb.length() != indiceSalida) {
                            sb.deleteCharAt(indiceSalida);
                        }
                        break;
                    default:
                        sb.insert(indiceSalida, entrada.charAt(i));
                        indiceSalida++;
                        break;
                }
            }
            System.out.println(sb);
        }
    }

}
