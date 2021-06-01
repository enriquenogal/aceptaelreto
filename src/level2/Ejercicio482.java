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
public class Ejercicio482 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = "";
        int negros, gris;

        while (!entrada.equals(".")) {
            entrada = sc.nextLine();
            if (!entrada.equals(".")) {
                negros = 0;
                gris = 0;
                entrada = entrada.replaceAll(" ","");
                for (int i = 0; i < entrada.length() - 1; i++) {
                    if (entrada.charAt(i) == 'N') {
                        negros++;
                    } else {
                        gris++;
                    }
                }
                if (negros % 2 == 0 && gris % 2 == 0) {
                    System.out.println("EMPAREJADOS");
                } else if (negros % 2 == 1 && gris % 2 == 0){
                    System.out.println("NEGRO SOLITARIO");
                } else if (negros % 2 == 0 && gris % 2 == 1) {
                    System.out.println("GRIS SOLITARIO");
                } else {
                    System.out.println("PAREJA MIXTA");
                }
            }
        }
    }
}
