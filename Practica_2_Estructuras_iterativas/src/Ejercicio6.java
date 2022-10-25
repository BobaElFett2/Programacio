import java.util.Scanner;

public class Ejercicio6 {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {


            System.out.print("\nIntroduce un número: ");
            int n = sc.nextInt();

            if (n < 0) {
                System.out.println("El número que ha introducido es negativo.\n");
            } else {
                System.out.println("El número que ha introducido es positivo.\n");
            }

        }

    }

}
