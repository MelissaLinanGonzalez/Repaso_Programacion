import java.util.Scanner;

public class RangoVariable {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Proporciona un numero entero: ");
        int dato = entrada.nextInt();

        // Revisamos si está dentro de rango ( 1 y 10 ambos incluidos)
        boolean dentroRango = dato >= 1 && dato <= 10;
        System.out.println("Variable dentro de rango (1 y 10): " + dentroRango);

        // Revisar la lógica inversa, si el dato está fuera de rango
        boolean fueraRango = !(dato >= 1 && dato <= 10);
        System.out.println("Varibale fuera de rango (1 y 10): " + fueraRango);
    }
}
