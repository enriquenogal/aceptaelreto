package level20;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio773 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max, tipos, acum;
        int[] maxTipos;
        int comida;
        String salida;
        do {
            max = sc.nextInt();
            tipos = sc.nextInt();
            if (!(max == 0 && tipos == 0)) {
                acum = 0;
                maxTipos = new int[tipos];
                salida = "SI";
                for (int i = 0; i < tipos; i++) {
                    maxTipos[i] = sc.nextInt();
                }
                for (int i = 0; i < tipos; i++) {
                    comida = sc.nextInt();
                    acum += comida;
                    if (acum > max) {
                        salida = "NO";
                        sc.nextLine();
                        break;
                    } else if (comida > maxTipos[i]) {
                        salida = "NO";
                        sc.nextLine();
                        break;
                    }
                }
                System.out.println(salida);
            }
        } while (!(max == 0 && tipos == 0));
    }
}
