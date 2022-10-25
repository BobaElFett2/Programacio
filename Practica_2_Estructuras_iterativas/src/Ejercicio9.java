public class Ejercicio9 {

    public static void main (String [] args) {

        int suma, mult;

        for (int i = 1; i < 11; i++) {
            mult = i;
            suma = i;
            suma = suma + suma;
            mult = mult + mult;

            System.out.println("La suma es igual a: " + suma);
            System.out.println("La multplicación es igual a: " + mult + "\n");
        }

    }

}
