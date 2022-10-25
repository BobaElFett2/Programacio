import java.util.Scanner;

public class Ejercicio7 {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        int nega = 0, cont = 0;

        for (int i = 0; i < 10; i++) {

            System.out.print("\nIntroduce un número: ");
            while (!sc.hasNextInt()) {
                System.out.println("Introduzca un número");
                System.out.print("Introduce un número: ");
                sc.next();
            }
            int n = sc.nextInt();

            if (n < 0) {
                nega = nega + 1;
            } else {
                cont = cont + 1;
            }

        }

        System.out.println("El número de numeros negativos es : " + nega);
        System.out.println("El número de numeros positivos es : " + cont);

    }

}
