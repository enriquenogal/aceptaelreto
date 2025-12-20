package aReg2025;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author enriquenogal
 */
public class Regional2025Angel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos;
        int x;
        casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            x = sc.nextInt();
            tratarCaso(x);
        }
    }

    public static void tratarCaso(int x) {
        double n;
        int nicomaco;
        n = (-1 + Math.sqrt(1 + (8 * Math.sqrt(x)))) / 2;
        if (n % 1 != 0) {
            n = Math.ceil(n);
        }
        nicomaco = (int) Math.pow((n * (n + 1)) / 2, 2);
        System.out.println(nicomaco);
    }
}
