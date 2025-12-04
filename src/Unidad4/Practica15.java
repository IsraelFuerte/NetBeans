package Unidad4;

import java.util.Scanner;

public class Practica15 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        float b = 0,p;
        int e;
        
        System.out.println("QUE EDAD TIENES(AÑOS): ");
        e=leer.nextInt();
        System.out.println("CUAL ES TU PROMEDIO:");
        p=leer.nextFloat();
        
        if (e>=19) {
            if (p>=9.00) {
                b=2000.00f;
            } else {
                if (p>=7.50) {
                    b=1000.00f;
                } else {
                    if (p>=6.00) {
                        b=500.00f;
                    } else {
                        System.out.println("ESTUDIEN MAS EN EL SIGUIENTE CICLO ESCOLAR");
                    }
                }
            }
        } else {
            if (p>=9.00) {
                b=3000.00f;
            } else {
                if (p>=8) {
                    b=2000.00f;
                } else {
                    if (p>=6) {
                        b=100.00f;
                    } else {
                        System.out.println("ESTUDIEN MAS EN EL SIGUIENTE CICLO ESCOLAR");
                    }
                }
            }
        }
        System.out.println("TU BECA ES DE $"+b);
    }
    
}
