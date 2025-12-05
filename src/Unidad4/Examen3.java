package Unidad4;

import java.util.Scanner;

public class Examen3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int c,h,t,to = 0;
        
        System.out.println("CUANTAS F¿HORAS LLEVA: ");
        h=leer.nextInt();
        
        if (h<=2) {
            t=15;
            to=t*h;
        } else {
            if (h<=5) {
              t=13;
              to=(h-2)*13+30;
            } else {
                if (h<=10) {
                    t=8;
                    to=(h-5)*8+69;
                } else {
                    t=5;
                    to=(h-10)*5+109;
                }
            }
        }
        System.out.println("EL TOAL ES $ "+to);
    }
    
}
