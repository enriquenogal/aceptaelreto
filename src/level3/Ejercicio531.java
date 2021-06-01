package level3;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
public class Ejercicio531 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double replicantesAnalizados, replicantesAnalizadosIncorrectos, humanosAnalizados, humanosAnalizadosIncorrectos;
        double humanosAnalizadosNew, replicantesAnalizadosNew, replicantesAnalizadosIncorrectosNew, humanosAnalizadosIncorrectosNew;
        double retirados, proporcionMal, restoMal;
        while (sc.hasNextLine()) {
            replicantesAnalizados = sc.nextDouble();
            replicantesAnalizadosIncorrectos = sc.nextDouble();
            humanosAnalizados = sc.nextDouble();
            humanosAnalizadosIncorrectos = sc.nextDouble();
            humanosAnalizadosNew = sc.nextDouble();
            replicantesAnalizadosNew = sc.nextDouble();
            sc.nextLine();

            replicantesAnalizadosIncorrectosNew = replicantesAnalizadosNew * replicantesAnalizadosIncorrectos / replicantesAnalizados;
            humanosAnalizadosIncorrectosNew = humanosAnalizadosNew * humanosAnalizadosIncorrectos / humanosAnalizados;
            retirados = (replicantesAnalizadosNew - replicantesAnalizadosIncorrectosNew) + humanosAnalizadosIncorrectosNew;
            if (retirados == 0) {
                proporcionMal = 0;
                restoMal = 0;
            } else {
                proporcionMal = (humanosAnalizadosIncorrectosNew * 100) / retirados;
                restoMal = (humanosAnalizadosIncorrectosNew * 100) % retirados;
            }

            if (proporcionMal > 10) {
                System.out.println("SUSPENDE");
            } else if (proporcionMal == 10 && restoMal > 0) {
                System.out.println("SUSPENDE");
            } else {
                System.out.println("APRUEBA");
            }
        }
    }
}
