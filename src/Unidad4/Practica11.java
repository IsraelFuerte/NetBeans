package Unidad4;

import java.util.Scanner;

public class Practica11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
     int nc;
     float cc,ct;
     
        System.out.println("CITA NO°:");
        nc=leer.nextInt();
        
        if (nc<=3) {
            cc=200.00f;
            ct=cc*nc;
        } else {
            if (nc<=5) {
                cc=150.00f;
                ct=(nc-3)*150+600;
            } else {
                if (nc<=8) {
                    cc=100.00f;
                    ct=(nc-5)*100+900;
                } else {
                    cc=50.00f;
                    ct=(nc-8)*50+1200;
                }
            }
        }
        System.out.println("EL COSTO DE LA CITA ES DE $ "+cc);
        System.out.println("EL TOTAL POR EL TRATAMIENTO ES DE $ "+ct);
    }
}
