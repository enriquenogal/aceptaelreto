package level3;


import java.util.Scanner;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
public class Ejercicio141 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;
        Stack st;
        while (sc.hasNextLine()) {
            entrada = sc.nextLine();
            st = new Stack<>();
            for (int i = 0; i < entrada.length(); i++) {
                if (entrada.charAt(i) == '(' || entrada.charAt(i) == '[' || entrada.charAt(i) == '{' ||
                        entrada.charAt(i) == ')' || entrada.charAt(i) == ']' || entrada.charAt(i) == '}') {
                    if (entrada.charAt(i) == '(' || entrada.charAt(i) == '[' || entrada.charAt(i) == '{') {
                        st.push(entrada.charAt(i));
                    } else if (!st.empty() && ((entrada.charAt(i) == ')' && (char) st.peek() == '(')
                            || (entrada.charAt(i) == '}' && (char) st.peek() == '{')
                            || (entrada.charAt(i) == ']' && (char) st.peek() == '['))) {
                        st.pop();
                    } else {
                        st.push(entrada.charAt(i));
                    }
                }
            }
            if (st.empty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
