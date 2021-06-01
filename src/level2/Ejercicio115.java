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
public class Ejercicio115 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = -1;
        String str;
        Long primero, segundo;
        boolean encontrado;
        while (n != 0) {
            n = sc.nextInt();
            if (n != 0) {
                str = Long.toString(n * n);
                //System.out.println(str);
                encontrado = false;
                if (str.equals("1")) {
                    encontrado = true;
                } else {
                    for (int i = 1; i < str.length(); i++) {
                        primero = Long.parseLong(str.substring(0, i));
                        //System.out.print(primero + " ");
                        segundo = Long.parseLong(str.substring(i));
                        //System.out.println(segundo);
                        if ((segundo != 0) && (primero + segundo == n)) {
                            encontrado = true;
                            break;
                        }
                    }
                }
                if (encontrado) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}