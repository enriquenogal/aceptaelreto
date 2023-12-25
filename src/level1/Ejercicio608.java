package level1;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio608 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, t, alarmas;
        boolean alarmaPrevia;
        do {
            n = sc.nextInt();
            if (n != 0) {
                alarmas = 0;
                alarmaPrevia = false;
                for (int i = 0; i < n; i++) {
                    t = sc.nextInt();
                    if (t <= 4 && alarmaPrevia == false) {
                        alarmaPrevia = true;
                        alarmas++;
                    } else if (alarmaPrevia == true && t <= 6){
                        alarmaPrevia = true;
                    } else {
                        alarmaPrevia = false;
                    }
                }
                System.out.println(alarmas);
            }
        } while (n != 0);

    }

}
