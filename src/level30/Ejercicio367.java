package level30;


import java.util.ArrayList;
import java.util.Collections;
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
public class Ejercicio367 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int aterrizaje, nPortales, aux;
        boolean aterrizajeIncluido;
        ArrayList<Integer> al = new ArrayList();

        for (int i = 0; i < n; i++) {
            aterrizajeIncluido = false;
            al.clear();
            aux = 0;
            aterrizaje = sc.nextInt();
            nPortales = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < nPortales; j++) {
                aux = sc.nextInt();
                if (aux == aterrizaje) {
                    aterrizajeIncluido = true;
                }
                al.add(aux);
            }
            if (aterrizajeIncluido == false) {
                al.add(aterrizaje);
            }
            Collections.sort(al);
            for (int j = 0; j < al.size(); j++) {
                if (al.get(j) == aterrizaje) {
                    aux = j;
                    break;
                }
            }
            if (aterrizajeIncluido == true) {
                System.out.print(aterrizaje + " ");
            }

            while (al.size() > 1) {
                if (aux == 0) {
                    System.out.print(al.get(1));
                    if (al.size() != 2) {
                        System.out.print(" ");
                    }
                    al.remove(0);
                } else if (aux == al.size() - 1) {
                    System.out.print(al.get(al.size() - 2));
                    if (al.size() != 2) {
                        System.out.print(" ");
                    }
                    al.remove(al.size() - 1);
                    aux = al.size() - 1;
                } else {
                    if (Math.abs(al.get(aux - 1) - al.get(aux)) < Math.abs(al.get(aux + 1) - al.get(aux))) {
                        System.out.print(al.get(aux - 1) + " ");
                        al.remove(aux);
                        aux = aux - 1;
                    } else {
                        System.out.print(al.get(aux + 1) + " ");
                        al.remove(aux);
                    }
                }
            }
            System.out.println("");
        }

    }

}
