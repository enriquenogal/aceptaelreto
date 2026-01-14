package level30;

//MLE
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
public class Ejercicio544 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nUvas; 
        long pesoMax;
        long anterior, siguiente;
        int contador;
        ArrayList<Long> uvas = new ArrayList<Long>();

        while (sc.hasNextLine()) {
            nUvas = sc.nextInt();
            pesoMax = sc.nextLong();
            sc.nextLine();
            uvas.clear();
            for (int i = 0; i < nUvas; i++) {
                uvas.add(sc.nextLong());
            }
            sc.nextLine();

            Collections.sort(uvas);
            contador = 0;
            anterior = 0;
            while (contador < nUvas) {
                siguiente = uvas.get(contador);
                if (siguiente + anterior > pesoMax) {
                    break;
                } else {
                    contador++;
                    anterior = siguiente;
                }
            }
            System.out.println(contador);
        }
    }
}
