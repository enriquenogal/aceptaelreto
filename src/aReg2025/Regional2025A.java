package aReg2025;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enogal
 */
public class Regional2025A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int caso;
        for (int i = 0; i < n; i++) {
            caso = sc.nextInt();
            tratarCaso(caso);
        }
    }

    private static void tratarCaso(int caso) {
        int tmp;
        for (int i = 1; true; i++) {
            tmp = (int)Math.pow((i * (i - 1) / 2),2);
            if (tmp >= caso) {
                System.out.println(tmp);
                break;
            }
        }
    }
}
