package unresolved;


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
public class Ejercicio627 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        String[] fechaNac;
        int diaNac, mesNac, anioNac;
        int diaEdad, mesEdad, anioEdad;
        int diasSumar;
        int diaTotal, mesTotal, anioTotal;
        String sDia, sMes, sAnio;
        do {
            fechaNac = sc.next().split("/");
            diaNac = Integer.parseInt(fechaNac[0]);
            mesNac = Integer.parseInt(fechaNac[1]);
            anioNac = Integer.parseInt(fechaNac[2]);

            anioEdad = sc.nextInt();
            mesEdad = sc.nextInt();
            diaEdad = sc.nextInt();
            sc.nextLine();
            if (diaNac == 0 && mesNac == 0 && anioNac == 0
                    && diaEdad == 0 && mesEdad == 0 && anioEdad == 0) {
                continuar = false;
            }
            if (continuar) {
                diaTotal = diaNac;
                mesTotal = mesNac;
                anioTotal = anioNac;
                diasSumar = diaEdad + (28 * mesEdad) + (336 * anioEdad);
                while (diasSumar > 0) {
                    diaTotal++;
                    if (bisiesto(anioTotal) && mesTotal == 2 && diaTotal > 29) {
                        diaTotal = diaTotal - 29;
                        mesTotal++;
                    } else if (!bisiesto(anioTotal) && mesTotal == 2 && diaTotal > 28) {
                        diaTotal = diaTotal - 28;
                        mesTotal++;
                    } else if ((mesTotal == 1 || mesTotal == 3 || mesTotal == 5
                            || mesTotal == 7 || mesTotal == 8 || mesTotal == 10 || mesTotal == 12) && diaTotal > 31) {
                        diaTotal = diaTotal - 31;
                        mesTotal++;
                    } else if ((mesTotal == 4 || mesTotal == 6 || mesTotal == 9
                            || mesTotal == 11) && diaTotal > 30) {
                        diaTotal = diaTotal - 30;
                        mesTotal++;
                    }
                    if (mesTotal > 12) {
                        mesTotal = mesTotal - 12;
                        anioTotal++;
                    }
                    //System.out.println("dia: " + diaTotal + " mes: " + mesTotal + " anio: " + anioTotal);
                    diasSumar--;
                }
                sDia = Integer.toString(diaTotal);
                while (sDia.length() < 2) {
                    sDia = "0" + sDia;
                }
                sMes = Integer.toString(mesTotal);
                while (sMes.length() < 2) {
                    sMes = "0" + sMes;
                }
                sAnio = Integer.toString(anioTotal);
                while (sAnio.length() < 4) {
                    sAnio = "0" + sAnio;
                }
                System.out.println(sDia + "/" + sMes + "/" + sAnio);
            }
        } while (continuar);

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
