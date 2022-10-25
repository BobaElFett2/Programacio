import java.util.Scanner;

public class Ejercicio12 {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        int total = 1;

        System.out.print("Introduce el primer número: ");
        int n1 = sc.nextInt();

        System.out.print("Introduce el primer número: ");
        int n2 = sc.nextInt();

        for (int i = 1; i <= n2; i++) {
            total = total * n1;
        }

        System.out.println("El producto es igual a: " + total);
    }

}
