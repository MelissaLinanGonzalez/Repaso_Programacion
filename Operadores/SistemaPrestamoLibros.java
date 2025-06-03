import java.util.Scanner;

public class SistemaPrestamoLibros {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Préstamo de Libros ***");
        final float MAX_DISTANCIA = 3;

        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Eres estudiante? (true/false): ");
        boolean estudiante = entrada.nextBoolean();

        System.out.print("¿A qué distancia (km) de la biblioteca vive?: ");
        float distancia = entrada.nextFloat();

        // Se comprueba si se cumple alguna de las condiciones establecidas
        if (estudiante || distancia <= MAX_DISTANCIA){
            System.out.println("Puede obtener libro");
        } else {
            System.out.println("No puede obtener libro");
        }
    }
}
