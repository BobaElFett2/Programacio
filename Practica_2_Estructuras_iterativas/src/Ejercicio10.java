import java.util.Scanner;

public class Ejercicio10 {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        boolean salir = false;
        int cont = 0;

        while (salir == false) {

            System.out.print("Introduce un número: ");
            while (!sc.hasNextInt()) {
                System.out.println("Introduzca un número");
                System.out.print("Introduce un número: ");
                sc.next();
            }
            int n = sc.nextInt();

            if (n < 0 || n > 10) {
                salir = true;
                System.out.println("Introduce numeros entre 0 y 10");
            } else if (n == 10) {
                cont = cont + 1;
            }

        }

        System.out.println("\nHubo " + cont + " notas con un 10.");

        sc.close();

    }
}
