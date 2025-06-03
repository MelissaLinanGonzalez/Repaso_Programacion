import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Autenticación ***");

        final String USUARIO = "admin";
        final int PASSWORD = 123;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el usuario: ");
        String usuario = entrada.nextLine();

        System.out.print("Introduce la contraseña: ");
        int password = entrada.nextInt();

        boolean auticado = USUARIO.equals(usuario) && PASSWORD == password;

        System.out.println("Los datos son correctos? " + auticado);
    }
}
