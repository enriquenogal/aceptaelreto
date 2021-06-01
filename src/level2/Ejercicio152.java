package level2;


import java.util.HashMap;
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
public class Ejercicio152 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1, a, mayor;
        String moda = "";
        HashMap<String,Integer> mapa;
        while (n > 0) {
            n = sc.nextInt();
            if (n > 0) {
                moda = "";
                mapa = new HashMap<String,Integer>();
                for (int i = 0; i < n; i++) {
                    a = sc.nextInt();
                    if (!mapa.containsKey(Integer.toString(a))) {
                        mapa.put(Integer.toString(a), 1);
                    } else {
                        mapa.put(Integer.toString(a), (int) mapa.get(Integer.toString(a)) + 1);
                    }           
                }
                mayor = 0;
                for (String s : mapa.keySet()) {
                    if ((int)mapa.get(s)>mayor){
                        mayor = (int)mapa.get(s);
                        moda = s;
                    }
                }             
                System.out.println(moda);
            }
        }
    }
}
