package Unidad4;

import java.util.Scanner;

public class Examen2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        float l = 0,p,cs = 0;
        String a,n;
        
        System.out.println("NOMBRE: ");
        n=leer.next();
        System.out.println("CUAL ES TU PESO (Kg)");
        p=leer.nextFloat();
        System.out.println("CUAL ES TU ACTIVIDAD FICIICA");
        a=leer.next();
        
        if (p<50) {
            if (a.equals("poca")) {
                l=1.5f;
                cs=l*7;
            } else {
                if (a.contentEquals("moderada")) {
                    l=2.0f;
                    cs=l*7;
                } else {
                    if (a.contentEquals("intensa")) {
                        l=2.5f;
                        cs=l*7;
                    } else {
                        System.out.println("ELIJE UNA OPCION EXISTENTE");
                    }
                }
            }
        } else {
            if (p<=70) {
                 if (a.equals("poca")) {
                l=2.0f;
                cs=l*7;
            } else {
                if (a.contentEquals("moderada")) {
                    l=2.5f;
                    cs=l*7;
                } else {
                    if (a.contentEquals("intensa")) {
                        l=3.0f;
                        cs=l*7;
                    } else {
                        System.out.println("ELIJE UNA OPCION EXISTENTE");
                    }
                }
            }
            } else {
                  if (a.equals("poca")) {
                l=2.0f;
                cs=l*7;
            } else {
                if (a.contentEquals("moderada")) {
                    l=2.5f;
                    cs=l*7;
                } else {
                    if (a.contentEquals("intensa")) {
                        l=3.0f;
                        cs=l*7;
                    } else {
                        System.out.println("ELIJE UNA OPCION EXISTENTE");
                    }
                }
            }
            }
    }
        System.out.println("PESO: "+p);
        System.out.println("ACTIVIDAD FICICA: "+a);
        System.out.println("CONSUMO DIARIO: "+l);
        System.out.println("COMSUMO SEMANAL: "+cs);
    }
}
