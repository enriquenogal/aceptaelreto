
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio641b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diasCalculo, diasTotal, max, valor, sumaValores;
        ArrayList<Integer> casos;

        do {
            diasCalculo = sc.nextInt();
            diasTotal = sc.nextInt();
            if (!(diasCalculo == 0 && diasTotal == 0)) {
                sumaValores = 0;
                max = 0;
                casos = new ArrayList<Integer>();
                for (int i = 0; i < diasTotal; i++) {
                    valor = sc.nextInt();
                    casos.add(valor);
                    sumaValores += valor;
                    if (casos.size() > diasCalculo) {
                        sumaValores -= casos.get(0);
                        casos.remove(0);
                    }
                    //if (casos.size() == diasCalculo) {
                        if (sumaValores > max) {
                            max = sumaValores;
                        }
                    //}
                }
                System.out.println(max);
            }
        } while ((!(diasCalculo == 0 && diasTotal == 0)));
    }
}
