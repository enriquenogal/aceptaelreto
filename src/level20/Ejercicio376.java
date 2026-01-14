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
public class Ejercicio376 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 1, contador, anterior = 0, presente = 0, posterior = 0;
        String[] entradas;
        while (numero != 0) {
            numero = Integer.parseInt(sc.nextLine());
            contador = 0;
            if (numero != 0) {
                entradas = sc.nextLine().split(" ");
                for (int i = 0; i < entradas.length; i++) {
                    if (i == 0) {
                        anterior = entradas.length - 1;
                        posterior = i + 1;
                    } else if (i == entradas.length - 1) {
                        anterior = i - 1;
                        posterior = 0;
                    } else {
                        anterior = i-1;
                        posterior = i+1;
                    }  
                    
                    anterior = Integer.parseInt(entradas[anterior]);
                    presente = Integer.parseInt(entradas[i]);
                    posterior = Integer.parseInt(entradas[posterior]);
                    //System.out.println(anterior + ":" + presente + ":" + posterior);
                    if (presente > anterior && presente > posterior) {
                        contador++;
                    }
                }
                System.out.println(contador);
            }
        }
    }
}
