package Unidad4;

import java.util.Scanner;

public class Practica5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
         
        int p,Pr,t;
        
        System.out.println("CUANTAS PERSONAS SE PRESENTARAN A EL VANQUETE:  ");
        p = leer.nextInt();
        
        if (p>300) {
            Pr=75;
        } else {
            if (p>200) {
                Pr=85;
            } else {
                Pr=95;
            }
        }
        t=p*Pr;
        
        System.out.println("EL TOTAL A PAGAR ES: "+t);
    }
    
}
