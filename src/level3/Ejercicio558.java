package level3;


import java.util.ArrayList;
import java.util.LinkedHashMap;
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
public class Ejercicio558 {
    LinkedHashMap<String,Palabra> lhm;
    ArrayList<String> al;
    
    class Palabra {
        String p;
        
        public Palabra(String p) {
            this.p = p;
        }
        
        public void combinar(String s) {
            String fin = "";
            for (int i = 0; i < s.length(); i++) {
                if (Character.isUpperCase(s.charAt(i))) {
                    fin+=s.charAt(i);
                } else if (Character.isUpperCase(this.p.charAt(i))) {
                    fin+=this.p.charAt(i);
                } else {
                    fin+=s.charAt(i);
                }
            }
            this.p = fin;
        }
    }
    
    public static void main(String[] args) {
        new Ejercicio558().run();
    }
    
    public void run() {
        Scanner sc = new Scanner(System.in);
        int n;
        String palabra;
        while (sc.hasNextLine()) {
            n = Integer.parseInt(sc.nextLine());
            lhm = new LinkedHashMap<String,Palabra>();
            al = new ArrayList<String>();
            for (int i = 0; i < n; i++) {
                palabra = sc.nextLine();
                al.add(palabra.toLowerCase());
                this.tratarPalabra(palabra);
            }
            this.salida();
            System.out.println("---");
        }
    }
    
    public void tratarPalabra(String palabra) {
        if (this.lhm.containsKey(palabra.toLowerCase())) {
            lhm.get(palabra.toLowerCase()).combinar(palabra);
        } else {
            Palabra p = new Palabra(palabra);
            lhm.put(palabra.toLowerCase(), p);
        }  
    }
    
    public void salida(){
        for (String s: this.al){
            System.out.println(this.lhm.get(s).p);
        } 
    }
    
}
