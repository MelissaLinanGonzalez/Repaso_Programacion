import java.util.Scanner;

public class GeneradorTicketVenta {
    public static void main(String[] args) {
        System.out.println("*** Generación de Ticket de Venta ***");
        Scanner entrada = new Scanner(System.in);
        System.out.print("Precio leche: ");
        double leche = entrada.nextDouble();
        System.out.print("Precio pan: ");
        double pan = entrada.nextDouble();
        System.out.print("Precio lechuga: ");
        double lechuga = entrada.nextDouble();
        System.out.print("Precio plátanos: ");
        double platanos = entrada.nextDouble();

        // Calculamos el total sin IVA
        double sumTotal = leche + pan + lechuga + platanos;

        // Calculamos con el IVA 21%
        double impuestos = sumTotal * 0.21;

        // Calculo total con impuestos
        double total = sumTotal + impuestos;

        System.out.printf("""
                \nTICKET
                \tSuma total sin IVA: %.2f €,
                \tIVA (21%%): %.2f €,
                \tTotal con IVA: %.2f €
                """, sumTotal, impuestos, total);
    }
}
