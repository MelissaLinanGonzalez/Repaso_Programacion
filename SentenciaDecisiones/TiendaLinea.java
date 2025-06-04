import java.util.Scanner;

public class TiendaLinea {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la cantidad (€) que ha comprado: ");
        double cantidad = entrada.nextDouble();
        System.out.print("¿Es miembro de la tienda? (true/false): ");
        boolean miembro = entrada.nextBoolean();

        final double CANTIDAD_MINIMA_DESCUENTO = 100;

        if (cantidad >= CANTIDAD_MINIMA_DESCUENTO && miembro){
            System.out.println("TIenes un descuento del 10%");
        } else if (miembro) {
            System.out.println("Tienes un desceunto del 5%");
        } else {
            System.out.println("No tienes ningún descuento");
        }
    }
}
