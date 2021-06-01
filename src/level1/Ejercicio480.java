package level1;


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
public class Ejercicio480 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = Integer.parseInt(sc.nextLine());
        int compra, defecto, grupo, resultado;

        for (int i = 0; i < numero; i++) {
            compra = sc.nextInt();
            defecto = sc.nextInt();
            grupo = sc.nextInt();
            resultado = (compra / grupo) * defecto;
            if (compra % grupo != 0) {
                if (compra % grupo < defecto) {
                    resultado = resultado + (compra % grupo);
                } else {
                    resultado = resultado + defecto;
                }

            }
            System.out.println(resultado);
            sc.nextLine();
        }
    }

}
