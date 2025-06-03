import java.util.Scanner;

public class CalcularAreaPerimetro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce la base del rectángulo: ");
        double base = entrada.nextDouble();

        System.out.print("Introduce la altura del rectángulo: ");
        double altura = entrada.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);
        
        System.out.printf("""
                \nAltura: %.2f,
                Base: %.2f,
                Área: %.2f,
                Perímetro: %.2f
                """, altura, base, area, perimetro);
    }
}
