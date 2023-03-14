
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enogal
 */
public class Ejercicio633 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        TreeMap<String, Integer> machos = new TreeMap<String, Integer>();
        TreeMap<String, Integer> hembras = new TreeMap<String, Integer>();
        String animal;
        do {
            n = Integer.parseInt(sc.nextLine());
            if (n != 0) {
                for (int i = 0; i < n; i++) {
                    animal = sc.next();
                    if (animal.substring(animal.length() - 1).equals("o")) {
                        animal = animal.substring(0, animal.length() - 1);
                        machos.put(animal, machos.getOrDefault(animal, 0) + 1);
                    } else {
                        animal = animal.substring(0, animal.length() - 1);
                        hembras.put(animal, hembras.getOrDefault(animal, 0) + 1);
                    }
                }
                sc.nextLine();
                //System.out.println("Machos: " + machos);
                //System.out.println("Hembras: " + hembras);
                tratarDatos(machos, hembras);
                machos.clear();
                hembras.clear();
            }
        } while (n != 0);
    }

    public static void tratarDatos(TreeMap<String, Integer> machos, TreeMap<String, Integer> hembras) {
        int parejasCompletas = 0;
        int parejasIncompletas = 0;
        int sobrantes = 0;
        for (Map.Entry<String, Integer> entry : machos.entrySet()) {
            String key = entry.getKey();
            int nMachos = entry.getValue();
            int nHembras = hembras.getOrDefault(key, 0);
            //System.out.println(key + ": " + nMachos + " - " + nHembras);
            if (nMachos != 0 && nHembras != 0) {
                parejasCompletas += Math.min(nMachos, nHembras);
                sobrantes += (Math.max(nMachos, nHembras) - Math.min(nMachos, nHembras));
            } else {
                parejasIncompletas += Math.max(nMachos, nHembras);
            }
        }
        System.out.println(parejasCompletas + " " + parejasIncompletas + " " + sobrantes);
    }
}
