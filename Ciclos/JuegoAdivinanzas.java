import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanzas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int numSecreto = random.nextInt(50) + 1;
        int intentos = 0;

        System.out.println("!Intenta adivinar el número secreto, entre 1 y 50!");
        boolean seguir = false;
        while (!seguir){
            System.out.print("Introduce el número que creas que es: ");
            int num = entrada.nextInt();
            if (num == numSecreto){
                intentos++;
                System.out.println("Enhorabuena! has hacertado el número: " + numSecreto);
                System.out.println("Lo has conseguido en " + intentos + " intentos");
                seguir = true;
            } else if (numSecreto > num){
                System.out.println("El número buscado es mayor al introducido \n");
                intentos++;
            } else {
                System.out.println("El número introducido es mayor al buscado \n");
                intentos++;
            }
        }
    }
}
