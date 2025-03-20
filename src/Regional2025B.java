
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enriquenogal
 */
public class Regional2025B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, r;
        do {
            n = sc.nextInt();
            if (n == 0) {
                break;
            }
            r = n;
            do {
                n = sc.nextInt();
                if (n == 0) {
                    System.out.println(r);
                    break;
                }
                r *= n;
            } while (true);
        } while (true);
    }
}
