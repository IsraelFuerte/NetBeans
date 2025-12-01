package Unidad4;

import java.util.Scanner;

public class Practica7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int pa,a;
        int ta;
        
        System.out.println("CUANTOS ALUMNOS ASISTIRAN AL VIAJE? ");
           a=leer.nextInt();
        if (a>=100) {
            pa=65;
        } else {
            if (a>=50) {
                pa=70;
            } else {
                if (a>=30) {
                    pa=95;
                } else {
                    pa=4000/a;
                }
            }
        }
        ta=a*pa;
        
        System.out.println("COSTO DE VOLETO POR ALUMNO: "+pa);
        System.out.println("TOTAL DEL DINERO DE VOLETOS: "+ta);
    }
    
}
