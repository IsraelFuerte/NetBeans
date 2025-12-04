package Unidad4;

import java.util.Scanner;

public class Practica13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
       int h;
       float t,ta = 0;
       
        System.out.println("Tal de horas: ");
        h=leer.nextInt();
        
        if (h<=2) {
            t=5.00f;
            ta=t*h;
        } else {
            if (h<=5) {
                t=4.00f;
                ta=(h-2)*4+10;
            } else {
                if (h<=10) {
                    t=3.00f;
                    ta=(h-5)*3+22;
                } else {
                    t=2.00f;
                    ta=(h-10)*2+37;
                }
            }
        }
        System.out.println("EL TOTAL A PAGAR ES $"+ta);
    }
    
}
