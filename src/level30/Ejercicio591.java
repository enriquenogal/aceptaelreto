/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level30;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Ejercicio591 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        long[][] seccion, aux;
        long resultado;
        int a, b;
        String strResultado;
        while (sc.hasNextLine()) {
            strResultado = "";
            n = Integer.parseInt(sc.nextLine());
            seccion = new long[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    seccion[i][j] = sc.nextLong();
                }
                sc.nextLine();
            }
            //System.out.println("------------------");
            while (n > 0) {
                //imprimeArray(seccion);
                resultado = 0;
                if (n == 1) {
                    resultado = seccion[0][0];
                } else {
                    //sumo las cuatro esquinas
                    resultado += seccion[0][0];
                    resultado += seccion[0][n - 1];
                    resultado += seccion[n - 1][0];
                    resultado += seccion[n - 1][n - 1];
                    //recorro el resto
                    for (int i = 1; i < n - 1; i++) {
                        resultado += seccion[0][i];
                        resultado += seccion[n - 1][i];
                        resultado += seccion[i][0];
                        resultado += seccion[i][n - 1];
                    }
                    //seguro que se puede optimizar
                }
                //System.out.println(resultado);
                strResultado = resultado + " " + strResultado;
                //System.out.println("--------------------");
                //nueva array quitando el anillo exterior
                if (n - 2 > 0) {
                    aux = new long[n - 2][n - 2];
                    for (int i = 0; i < aux.length; i++) {
                        for (int j = 0; j < aux.length; j++) {
                            aux[i][j] = seccion[i + 1][j + 1];
                        }
                    }
                    seccion = aux;
                }
                n = n - 2;
            }
            //System.out.println("----------------");
            System.out.println(strResultado.trim());
        }

    }

//    public static void imprimeArray(long[][] a) {
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println("");
//        }
//    }
}
