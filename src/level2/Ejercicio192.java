package level2;

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
public class Ejercicio192 {

    static boolean resultado;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = -1;
        while (n != 0) {
            n = sc.nextInt();
            if (n != 0) {
                resultado = false;
                combinar(n, 1);
                if (resultado) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    public static void combinar(int n, int ini) {
        if (resultado == false) {
            if (ini == n) {
                resultado = true;
            } else if (ini < n) {
                combinar(n, ini * 3);
                combinar(n, ini + 5);
            }
        }
    }
}
