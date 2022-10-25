import java.util.Scanner;

public class Ejercicio8 {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        boolean salir = false;
        int nega = 0, cont = 0;

        while (salir == false) {

            System.out.print("\nIntroduce un número: ");
            while (!sc.hasNextInt()) {
                System.out.println("Introduzca un número");
                System.out.print("Introduce un número: ");
                sc.next();
            }
            int n = sc.nextInt();

            if (n == 0) {
                salir = true;
            } else {
                if (n < 0) {
                    nega = nega + 1;
                } else {
                    cont = cont + 1;
                }
            }

        }

        System.out.println("El número de numeros negativos es : " + cont);
        System.out.println("El número de numeros positivos es : " + nega);

    }

}
