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
public class Ejercicio677 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String ini, fin = "";
        long num;
        for (int i = 0; i < n; i++) {
            ini = sc.nextLine();
            ini = ini.substring(0, ini.length() - 1);
            if (!ini.equals("")) {
                num = Integer.parseInt(ini);
                num = num * (num + 1);
                fin = "" + num + "25";
            } else {
                fin = "25";
            }
            System.out.println(fin);
        }
    }
}
