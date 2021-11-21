package unresolved;

//Memory limit exceeded (MLE)
import java.util.Scanner;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
public class Ejercicio346 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nacimientos = -1;
        int periodo = -1;
        int aux = 0;
        int max = 0;
        int contador = 0;
        HashMap<Integer, Integer> tm = new HashMap<>();

        while (!(nacimientos == 0 && periodo == 0)) {
            nacimientos = sc.nextInt();
            periodo = sc.nextInt();
            sc.nextLine();
            if (!(nacimientos == 0 && periodo == 0)) {
                tm.clear();
                for (int i = 0; i < nacimientos; i++) {
                    aux = sc.nextInt();
                    if (!tm.containsKey(aux)) {
                        tm.put(aux, 1);
                    } else {
                        tm.put(aux, tm.get(aux) + 1);
                    }
                }
                sc.nextLine();

                max = 0;
                for (int i = 1; i <= aux - periodo + 1; i++) {
                    contador = 0;
                    for (int j = i; j < i + periodo; j++) {
                        if (tm.containsKey(j)) {
                            contador += tm.get(j);
                        }
                    }
                    if (contador > max) {
                        max = contador;
                    }
                }             
                System.out.println(max);
            }
        }
    }
}