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

        System.out.print("Aplicar algún descuento (%)?: ");
        double descuentoProcentaje = entrada.nextInt();

        // Calculamos el total sin IVA
        double sumTotal = leche + pan + lechuga + platanos;

        // Aplicamos el descuento
        double descuento = sumTotal * (descuentoProcentaje / 100);
        double totalConDescuento = sumTotal - descuento;

        // Calculamos con el IVA 21%
        double impuestos = totalConDescuento * 0.21;

        // Calculo total con impuestos y descuento
        double total = totalConDescuento + impuestos;
        //kjhlkjhlkjlkjhlkjhlkj
        System.out.printf("""
                \nTICKET
                \tSuma total sin IVA: %.2f €,
                \tDescuento aplicado (%.0f%%): %.2f €,
                \tIVA (21%%): %.2f €,
                \tTotal con IVA: %.2f €
                """, sumTotal, descuentoProcentaje, descuento, impuestos, total);
    }
}
