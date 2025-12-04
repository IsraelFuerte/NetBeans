package Unidad4;

import java.util.Scanner;

public class Prcatica16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int a;
        float b,tb,s,bs,tbs;
        
        System.out.println("cuantos años de antiguaedad tienes?");
        a=leer.nextInt();
        System.out.println("cuanto es tu sueldo ?");
        s=leer.nextFloat();
        
        if (a>2 && a<5) {
            b=s*0.20f;
            tb=s-b;
        } else {
            b=s*0.30f;
            tb=s+b;
        }
        if (s<1000) {
            bs=s*0.25f;
            tbs=s+bs;
        } else {
            if (s<=3500) {
                bs=s*0.15f;
                tbs=s+bs;
            } else {
                bs=s*0.10f;
                tbs=s+bs;
            }
        }
        System.out.println("EL TOTAL POR ANTIGUEDAD ES $ "+tb);
        System.out.println("EL TOTAL POR SUELDO ES $"+tbs);
    }
    
}
