
package Unidad4;

import java.util.Scanner;

public class Practica8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int ti;
        String di = null, tu = null;
        float pag,im, tot,de;
        
        System.out.println("CUANTO TIEMPO HABLO POR TELEFONO(SEGUNDOS): ");
        ti=leer.nextInt();
        System.out.println("QUE DIA ES HOY? ");
        di=leer.next();
        
        if (ti<5) {
            pag=1.00f;
        } else {
            if (ti<8) {
                pag=0.80f;
            } else
                if (ti<10) {
                pag=0.70f;
            } else {
                    pag=0.50f;
            }
        }
        if (di.equals("D")) {
            de=pag*0.03f;
        } else {
            if (tu.equals("M")) {
                de=pag*0.15f;
            } else {
                de=pag*0.10f;
            }
        }
        tot=ti*pag;
        im=tot+de;
        System.out.println("TOTAL A PAGAR ES $"+tot);
        System.out.println("EL MPUESTO ES DE $"+de);
        System.out.println("TOTAL DE LA LLAMADA $"+im);
    }
    
}
