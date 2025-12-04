package AMEN;

import java.util.Scanner;

public class Prexa1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n1, n2, n3, n4;
        int e1, e2, e3, e4;

        System.out.print("Nombre 1: ");
        n1 = sc.nextLine();
        System.out.print("Edad: ");
        e1 = sc.nextInt(); sc.nextLine();

        System.out.print("Nombre 2: ");
        n2 = sc.nextLine();
        System.out.print("Edad: ");
        e2 = sc.nextInt(); sc.nextLine();

        System.out.print("Nombre 3: ");
        n3 = sc.nextLine();
        System.out.print("Edad: ");
        e3 = sc.nextInt(); sc.nextLine();

        System.out.print("Nombre 4: ");
        n4 = sc.nextLine();
        System.out.print("Edad: ");
        e4 = sc.nextInt();

        int mayor = e1;
        String resultado = n1;

        // Comparar con el segundo
        if (e2 > mayor) {
            mayor = e2;
            resultado = n2;
        } else if (e2 == mayor) {
            resultado += ", " + n2;
        }

        // Comparar con el tercero
        if (e3 > mayor) {
            mayor = e3;
            resultado = n3;
        } else if (e3 == mayor) {
            resultado += ", " + n3;
        }

        // Comparar con el cuarto
        if (e4 > mayor) {
            mayor = e4;
            resultado = n4;
        } else if (e4 == mayor) {
            resultado += ", " + n4;
        }

        System.out.println("\nLa mayor edad es " + mayor + " años.");
        System.out.println("Persona(s): " + resultado);
    }
}