import java.util.Random;
import java.util.Scanner;

public class Ejercicio13 {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        Random r = new Random();

        int alt = 100, baj = 0, numero;
        boolean salir = false;

        while (salir == false) {

            numero = r.nextInt((alt - baj) + 1) + baj;

            System.out.print("¿Es " + numero  + " el correcto? (Si/No): ");
            String resp = sc.nextLine();
            System.out.println(resp);

            if (resp.equalsIgnoreCase("Si")) {
                System.out.println("Gracias!!");
                salir = true;
            } else if (resp.equalsIgnoreCase("No")) {
                System.out.print("¿Es mayor o menor? (Mayor/Menor): ");
                String myme = sc.nextLine();

                if (myme.equalsIgnoreCase("Mayor")) {
                    baj = numero + 1;
                } else if (myme.equalsIgnoreCase("Menor")){
                    alt = numero - 1;
                }
            }


            // System.out.println("Numero de alto: "+alt);
            // System.out.println("Numero de bajo: "+baj);
            // System.out.println("La respuesta es: "+resp);
        }

        sc.close();
    }
}
