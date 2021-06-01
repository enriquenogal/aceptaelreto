package level3;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
public class Ejercicio345 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[][] sudoku = new int[9][9];
        int[] aux;
        boolean correcto;
        int indAux;

        for (int i = 0; i < n; i++) {
            correcto = true;
            //relleno
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    sudoku[j][k] = sc.nextInt();
                }
                sc.nextLine();
            }

            //compruebo las filas;
            for (int j = 0; j < 9; j++) {
                if (check(sudoku[j]) == false) {
                    correcto = false;
                    break;
                }

            }

            //compurebo columnas
            if (correcto) {
                for (int j = 0; j < 9; j++) {
                    aux = new int[9];
                    for (int k = 0; k < 9; k++) {
                        aux[k] = sudoku[k][j];
                    }
                    if (check(aux) == false) {
                        correcto = false;
                        break;
                    }
                }
            }

            //compruebo regiones - esto se puede mejorar, pero me cuesta menos copiar y pegar
            if (correcto) {
                for (int z = 0; z < 9; z = z + 3) {
                    aux = new int[9];
                    indAux = 0;
                    for (int j = z; j < z + 3; j++) {
                        for (int k = 0; k < 3; k++) {
                            aux[indAux] = sudoku[j][k];
                            indAux++;
                        }
                    }
                    if (check(aux) == false) {
                        correcto = false;
                        break;
                    }
                }
            }
            
            if (correcto) {
                for (int z = 0; z < 9; z = z + 3) {
                    aux = new int[9];
                    indAux = 0;
                    for (int j = z; j < z + 3; j++) {
                        for (int k = 3; k < 6; k++) {
                            aux[indAux] = sudoku[j][k];
                            indAux++;
                        }
                    }
                    if (check(aux) == false) {
                        correcto = false;
                        break;
                    }
                }
            }
            
            if (correcto) {
                for (int z = 0; z < 9; z = z + 3) {
                    aux = new int[9];
                    indAux = 0;
                    for (int j = z; j < z + 3; j++) {
                        for (int k = 6; k < 9; k++) {
                            aux[indAux] = sudoku[j][k];
                            indAux++;
                        }
                    }
                    if (check(aux) == false) {
                        correcto = false;
                        break;
                    }
                }
            }
            
            
            //imprimo
            if (correcto) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }

    }

    public static boolean check(int[] a) {
        boolean resultado = true;
        boolean[] checkers = new boolean[10];
        for (int i = 0; i < checkers.length; i++) {
            checkers[i] = false;
        }
        for (int i = 0; i < a.length; i++) {
            checkers[a[i]] = true;
        }
        for (int i = 1; i < checkers.length; i++) {
            if (checkers[i] == false) {
                resultado = false;
                break;
            }
        }
        return resultado;
    }

}
