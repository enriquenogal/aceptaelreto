package level21;


import java.util.Scanner;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
public class Ejercicio185 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> si = new TreeSet<String>();
        TreeSet<String> no = new TreeSet<String>();
        TreeSet<String> noDefinitivo = new TreeSet<String>();
        String[] linea;
        String salida;
        int n = -1;
        while (n != 0) {
            n = Integer.parseInt(sc.nextLine());
            if (n != 0) {
                si.clear();
                no.clear();
                noDefinitivo.clear();
                for (int i = 0; i < n; i++) {
                    linea = sc.nextLine().split(" ");
                    if (linea[0].equals("SI:")) {
                        for (int j = 1; j < linea.length - 1; j++) {
                                si.add(linea[j]);
                        }
                    } else {
                        for (int j = 1; j < linea.length - 1; j++) {
                                no.add(linea[j]);
                        }
                    }
                }

                for (String str: no) {
                    if (!si.contains(str)) {
                        noDefinitivo.add(str);
                    }
                }

                salida = "";
                for (String str : noDefinitivo) {
                    salida += str + " ";
                }

                System.out.println(salida.trim());
            }
        }

    }
}
