package level20;


import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio171 {

    public Scanner sc;
    public ArrayList<Integer> montanyas;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> montanyas = new ArrayList<Integer>();
        int n = -1, max, count;

        while (n != 0) {
            n = sc.nextInt();
            if (n != 0) {
                max = 0;
                count = 0;
                montanyas.clear();
                for (int i = 0; i < n; i++) {
                    montanyas.add(sc.nextInt());
                }
                for (int i = n - 1; i >= 0; i--) {
                    if (montanyas.get(i) > max) {
                        count++;
                        max = montanyas.get(i);
                    }
                }
                System.out.println(count);
            }
        }
    }
}
