package level3;


import java.util.Scanner;

public class Ejercicio104 {

    static boolean correcto;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pi, di, pd, dd;
        do {
            pi = sc.nextInt();
            di = sc.nextInt();
            pd = sc.nextInt();
            dd = sc.nextInt();
            if (!(pi == 0 && di == 0 && pd == 0 && dd == 0)) {
                correcto = true;
                tratarCaso(pi, di, pd, dd, sc);
                if (correcto) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            }
        } while ((!(pi == 0 && di == 0 && pd == 0 && dd == 0)));
    }

    private static int tratarCaso(int pi, int di, int pd, int dd, Scanner sc) {
        if (pi == 0) {
            pi = tratarCaso(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc);
        }
        if (pd == 0) {
            pd = tratarCaso(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc);
        }
        if (pi * di != pd * dd) {
            correcto = false;
        }
        return pi + pd;
    }
}
