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
public class Ejercicio611 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anyoPersonaje, anyoObra, nObras, contObras, anyoObraFin;
        String nombrePersonaje, obraFin, obra;
        while (sc.hasNextLine()){
            anyoPersonaje = sc.nextInt();
            nombrePersonaje = sc.nextLine().trim();
            nObras = sc.nextInt();
            sc.nextLine();
            anyoObraFin = Integer.MAX_VALUE;
            contObras = 0;
            obraFin = obra = "";
            for (int i = 0; i < nObras; i++) {
                anyoObra = sc.nextInt();
                obra = sc.nextLine().trim();
                if (anyoObra >= anyoPersonaje) contObras++;
                if (anyoObra >= anyoPersonaje && anyoObra < anyoObraFin) {
                    anyoObraFin = anyoObra;
                    obraFin = obra;
                }         
            }
            if (contObras == nObras) {
                System.out.println("TODAS");
            } else if (contObras == 0) {
                System.out.println("NINGUNA");
            } else {
                System.out.println(obraFin);
            }
            
        }
    }

}
