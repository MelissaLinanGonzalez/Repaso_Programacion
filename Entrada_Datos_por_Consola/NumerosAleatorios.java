import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        System.out.println("*** Números aleatorios ***");
        Random random = new Random();

        // Generar número aleatorio entre 0 y 9
        int numAleatorio = random.nextInt(10);
        System.out.println("Número aleatorio entre 0 y 9: " + numAleatorio);

        // Generar número aleatorio entre 1 y 10
        int numAleatorio2 = random.nextInt(10) + 1;
        System.out.println("Número aleatorio entre 1 y 10: " + numAleatorio2);

        // Generar un númer flotante entre 0.0 y 1.0
        float floAle = random.nextFloat();
        System.out.println("Número aleatorio float: " + floAle);

        // Simulación de lanzamiento de un dado (Entre 1 y 6)
        int dado = random.nextInt(6) + 1;
        System.out.println("Resultado del dado: " + dado);
    }
}
