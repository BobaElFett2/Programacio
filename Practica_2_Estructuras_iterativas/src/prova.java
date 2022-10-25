import java.util.Random;

public class prova {

    public static void main (String [] args) {

        Random r = new Random();

        int numero;
        int max = 49, min = 34;
        // numero = r.nextInt(((49-34) + 34));
        numero = r.nextInt((max - min) + 1) + min;
        System.out.println(numero);




    }

}
