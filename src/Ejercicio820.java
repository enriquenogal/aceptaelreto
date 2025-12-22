// TLE - precioso pero no sé que puedo acortar para que lleve menos tiempo
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enogal
 */
public class Ejercicio820 {

    static class Nodo {

        int fila;
        int columna;
        int filaPadre;
        int columnaPadre;
        int coste;

        public Nodo(int fila, int columna, int filaPadre, int columnaPadre, int coste) {
            this.fila = fila;
            this.columna = columna;
            this.filaPadre = filaPadre;
            this.columnaPadre = columnaPadre;
            this.coste = coste;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Nodo other = (Nodo) obj;
            if (this.fila != other.fila) {
                return false;
            }
            return this.columna == other.columna;
        }

    }

    static ArrayList<Nodo> pdtes = new ArrayList<Nodo>(); //cola de nodos pendientes de procesar
    static ArrayList<Nodo> procesados = new ArrayList<Nodo>(); //lista de nodos ya procesados de los que quiero guardar información

    public static void main(String[] args) {
        //el main sólo me sirve para leer los datos que me pasan en cada caso
        Scanner sc = new Scanner(System.in);
        char[][] mapa;
        char[] tmp;
        int columnas, filas;
        while (sc.hasNextLine()) {
            columnas = sc.nextInt();
            filas = sc.nextInt();
            sc.nextLine();
            mapa = new char[filas][columnas];
            for (int i = 0; i < filas; i++) {
                tmp = sc.nextLine().toCharArray();
                for (int j = 0; j < columnas; j++) {
                    mapa[i][j] = tmp[j];
                }
            }
            tratarCaso(mapa, filas, columnas); //una vez leída la entrada de cada caso la proceso
        }
    }

    private static void tratarCaso(char[][] mapa, int filas, int columnas) {
        if (mapa[0][0] == 'N' || mapa[filas - 1][columnas - 1] == 'N') { //si el inicio o el fin del camino es N pues IMPOSIBLE
            System.out.println("IMPOSIBLE");
        } else { //si no tengo que hacer cosas
            pdtes.clear(); //vacío la cola
            procesados.clear(); //vacío la lista de procesados
            pdtes.add(new Nodo(0, 0, -1, -1, 1)); //añado a la cola de pendientes de nodos el inicial
            while (pdtes.size() != 0) { //proceso la cola hasta que se vacie
                procesar(pdtes.get(0), mapa); //proceso el nodo de la posición 0 de la cola de pendientes
                pdtes.remove(0); //una vez procesado borro ese nodo de la cola
            }
            Nodo fin = new Nodo(filas - 1, columnas - 1, 0, 0, 0); //genero un nodo fin ficticio
            if (!procesados.contains(fin)) { //busco entre los procesados si exite un nodo con las mismas coordenadas que el nodo fin ficticio
                System.out.println("IMPOSIBLE"); //si no estuviese IMPOSIBLE
            } else {
                System.out.println(procesados.get(procesados.indexOf(fin)).coste); //si estuviese muestro el coste
            } 
        }
    }

    private static void procesar(Nodo n, char[][] mapa) {
        procesados.add(n); //añado el nodo a los procesados
        if (!(n.fila == mapa.length && n.columna == mapa[0].length)) { //si estoy en el final no hago nada más
            Nodo anterior, nuevo;
            //siguientes for: en i y j meto las coordenadas de todos los nodos de alrededor (incluso de si mismo)
            for (int i = n.fila - 1; i <= n.fila + 1; i++) {
                for (int j = n.columna - 1; j <= n.columna + 1; j++) {
                    //siguiente if: para sólo procesar nodos válidos y que no sean ni el actual ni del que viene 
                    if (i >= 0 && j >= 0 && i < mapa.length && j < mapa[0].length //para evitar los fueras de límites
                            && !(i == n.fila && j == n.columna) //para evitar el mismo nodo en el que estoy 
                            && !(i == n.filaPadre && j == n.columnaPadre) //para evitar el nodo desde el que vengo
                            && mapa[i][j] == '.') { //para evitar por donde no se puede transitar 
                        nuevo = new Nodo(i, j, n.fila, n.columna, n.coste + 1); //genero el nuevo nodo
                        if (!procesados.contains(nuevo)) { //si no está
                            pdtes.add(nuevo); //lo añado a la cola de pendientes
                        } else { //si estuviese
                            anterior = procesados.get(procesados.indexOf(nuevo)); //recupero lo que tuviese
                            if (anterior.coste > nuevo.coste) { //si el coste que tuviese anteriormente fuese mayor
                                procesados.remove(procesados.indexOf(nuevo)); //lo borro de procesados
                                pdtes.add(nuevo); //lo añado a cola de pendientes
                            }
                        }
                    }
                }
            }
        }
    }
}
