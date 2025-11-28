package Unidad4;

import java.util.Scanner;

public class Practica3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int lapices;
        float precio, total;
        
        System.out.println("CUANTOS LAPICES NECESITAS:");
        lapices = leer.nextInt();
        if (lapices>1000) {
            precio=0.85f;
        } else {
            precio=0.90f;
        }
        total=precio*lapices;
        
        System.out.println("EL TOTAL A PAGAR ES: "+total);
    }
}
