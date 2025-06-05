import java.util.Scanner;

public class ValidadContraseña {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean seguir = false;

        while (!seguir){
            System.out.println("*** Creación y validación de contraseña ***");
            System.out.print("Introduce la contraseñan, debe tener al menos 6 caractéres: ");
            String password = entrada.nextLine();
            if (password.length() >= 6){
                System.out.println("Contraseña válida.");
                System.out.println(" ");
                seguir = true;
            } else {
                System.out.println("La contraseña debe tener al menos 6 caractéres!");
                System.out.println(" ");
            }
        }

    }
}
