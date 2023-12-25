package level2;


import java.util.HashMap;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enriquenogal
 */
public class Ejercicio637 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> m = new HashMap<Character, Integer>();
        int contador;
        String msg;
        rellenarMap(m);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            contador = 0;
            msg = sc.nextLine();
            for (int j = 0; j < msg.length(); j++) {
                if (msg.charAt(j) == ' ') {
                    contador += 2;
                } else {
                    contador += m.get(msg.charAt(j));
                    contador += 3;
                }
            }
            contador -= 3;
            System.out.println(contador);
        }
    }

    public static void rellenarMap(HashMap<Character, Integer> m) {
        m.put('A', calculoLetra(".-"));
        m.put('B', calculoLetra("-..."));
        m.put('C', calculoLetra("-.-."));
        m.put('D', calculoLetra("-.."));
        m.put('E', calculoLetra("."));
        m.put('F', calculoLetra("..-."));
        m.put('G', calculoLetra("--.")); 
        m.put('H', calculoLetra("...."));
        m.put('I', calculoLetra(".."));
        m.put('J', calculoLetra(".---"));
        m.put('K', calculoLetra("-.-"));
        m.put('L', calculoLetra(".-.."));
        m.put('M', calculoLetra("--"));
        m.put('N', calculoLetra("-."));
        m.put('O', calculoLetra("---"));
        m.put('P', calculoLetra(".--."));
        m.put('Q', calculoLetra("--.-"));
        m.put('R', calculoLetra(".-."));
        m.put('S', calculoLetra("..."));
        m.put('T', calculoLetra("-"));
        m.put('U', calculoLetra("..-"));
        m.put('V', calculoLetra("...-"));
        m.put('W', calculoLetra(".--"));
        m.put('X', calculoLetra("-..-"));
        m.put('Y', calculoLetra("-.--"));
        m.put('Z', calculoLetra("--.."));
        m.put('!', calculoLetra("-.-.--"));
        m.put('?', calculoLetra("..--.."));
    }

    public static int calculoLetra(String s) {
        int r = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                r += 2;
            } else {
                r += 4;
            }
        }
        r -= 1;
        return r;
    }

}
