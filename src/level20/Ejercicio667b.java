package level20;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enriquenogal
 */



public class Ejercicio667b {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static boolean caso() {

        String valor = sc.nextLine();

        if (valor.equals("0")) {
            return false;
        }

        int[] anio = new int[10];
        for (int i = 0; i < 4; i++) {
            anio[Integer.parseInt(Character.toString(valor.charAt(i)))] += 1;
        }

        String[] linea = sc.nextLine().split(" ");
        int aux;
        int personas = 2147483647;
        for (int i = 0; i < 10; i++) {
            aux = Integer.parseInt(linea[i]);

            if (anio[i] != 0) {
                personas = (personas <= (aux / (anio[i] * 3))) ? personas : aux / (anio[i] * 3);
            }
        }

        if (personas == 2147483647) {
            System.out.println(0);
            return true;
        }

        System.out.println(personas);

        return true;
    }

    public static void main(String[] args) {
        while (caso());
    }

}
