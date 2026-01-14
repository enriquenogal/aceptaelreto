package level20;


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
public class Ejercicio536 {

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int superficie;
        int abono;
        int agua;
        int distancia;
        String nombre;
        int superficieM = 0;
        int abonoM = 0;
        int aguaM = 0;
        int distanciaM = 0;
        String nombreM = "";

        while (sc.hasNextLine()) {
            n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                superficie = sc.nextInt();
                abono = sc.nextInt();
                agua = sc.nextInt();
                distancia = sc.nextInt();
                nombre = sc.nextLine().trim();
                if (i == 0) {
                    superficieM = superficie;
                    abonoM = abono;
                    aguaM = agua;
                    distanciaM = distancia;
                    nombreM = nombre;
                } else {
                    if (superficie > superficieM) {
                        superficieM = superficie;
                        abonoM = abono;
                        aguaM = agua;
                        distanciaM = distancia;
                        nombreM = nombre;
                    } else if (superficie == superficieM) {
                        if (agua < aguaM) {
                            superficieM = superficie;
                            abonoM = abono;
                            aguaM = agua;
                            distanciaM = distancia;
                            nombreM = nombre;
                        } else if (agua == aguaM) {
                            if (distancia < distanciaM) {
                                superficieM = superficie;
                                abonoM = abono;
                                aguaM = agua;
                                distanciaM = distancia;
                                nombreM = nombre;
                            } else if (distancia == distanciaM) {
                                if (abono < abonoM) {
                                    superficieM = superficie;
                                    abonoM = abono;
                                    aguaM = agua;
                                    distanciaM = distancia;
                                    nombreM = nombre;
                                }
                            }

                        }

                    }
                }
            }
            System.out.println(nombreM);
        }
    }

}
