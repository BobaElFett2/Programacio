import java.util.Random;
import java.util.Scanner;


public class Provademerda {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        Random r = new Random();

        int alt = 100, baj = 0,numero = 0;
        Boolean salir = false;

        while (salir == false) {

            numero = r.nextInt((alt - baj) + 1) + baj;

            System.out.print("¿Es " + numero  + " el correcto? (Si/No): ");
            String resp = sc.nextLine();
            System.out.println(resp);

            // NO entra en el IF per culpa del String

            if (resp.equals("Si")) {
                System.out.println("Gracias!!");
                salir = true;
            } else if (resp.equals("No")) {
                System.out.print("¿Es mayor o menor? (Mayor/Menor): ");
                String myme = sc.nextLine();

                if (myme.equals("Mayor")) {
                    baj = numero + 1;
                } else if (myme.equals("Menor")){
                    alt = numero - 1;
                }
            }


            // System.out.println("Numero de alto: "+alt);
            // System.out.println("Numero de bajo: "+baj);
            // System.out.println("La respuesta es: "+resp);

            sc.close();
        }

    }
}