package Unidad4;

import java.util.Scanner;

public class Practica6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String tamaño, tipo;
        float precio=140f, total, kilos;
        
        System.out.println("TIPO DE UVA(A o B): ");
        tipo=leer.next();
        System.out.println("TAMAÑO DE UVA(1 o 2): ");
        tamaño= leer.next();
        System.out.println("CANTIDAD EN KILOS: ");
        kilos=leer.nextFloat();
        
        if (tipo.equals("A")) {
            if (tipo.equals("1")) {
                precio=precio+0.20f;
            } else {
                precio=precio+0.30f;
            }
        } else {
            if (tipo.equals("1")) {
                precio=precio-0.30f;
            } else {
                precio=precio-0.50f;
            }
        }
        total=precio*kilos;
        System.out.println("EL TOTAÑ ES $"+total);
    }
    
}
