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
                    //System.out.print(contador + " -> ");
                    contador += m.get(msg.charAt(j));
                    //System.out.print(msg.charAt(j) + ":" + m.get(msg.charAt(j)) + " -> " + contador);
                    contador += 3;
                    //System.out.println(" -> " + contador);
                }
            }
            contador -= 3;
            System.out.println(contador);
        }
    }

    public static void rellenarMap(HashMap<Character, Integer> m) {
        m.put('A', calculoLetra(".-"));// A	.-      113 = 5
        m.put('B', calculoLetra("-..."));// B	-...    3111111 = 9 
        m.put('C', calculoLetra("-.-."));// C	-.-.    3111311 = 11 
        m.put('D', calculoLetra("-.."));// D	-..     31111 = 7
        m.put('E', calculoLetra("."));// E	.       1 = 1
        m.put('F', calculoLetra("..-."));// F	..-.    1111311 = 9 
        m.put('G', calculoLetra("--."));// G	--.     31311 = 9 
        m.put('H', calculoLetra("...."));// H	....    1111111 = 7
        m.put('I', calculoLetra(".."));// I	..      111 = 3
        m.put('J', calculoLetra(".---"));// J	.---    1131313 = 13
        m.put('K', calculoLetra("-.-"));// K	-.-     31113 = 9
        m.put('L', calculoLetra(".-.."));// L	.-..    1131111 = 9
        m.put('M', calculoLetra("--"));// M	--      313 = 7
        m.put('N', calculoLetra("-."));// N	-.      311 =5
        m.put('O', calculoLetra("---"));// O	---     31313 = 11
        m.put('P', calculoLetra(".--."));// P	.--.    1131311 = 11
        m.put('Q', calculoLetra("--.-"));// Q	--.-    3131113 = 13
        m.put('R', calculoLetra(".-."));// R	.-.     11311 = 7
        m.put('S', calculoLetra("..."));// S	...     11111 = 5
        m.put('T', calculoLetra("-"));// T	-       3 = 3
        m.put('U', calculoLetra("..-"));// U	..-     11113 = 7
        m.put('V', calculoLetra("...-"));// V	...-    1111113 = 9
        m.put('W', calculoLetra(".--"));// W	.--     11313 = 9
        m.put('X', calculoLetra("-..-"));// X	-..-    3111113 = 11
        m.put('Y', calculoLetra("-.--"));// Y	-.--    3111313 = 13 
        m.put('Z', calculoLetra("--.."));// Z	--..    3131111 = 11 
        m.put('!', calculoLetra("-.-.--"));// !	-.-.--  31113111313 = 19
        m.put('?', calculoLetra("..--.."));// ?	..--..  11113131111 = 15
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
