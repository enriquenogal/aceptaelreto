package level1;

//Time limit exceeded (TLE)
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
public class Ejercicio138b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        long numero, f, acumuladorCeros, b;

        for (long i = 0; i < a; i++) {
            numero = Integer.parseInt(sc.nextLine().trim());
            f = 1;
            acumuladorCeros = 0;
            for (long j = 1; j <= numero; j++) {        
                if ((j % 2 == 0 && f % 5 == 0) || (j % 5 == 0 && f % 2 == 0)){
                    b = j;
                    while (b % 10 == 0) {
                        acumuladorCeros++;
                        b = b / 10;
                    }
                    b = b % 10;

                    f = f * b;

                    while (f % 10 == 0) {
                        acumuladorCeros++;
                        f = f / 10;
                    }
                    f = f % 10;
                } else {
                    f = f * j;
                }
            }
            System.out.println(acumuladorCeros);
        }
    }
}
