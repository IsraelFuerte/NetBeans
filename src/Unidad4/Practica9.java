package Unidad4;

import java.util.Scanner;

public class Practica9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        String t;
        float ck, cp, ct;
        int p, km, np;
        
        System.out.println("TIPO DE AUTOBUS(A, B, o C): ");
        t=leer.next();
        System.out.println("KILOMETROS POR RECORRER: ");
        km = leer.nextInt();
        System.out.println("NUMERO DE PASAJEROS: ");
        p=leer.nextInt();
        
        if (t.equals("A")) {
            ck=2.00f;
        } else {
            if (t.equals("B")) {
                ck=2.50f;
            } else {
                ck=3.00f;
            }
        }
        if (p>20) {
            np=20;
        } else {
            np=p;
        }
        ct=np*ck*km;
        cp=ct/np;
        
        System.out.println("TOTAL DE VIAJE $"+ct);
        System.out.println("EL COSTO POR PERSONA ES $"+cp);
    }
    
}
