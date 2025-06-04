import java.util.Scanner;

public class ReservaHotel {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Reserva de Hotel ***");

        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre del cliente: ");
        String nombre = entrada.nextLine();
        System.out.print("Días de estancia: ");
        int dias = entrada.nextInt();
        System.out.print("Habitación con vistas al mar? (true/false): ");
        boolean vistas = entrada.nextBoolean();

        final double PRECIO_SIN_VISTAS = 40;
        final double PRECIO_CON_VISTAS = 50;

        if (vistas){
            String mensaje = "¡SI :)!";
            double precioTotal = dias * PRECIO_CON_VISTAS;
            System.out.printf("""
                    \n-------- Detalles de la Reserva --------
                    \tCliente: %s
                    \tDías de estancia: %d
                    \tPrecio por día: %.2f €
                    \tCoste total: %.2f €
                    \tHabitación con vistas al mar: %s
                    """, nombre, dias, PRECIO_CON_VISTAS, precioTotal, mensaje);
        } else {
            String mensaje = "¡NO :(!";
            double precioTotal = dias * PRECIO_SIN_VISTAS;
            System.out.printf("""
                    \n-------- Detalles de la Reserva --------
                    \tCliente: %s
                    \tDías de estancia: %d
                    \tPrecio por día: %.2f
                    \tCoste total: %.2f €
                    \tHabitación con vistas al mar: %s
                    """, nombre, dias, PRECIO_SIN_VISTAS, precioTotal, mensaje);
        }
    }
}
