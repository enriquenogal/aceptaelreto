package level20;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio667c {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String valor;
        do {
            valor = sc.nextLine();
            if (!valor.equals("0")) {
                int[] anio = new int[10];
                for (int i = 0; i < 4; i++) {
                    anio[Integer.parseInt(Character.toString(valor.charAt(i)))] += 1;
                }
                String[] linea = sc.nextLine().split(" ");
                int aux;
                int personas = Integer.MAX_VALUE;
                for (int i = 0; i < 10; i++) {
                    aux = Integer.parseInt(linea[i]);
                    if (anio[i] != 0) {
                        if (!(personas <= (aux / (anio[i] * 3)))) {           
                            personas =  aux / (anio[i] * 3);
                        }
                    }
                }
                System.out.println(personas);
            }
        } while (!valor.equals("0"));
    }

}
