import java.util.Scanner;

public class Ejercicio4 {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número maximo: ");
        int n = sc.nextInt();

        for (int i = 1; i < n + 1; i++) {
                System.out.println(i);
        }

    }

}
