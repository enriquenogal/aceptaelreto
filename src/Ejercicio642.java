
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enogal
 */
public class Ejercicio642 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, tmp, contadorCaminos;
        int[] a;
        ArrayList<Integer> recorridos;
        while (sc.hasNextInt()) {
            n = sc.nextInt();
            a = new int[n + 1];
            contadorCaminos = 0;
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            recorridos = new ArrayList<Integer>();
            for (int i = 1; i < a.length; i++) {
                tmp = a[i];
                if (!recorridos.contains(tmp)) {
                    contadorCaminos++;
                    recorridos.add(tmp);
                    //System.out.println(recorridos);
                    tmp = a[tmp];
                    while(true) {
                        if (!recorridos.contains(tmp)) {
                            recorridos.add(tmp);
                            //System.out.println(recorridos);
                            tmp = a[tmp];
                        } else {
                            break;
                        }
                    }
                }
            }
            System.out.println(contadorCaminos);
        }
    }
}
