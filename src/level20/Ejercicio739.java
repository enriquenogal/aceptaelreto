package level20;

import java.util.Scanner;
public class Ejercicio739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double anchoPared, altoPared, anchoAzulejo, altoAzulejo;
        int h, v;
        for (int i = 0; i < n; i++) {
            anchoPared = sc.nextInt();
            altoPared = sc.nextInt();
            anchoAzulejo = sc.nextInt();
            altoAzulejo = sc.nextInt();
            h = (int)Math.ceil(anchoPared/anchoAzulejo) * (int)Math.ceil(altoPared/altoAzulejo);
            v = (int)Math.ceil(anchoPared/altoAzulejo) * (int)Math.ceil(altoPared/anchoAzulejo);
            System.out.println(Math.min(h, v));
        }
    }
}