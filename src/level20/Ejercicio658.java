
package level20;
import java.util.Scanner;

/**
 *
 * @author enogal
 */
public class Ejercicio658 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
            if (n != 0) {
                tratarCaso(n);
            }
        } while (n != 0);
    }

    public static void tratarCaso(int n) {
        int c = 1;
        int min = 1;
        int max = 1;
        for (int i = 3; true; i = i + 2) {
            if (n >= min && n <= max) {
                break;
            } else {
                c++;
                min = max + 1;
                max = max + (i * i);
            }
        }
        System.out.println(c);
    }
}