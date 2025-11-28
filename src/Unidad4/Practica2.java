package Unidad4;

import java.util.Scanner;

public class Practica2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int num;
         
        System.out.println("DAME UNN NUMERO");
        num = leer.nextInt();
        
        if (num==0) {
            System.out.println("CERO");
        } else {
            if (num>0) {
                System.out.println("POSITIVO");
            } else {
                System.out.println("NEGATIVO");
            }
        }
    }
    
}
