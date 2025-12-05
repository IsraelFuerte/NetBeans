package Unidad4;

import java.util.Scanner;

public class Practica17 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int d;
        
            System.out.println("PAQUETE A: Una televición,un modular,tres pares de zapatos,cinco camisas y cinco pantalones.");
            System.out.println("PAQUETE B: Una Grabadora, tres pares de zapatos,cinco camisas y cinco pantalones.");
            System.out.println("PAQUETE C: Dos pares de zapatos,tres camisas y tres pantalones.");
            System.out.println("PAQUETE D: Un par de zapatos, dos camisas y dos pantalones.");
        System.out.println("A CUANTO ASIENDE TU AGUINALDO $");
        d=leer.nextInt();
        
        if (d>50000) {
            System.out.println("PUEDES COMPRAR EL PAQUETE A");
        } else {
            if (d>=20000) {
                System.out.println("PUEDES COMPRAR EL PAQUETE B");
            } else {
                if (d>=10000) {
                    System.out.println("PUEDES COMOPRAR EL PAQUETE C ");
                } else {
                    System.out.println("PUEDES COMPRAR EL PAQUETE D ");
                }
            }
        }
        
    }
    
}
