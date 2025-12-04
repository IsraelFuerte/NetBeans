package AMEN;

import java.util.Scanner;

public class AMEN {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int A1,A2,A3,A4;
        System.out.print("Ingrese el primer año: ");
        A1 = leer.nextInt();
        System.out.print("Ingrese el segundo año: ");
        A2 = leer.nextInt();
        System.out.print("Ingrese el tercer año: ");
        A3 = leer.nextInt();
        System.out.print("Ingrese el cuarto año: ");
        A4 = leer.nextInt();
        
        if (A1 % 4 == 0) {
            if (A1 % 100 == 0) {
                if (A1 % 400 == 0) {
                    System.out.println("En el año " + A1 + ", febrero tiene 29 días.");
                } else {
                    System.out.println("En el año " + A1 + ", febrero tiene 28 días.");
                }
            } else {
                System.out.println("En el año " + A1 + ", febrero tiene 29 días.");
            }
        } else {
            System.out.println("En el año " + A1 + ", febrero tiene 28 días.");
        }
        
        if (A2 % 4 == 0) {
            if (A2 % 100 == 0) {
                if (A2 % 400 == 0) {
                    System.out.println("En el año " + A2 + ", febrero tiene 29 días.");
                } else {
                    System.out.println("En el año " + A2 + ", febrero tiene 28 días.");
                }
            } else {
                System.out.println("En el año " + A2 + ", febrero tiene 29 días.");
            }
        } else {
            System.out.println("En el año " + A2 + ", febrero tiene 28 días.");
        }
        
        if (A3 % 4 == 0) {
            if (A3 % 100 == 0) {
                if (A3 % 400 == 0) {
                    System.out.println("En el año " + A3 + ", febrero tiene 29 días.");
                } else {
                    System.out.println("En el año " + A3 + ", febrero tiene 28 días.");
                }
            } else {
                System.out.println("En el año " + A3 + ", febrero tiene 29 días.");
            }
        } else {
            System.out.println("En el año " + A3 + ", febrero tiene 28 días.");
        }
        
        if (A4 % 4 == 0) {
            if (A4 % 100 == 0) {
                if (A4 % 400 == 0) {
                    System.out.println("En el año " + A4 + ", febrero tiene 29 días.");
                } else {
                    System.out.println("En el año " + A4 + ", febrero tiene 28 días.");
                }
            } else {
                System.out.println("En el año " + A4 + ", febrero tiene 29 días.");
            }
        } else {
            System.out.println("En el año " + A4 + ", febrero tiene 28 días.");
        }
    }
}
