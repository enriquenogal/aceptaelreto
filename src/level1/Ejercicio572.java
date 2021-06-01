package level1;


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
public class Ejercicio572 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double d;
        String datos[];
        boolean cero;
        boolean nueve;
        for (int i = 0; i < n; i++) {
            cero = false;
            nueve = false;
            datos = sc.nextLine().split(" ");
            for (int j = 0; j < 5; j++) {
                d = Double.parseDouble(datos[j]);
                if (d == 0) {
                    cero = true;
                }
                if (d >= 9) {
                    nueve = true;
                }
            }
            if (nueve) {
                System.out.println("MEDIA");
            } else if (cero) {
                System.out.println("SUSPENSO DIRECTO");
            } else {
                System.out.println("MEDIA");
            }
        }
    }
}
