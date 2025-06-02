import java.util.Scanner;

public class Clase_Scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un texto para comprobar cómo se introducen datos desde consola: ");
        String texto = entrada.nextLine();
        System.out.println(texto);
    }
}
