package level1;

import java.util.Scanner;

public class Ejercicio659 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
            if (n != 0) {
                tratarCaso(n);
            }
        } while (n != 0);
    }

    public static void tratarCaso(int n) {
        String s = Integer.toString(n);
        String simbolos = "TGCFDRH";
        int pos = 0, tmp;
        String salida = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            tmp = Character.getNumericValue(s.charAt(i));
            for (int j = 0; j < tmp; j++) {
                salida = simbolos.charAt(pos) + salida;
            }
            pos++;
        }
        System.out.println(salida);
    }
}