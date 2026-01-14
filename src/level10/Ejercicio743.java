package level10;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enogal
 */
public class Ejercicio743 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nDocumentos, nPaginas, ahorro;
        do {
            nDocumentos = sc.nextInt();
            if (nDocumentos != 0) {
                ahorro = 0;
                for (int i = 0; i < nDocumentos; i++) {
                    nPaginas = sc.nextInt();
                    ahorro += nPaginas / 2;
                }
                System.out.println(ahorro);
            }
        } while (nDocumentos != 0);
    }
}
