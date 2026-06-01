package level10;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio730 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(cuentaUnos(Integer.toBinaryString(sc.nextInt())));
        }
    }

    private static int cuentaUnos(String s) {
        int r = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                r++;
            }
        }
        return r;
    }
}
