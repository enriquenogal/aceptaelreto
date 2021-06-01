package level3;


import java.math.BigInteger;
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
public class Ejercicio295 {

    static final int K = 31543;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = -1;
        int n = -1;
        BigInteger base, mod, exp, result;

        while (!(n == 0 && x == 0)) {
            x = sc.nextInt();
            n = sc.nextInt();
            if (!(n == 0 && x == 0)) {
                base = BigInteger.valueOf(x);
                mod = BigInteger.valueOf(K);
                exp = BigInteger.valueOf(n);
                result = base.modPow(exp, mod);
                System.out.println(result);
            }

        }
    }
}
