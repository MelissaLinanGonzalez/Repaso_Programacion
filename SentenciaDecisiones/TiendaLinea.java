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
            double descuento = cantidad * 0.10;
            double total = cantidad - descuento;
            System.out.printf("""
                    Felicidades, has obtenido un descuento del 10%%
                    Suma de la compra: %.2f €
                    Cantidad de descuento: %.2f €
                    Total de la compra: %.2f
                    """, cantidad, descuento, total);
        } else if (miembro) {
            double descuento = cantidad * 0.05;
            double total = cantidad - descuento;
            System.out.printf("""
                    Felicidades, has obtenido un descuento del 5%%
                    Suma de la compra: %.2f €
                    Cantidad de descuento: %.2f €
                    Total de la compra: %.2f
                    """, cantidad, descuento, total);
        } else {
            System.out.printf("""
                    No has obtenido ningún descuento.
                    Te invitamos a que te unas a nuestro club
                    Total de la compra: %.2f €
                    """, cantidad);
        }
    } 
}
