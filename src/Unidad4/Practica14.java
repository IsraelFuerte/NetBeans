package Unidad4;

import java.util.Scanner;

public class Practica14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int p;
        float d,t;
        
        System.out.println("PRECIO $");
        p=leer.nextInt();
        
        if (p>=200) {
            d=p*0.15f;
            t=p-d;
        } else {
            if (p>=100) {
                d=p*0.12f;
                t=p-d;
            } else {
                d=p*0.10f;
                t=p-d;
            }
        }
        System.out.println("EL TOTAL A PAGAR ES $"+t);
    }
    
}
