package level2;

import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author enrique.nogal
 */
public class Ejercicio270 {

    private class EntradaIncorrectaException extends Exception {

    }

    public static void main(String[] args) {
        new Ejercicio270().run();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
        int n = -1;
        while (n != 0) {
            n = Integer.parseInt(sc.nextLine());
            if (n != 0) {
                tm.clear();
                for (int i = 0; i < n; i++) {
                    try {
                        leeDatos(sc, tm);
                    } catch (EntradaIncorrectaException ex) {
                        System.out.println("Entrada Incorrecta");
                    }
                }
                imprimeDatos(tm);
            }
        }
    }

    public void leeDatos(Scanner sc, TreeMap<String, Integer> tm) throws EntradaIncorrectaException {
        String nombre = sc.nextLine();
        String nota = sc.nextLine();
        if (!nota.equals("CORRECTO") && !nota.equals("INCORRECTO")) {
            throw new EntradaIncorrectaException();
        } else {
            int puntos;
            if (nota.equals("CORRECTO")) {
                puntos = 1;
            } else {
                puntos = -1;
            }
            if (tm.containsKey(nombre)) {
                tm.put(nombre, tm.get(nombre) + puntos);
            } else {
                tm.put(nombre, puntos);
            }
        }
    }

    public void imprimeDatos(TreeMap<String, Integer> tm) {
        for (String nombre : tm.keySet()) {
            if (tm.get(nombre) != 0) {
                System.out.println(nombre + ", " + tm.get(nombre));
            }
        }
        System.out.println("---");
    }
}