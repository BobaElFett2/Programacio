public class Ejercicio11 {

    public static void main (String [] args) {

        int sumap = 0, sumai = 0;

        for (int i = 100; i <= 200; i++) {

            if (i % 2 == 0) {
                sumap = sumap + i;
            } else {
                sumai = sumai + i;
            }

        }

        System.out.println("La suma de los números pares es: " + sumap);
        System.out.println("La suma de los números impares es: " + sumai);
    }

}
