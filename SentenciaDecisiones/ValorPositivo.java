import java.util.Scanner;

public class ValorPositivo {
    public static void main(String[] args) {
        System.out.println("*** Valor Positivo ***");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Proporciona un número: ");
        int num = entrada.nextInt();

        if (num > 0){
            System.out.println("Es positivo: " + num);
        } else if (num < 0){
            System.out.println("Es negativo: " + num);
        } else {
            System.out.println("El numero proporcionado es cero: " + num);
        }
    }
}
