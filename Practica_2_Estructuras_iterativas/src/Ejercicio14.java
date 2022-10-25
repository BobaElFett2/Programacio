import java.util.Scanner;

public class Ejercicio14 {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        int qui = 0, dos = 0, cie = 0, cin = 0, vei = 0, die = 0, cinco = 0;

        System.out.print("Introduce una cantidad de euros: ");
        int euros = sc.nextInt();

        while (euros != 0) {

            if (euros >= 500) {
                euros = euros - 500;
                qui = qui + 1;
            } else if (euros >= 200) {
                euros = euros - 200;
                dos = dos + 1;
            } else if (euros >= 100) {
                euros = euros - 100;
                cie = cie + 1;
            } else if (euros >= 50) {
                euros = euros - 50;
                cin = cin + 1;
            } else if (euros >= 20) {
                euros = euros - 20;
                vei = vei + 1;
            } else if (euros >= 10) {
                euros = euros - 10;
                die = die + 1;
            } else if (euros >= 5) {
                euros = euros - 5;
                cinco = cinco + 1;
            }

        }

        System.out.println("\n-- Billetes -- ");
        System.out.println("-- Billetes de 500: " + qui);
        System.out.println("-- Billetes de 200: " + dos);
        System.out.println("-- Billetes de 100: " + cie);
        System.out.println("-- Billetes de 50: " + cin);
        System.out.println("-- Billetes de 20: " + vei);
        System.out.println("-- Billetes de 10: " + die);
        System.out.println("-- Billetes de 5: " + cinco);




        sc.close();

    }

}
