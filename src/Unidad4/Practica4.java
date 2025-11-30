package Unidad4;

import java.util.Scanner;

public class Practica4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int CT;
        float DE, PF,D;
        
        System.out.println("CUAL ES EL PRECIO DEL TRAJE: ");
       CT = leer.nextInt();
       
        if (CT >2500) {
            DE=0.15f;
        } else {
            DE=0.08f;
        }
        D=CT*DE;
        PF=CT-D;
        
        System.out.println("EL PRECIO FINL ES: "+PF);
        System.out.println("EL DESCUENTO ES: "+D);
    }
    
}
