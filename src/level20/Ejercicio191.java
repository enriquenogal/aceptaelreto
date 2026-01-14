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
public class Ejercicio191 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;
        String entradas[];
        int numAcuarios, litrosAcuario, diferencia, totalLitros;
        int numero = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numero; i++) {
            entrada = sc.nextLine();
            entradas = entrada.split(" ");
            numAcuarios = Integer.parseInt(entradas[0]);
            litrosAcuario = Integer.parseInt(entradas[1]);
            diferencia = Integer.parseInt(entradas[2]);
            totalLitros = 0;
            for (int j = 0; j < numAcuarios; j++) {
                totalLitros = totalLitros + litrosAcuario;
                litrosAcuario = litrosAcuario - diferencia;
            }
            System.out.println(totalLitros);
        }       
        
    }
    
}
