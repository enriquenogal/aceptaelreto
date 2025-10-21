
import java.util.ArrayList;
import java.util.HashSet;
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
        ArrayList<Integer> pdtesProcesar = new ArrayList<Integer>();
        HashSet<Integer> sNodosF = new HashSet<Integer>();
        HashSet<Integer> sNodosA = new HashSet<Integer>();
        pdtesProcesar.add(1);
        Nodo procesando;
        int nodosF = 0, nodosA = 0, tmp, idProcesando;
        while (pdtesProcesar.size() > 0) {
            idProcesando = pdtesProcesar.get(0);
            procesando = nodos[idProcesando];
            if (procesando.enlaces != null) {
                for (int i = 0; i < procesando.enlaces.size(); i++) {
                    tmp = procesando.enlaces.get(i);
                    nodos[tmp].caminos = (nodos[tmp].caminos + procesando.caminos) % 1000000007;
                    pdtesProcesar.add(tmp);
                }
            } else {
                if (procesando.tipo == 'F') {
                    sNodosF.add(idProcesando);
                } else {
                    sNodosA.add(idProcesando);
                }
            }
            pdtesProcesar.remove(0);
        }
        for (Integer indice : sNodosF) {
            nodosF = (nodosF + nodos[indice].caminos) % 1000000007;
        }
        for (Integer indice : sNodosA) {
            nodosA = (nodosA + nodos[indice].caminos) % 1000000007;
        }
        System.out.println(nodosF + " " + nodosA);
    }

}
