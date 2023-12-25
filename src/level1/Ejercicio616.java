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
public class Ejercicio616 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, marcadorDcha, marcadorIzda;
        String sonido, flag;
        do {
            n = sc.nextInt();
            if (n != 0) {
                marcadorDcha = 0;
                marcadorIzda = 0;
                flag = "dcha";
                for (int i = 0; i < n; i++) {
                    sonido = sc.next().trim();
                    //System.out.println(i + ":" + sonido);
                    if (sonido.equals("PIC")) {
                        if (flag.equals("dcha")) flag = "izda";
                        else flag = "dcha";
                    } else if (sonido.equals("PONG!")) {
                        if (flag.equals("dcha")) {
                            marcadorIzda++;
                        }
                        else {
                            marcadorDcha++;
                        }     
                    }      
                }
                sc.nextLine();
                System.out.println(marcadorIzda + " " + marcadorDcha);
            }
        } while (n != 0);

    }
}
