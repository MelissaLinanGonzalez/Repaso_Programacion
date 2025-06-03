import java.util.Scanner;

public class SistemaDescuento {
    public static void main(String[] args) {
        final int NUM_PRODUCTOS_DESCEUNTO = 10;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce cuántos productos ha comprado hoy: ");
        int cantidadProductos = entrada.nextInt();

        System.out.print("¿Eres miembro de la tienda?(true/false): ");
        boolean miembro = entrada.nextBoolean();

        if (cantidadProductos >= NUM_PRODUCTOS_DESCEUNTO && miembro){
            System.out.println("¡TIENES DESCUENTO VIP");
        } else {
            System.out.println("No tienes descuento VIP");
        }

    }
}
