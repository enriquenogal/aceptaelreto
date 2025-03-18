
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enriquenogal
 */
public class Regional2025J {

    static class Nodo {

        int idNodo;
        int caminos;
        ArrayList<Integer> enlaces;
        char tipo;

        public Nodo(int idNodo, int caminos, ArrayList<Integer> enlaces, char tipo) {
            this.idNodo = idNodo;
            this.caminos = caminos;
            this.enlaces = enlaces;
            this.tipo = tipo;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numNodos;
        while (sc.hasNextLine()) {
            numNodos = Integer.parseInt(sc.nextLine());
            leerDatos(sc, numNodos);
        }
    }

    private static void leerDatos(Scanner sc, int numNodos) {
        Nodo[] nodos = new Nodo[numNodos + 1];
        int numEnlaces, caminos = 1;
        String tipo;
        ArrayList<Integer> enlaces;
        for (int idNodo = 1; idNodo < numNodos + 1; idNodo++) {
            numEnlaces = sc.nextInt();
            if (numEnlaces == 0) {
                tipo = sc.next();
                nodos[idNodo] = new Nodo(idNodo, caminos, null, tipo.charAt(0));
            } else {
                enlaces = new ArrayList<Integer>();
                for (int i = 0; i < numEnlaces; i++) {
                    enlaces.add(sc.nextInt());
                }
                nodos[idNodo] = new Nodo(idNodo, caminos, enlaces, '0');
            }
            caminos = 0;
            sc.nextLine();
        }
        tratarCaso(nodos);
    }

    private static void tratarCaso(Nodo[] nodos) {
        ArrayList<Nodo> pdtesProcesar = new ArrayList<Nodo>();
        pdtesProcesar.add(nodos[1]);
        Nodo procesando;
        int nodosF = 0, nodosA = 0, tmp;
        while (pdtesProcesar.size() > 0) {
            procesando = pdtesProcesar.get(0);
            if (procesando.enlaces != null) {
                for (int i = 0; i < procesando.enlaces.size(); i++) {
                    tmp = procesando.enlaces.get(i);
                    nodos[tmp].caminos = (nodos[tmp].caminos + procesando.caminos) % 1000000007;
                    pdtesProcesar.add(nodos[tmp]);
                }
            } else {
                if (procesando.tipo == 'F') {
                    nodosF = (nodosF + procesando.caminos) % 1000000007;
                } else {
                    nodosA = (nodosA + procesando.caminos) % 1000000007;
                }
            }
            pdtesProcesar.remove(0);
        }
        System.out.println(nodosF + " " + nodosA);
    }

}
