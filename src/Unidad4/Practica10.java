package Unidad4;

import java.util.Scanner;

public class Practica10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        String ta,tp;
        float p,t,ts,ct;
        int n = 0; 
        
        System.out.println("TIPO DE AMBURGUESA(sencilla,doble,triple): ");
        ta=leer.next();
        System.out.println("TIPO DE PAGO(tarjeta o efecctivo): ");
        tp=leer.next();
        System.out.println("CUANTAS AMBURGUESAS QUIERE?");
        n=leer.nextInt();
        
        if (ta.equals("sencilla")) {
            p=20.00f;
        } else {
            if (ta.equals("doble")) {
                p=25.00f;
            } else {
                p=28.00f;
            }
        }
        t=p*n;
        if (tp.equals("tarjeta")) {
            ts=t*0.05f;
        } else {
            ts=t*0;
        }
        
        ct=n*p+ts;
        
        System.out.println("SON $"+ ct +"POR LA COMPRA");

    }
    
}
