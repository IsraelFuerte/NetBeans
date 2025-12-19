package AMEN;

public class PRACTICA17 {
    public static void main(String[] args) {
        
                int n=7,j;
        
        for (int i = n+1; i >=0; i--) {
            for (j = 0; j <i ; j++) {
                System.out.print(" ");
            }
            if (i<=n) {
                for (int eb = 0; eb < (n-j)+1; eb++) {
                    System.out.print("**");
                }
            }
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("");

        }
    }
}

