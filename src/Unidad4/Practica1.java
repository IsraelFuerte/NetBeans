package Unidad4;

import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int promedio;
        
        System.out.println("cual fue su promedio: ");
        promedio= leer.nextInt();
        
        if (promedio>70) {
            System.out.println("APROBADO");
        } else {
            System.out.println(" NO APROVADO");
        }
    }
    
}
