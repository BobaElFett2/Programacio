import java.util.Scanner;

public class Ejercicio5 {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número: ");
        int n = sc.nextInt();

        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de " + n + " es:" + factorial);
    }



}
