import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Envíos ***");

        final double PRECIO_NACIONAL = 10;
        final double PRECIO_INTERNACIONAL = 20;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el destino del paquete (nacional / internacional): ");
        String destino = entrada.nextLine().toLowerCase();

        System.out.print("Ingresa el peso del paquete (en Kg); ");
        double peso = entrada.nextDouble();

        double total = 0;
        if (destino.equals("nacional") && peso > 0){
            total = peso * PRECIO_NACIONAL;
        } else if (destino.equals("internacional") && peso > 0) {
            total = peso * PRECIO_INTERNACIONAL;
        } else {
            System.out.println("Datos introducidos no válidos");
        }

        System.out.println("El coste total del envío es: " + total + " €");
    }
}
