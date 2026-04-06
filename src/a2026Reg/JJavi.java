/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RegionalMadrid2026;
import java.util.*;

/**
 *
 * @author javier
 */
public class JJavi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ninas;
        int n;
        do {
            n = sc.nextInt();
            if (n != 0) {
                ninas = new int[n];
                for (int i = 0; i < n; i++) {
                    ninas[i] = sc.nextInt();
                }
                if (puedeOrdenar(ninas)) System.out.println("SI");
                else System.out.println("NO");
            }
        } while (n != 0);
    }
    
    public static boolean puedeOrdenar(int[] ninas) {
        int n1 = 0;
        int n2 = ninas.length - 1;
        while (n1 < n2) {
            if (ninas[n1] > ninas[n2]) {
                int tmp = ninas[n1];
                ninas[n1] = ninas[n2];
                ninas[n2] = tmp;
            }
            n1++;
            n2--;
        }
        int ant = ninas[0];
        for (int i = 1; i < ninas.length; i++) {
            if (ninas[i] < ant) return false;
            ant = ninas[i];
        }        
        return true;
    }
}