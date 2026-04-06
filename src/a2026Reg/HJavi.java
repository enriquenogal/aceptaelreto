package RegionalMadrid2026;
import java.util.*;

// Si cae por debajo de tEncendido, se enciende, y se queda encendida hasta que llegue a tDetectada

public class HJavi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, tEncendido, tApagado, tDetectada, mins;
        boolean encendido;
        do {
            n = sc.nextInt();
            tEncendido = sc.nextInt();
            tApagado = sc.nextInt();
            if (!(n == 0 && tEncendido == 0 && tApagado == 0)) {
                mins = 0;
                encendido = false;
                for (int i = 0; i < n; i++) {
                    tDetectada = sc.nextInt();
                    if (tDetectada < tEncendido) encendido = true;
                    else if (tDetectada >= tApagado) encendido = false;
                    if (encendido) mins++;
                }
                System.out.println(mins);
            }
        } while (!(n == 0 && tEncendido == 0 && tApagado == 0));        
    }
}
