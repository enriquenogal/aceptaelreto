/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level20;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Ejercicio589 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n;
        long max, aux;
        BigInteger relleno;
        do {
            n = sc.nextLong();
            if (n != 0) {
                sc.nextLine();
                relleno = BigInteger.ZERO;
                max = 0;
                for (int i = 0; i < n; i++) {
                    if (i == 0) {
                        max = sc.nextLong();
                    } else {
                        aux = sc.nextLong();
                        if (aux <= max) {
                            relleno = relleno.add(BigInteger.valueOf(max - aux));
                            //relleno += max - aux;
                        } else {
                            relleno = relleno.add(BigInteger.valueOf((aux - max) * (i)));
                            //relleno += (aux - max) * (i);
                            max = aux;
                        }
                    }
                }
                System.out.println(relleno);

            }

        } while (n != 0);

    }
}
