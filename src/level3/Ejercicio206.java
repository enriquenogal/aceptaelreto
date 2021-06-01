package level3;


import java.util.Scanner;

public class Ejercicio206 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long hipotenusa, hipotenusa2, cateto1;
        double cateto2;
        int numero = sc.nextInt();
        for (int i = 0; i < numero; i++) {
            hipotenusa = sc.nextInt();
            hipotenusa2 = hipotenusa * hipotenusa;
            cateto2 = 0;
            for (cateto1 = hipotenusa - 1; cateto1 > 0; cateto1--) {
                cateto2 = Math.sqrt(hipotenusa2 - (cateto1 * cateto1));
                if (cateto2 == (long)cateto2) {
                    break;
                }
            }
            System.out.println(cateto1 + (long)cateto2);
        }
    }
}
