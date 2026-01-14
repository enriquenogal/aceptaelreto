package level20;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enogal
 */
public class Ejercicio742 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            tratarCaso(sc);
        }
    }

    private static void tratarCaso(Scanner sc) {
        String tambor = sc.nextLine();
        int totalVacios = 0, vacioSiguienteConBala = 0, balas = 0;
        for (int i = 0; i < tambor.length(); i++) {
            if (tambor.charAt(i) == '1') {
                balas++;
            } else {
                totalVacios++;
                if (i != tambor.length() -1 && tambor.charAt(i+1) == '1') {
                    vacioSiguienteConBala++;
                } else if (i == tambor.length() -1 && tambor.charAt(0) == '1') {
                    vacioSiguienteConBala++;
                }
            }
        }
        double probGirar = 1.0 * balas / tambor.length();
        double probNoGirar = 1.0 * vacioSiguienteConBala/ totalVacios;
//        System.out.println("balas: " + balas + " --- vacioSiguienteConBala: " + vacioSiguienteConBala);
//        System.out.println("probGirar: " + probGirar + " --- probNoGirar: " + probNoGirar);
        if (probGirar == probNoGirar) {
            System.out.println("Da igual");
        } else if (probGirar < probNoGirar) {
            System.out.println("Girar");
        } else {
            System.out.println("No girar");
        }
    }
}
