package Unidad4;

import java.util.Scanner;

public class Pracctica12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        float precio = 0, peso;
        int zona = 0;
        
        System.out.println("PESO (EN GRAMOS)?");
        peso=leer.nextFloat();
        
        if (peso>0 && peso<5000) {
            
            System.out.println("ENVIOS");
            System.out.println("1.- NORTE");
            System.out.println("2.- CENTRO");
            System.out.println("3.- SUR");
            System.out.println("4.- EUROPA");
            System.out.println("5.- ASIA");
            System.out.println("QUE SONA (1-5)");
            zona=leer.nextInt();
            
            switch(zona){
                case 1:
                    precio=11.00f;
                    break;
                case 2:
                    precio=10.00f;
                    break;
                case 3: 
                    precio=12.00f;
                    break;
                case 4: 
                    precio=24f;
                    break;
                case 5:
                    precio=27.00f;
                    break;
            }
            System.out.println("el total es $"+(peso*precio));
        } else {
            System.out.println("LO SENTIMOS, NO PODEMOS HACER SU ENVIO");
        }
        
    }
    
}
