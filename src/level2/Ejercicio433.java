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
public class Ejercicio433 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numUvas = Integer.parseInt(sc.nextLine());
        int contadorNiveles, uvasNivel;
        while (numUvas > 0) {
            contadorNiveles = 0;
            uvasNivel = 1;
            while (numUvas >= uvasNivel){
                contadorNiveles++;
                numUvas = numUvas - uvasNivel;
                uvasNivel++;
            }
            if (numUvas > 0 ) {
                contadorNiveles++;
            }
            System.out.println(contadorNiveles);
            numUvas = Integer.parseInt(sc.nextLine());
        }
    }

}
