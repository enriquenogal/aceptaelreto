package level2;


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
public class Ejercicio245 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long nHermanos = 1;
        boolean dalton, creciente;
        Long anterior, presente;

        while (nHermanos > 0) {
            nHermanos = Long.parseLong(sc.nextLine());
            if (nHermanos > 0) {
                anterior = sc.nextLong();
                presente = sc.nextLong();
                dalton = true;
                creciente = true;
                if (anterior < presente) {
                    creciente = true;
                } else if (anterior > presente) {
                    creciente = false;
                } else {
                    dalton = false;
                }
                anterior = presente;
                if (dalton) {
                    for (int i = 2; i < nHermanos; i++) {
                        presente = sc.nextLong();
                        if (creciente && presente <= anterior){
                            dalton = false;
                            break;
                        } else if (!creciente && presente >= anterior){
                            dalton = false;
                            break;
                        }
                        anterior = presente;
                    }
                }
                sc.nextLine();
                if (dalton) {
                    System.out.println("DALTON");
                } else {
                    System.out.println("DESCONOCIDOS");
                } 
            }
        }
    }
}
