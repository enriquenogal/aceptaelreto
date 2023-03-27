
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enogal
 */
public class Ejercicio636 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, den, aux, cociente, index;
        String numeros, depurado;
        Map<Integer, Integer> m;
        while (sc.hasNext()) {
            numeros = "";
            m = new HashMap<>();
            aux = 0;
            index = Integer.MIN_VALUE;
            depurado = "";

            num = sc.nextInt();
            den = sc.nextInt();
            num = (num % den) * 10;
            while (num != 0) {
                cociente = num / den;
                num = num % den;

                if (m.containsKey(num)) {
                    index = m.get(num);
                    if (cociente != Character.getNumericValue(numeros.charAt(m.get(num)))) {
                        numeros += cociente;
                        index++;
                    }
                    break;
                }
                numeros += cociente;

                m.put(num, aux);
                aux++;
                num *= 10;
            }

            if (index == Integer.MIN_VALUE) {
                System.out.println(0 + "." + numeros);
            } else {
                for (int i = 0; i < numeros.length(); i++) {
                    if (i == index) {
                        depurado += "|";
                    }
                    depurado += numeros.charAt(i);
                }
                depurado += "|";
                System.out.println("0." + depurado);
            }
        }

    }
}
