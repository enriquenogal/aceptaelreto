package level2;


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
public class Ejercicio541 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = -1, b = -1, c = -1, resultado, mcd;
        while (!(a == 0 && b == 0 && c == 0)) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            if (!(a == 0 && b == 0 && c == 0)) {
                mcd = mcdEuclides(a, b);
                mcd = mcdEuclides(mcd, c);

                resultado = (a / mcd) + (b / mcd) + (c / mcd);

                System.out.println(resultado);
            }
        }
    }

    public static int mcdEuclides(int a, int b) {
        int t;
        while (b != 0) {
            t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

}
