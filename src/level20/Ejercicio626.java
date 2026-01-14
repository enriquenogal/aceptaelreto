package level20;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio626 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] fecha;
        int dia, mes, anio;
        for (int i = 0; i < n; i++) {
            fecha = sc.nextLine().split("/");
            dia = Integer.parseInt(fecha[0]);
            mes = Integer.parseInt(fecha[1]);
            anio = Integer.parseInt(fecha[2]);
            if (bisiesto(anio)) {
                if (mes < 2) {
                    System.out.println("29/02/" + fecha[2]);
                } else if (mes == 2 && dia < 29) {
                    System.out.println("29/02/" + fecha[2]);
                } else {
                    System.out.println("29/02/" + proximoBisiesto(anio));
                }
            } else {
                System.out.println("29/02/" + proximoBisiesto(anio));
            }
        }
    }

    public static String proximoBisiesto(int anio) {
        String r;
        while (true) {
            anio++;
            if (bisiesto(anio)) {
                r = Integer.toString(anio);
                while (r.length() < 4) {
                    r = "0" + r;
                }
                return r;
            }
        }
    }

    public static boolean bisiesto(int anio) {
        //debería ser como mi primer if...
        //if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
        if ((anio % 4 == 0)) {
            return true;
        } else {
            return false;
        }
    }

}
