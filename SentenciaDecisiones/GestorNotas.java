import java.util.Scanner;

// Crear un programa para convertir una calificación numérica (entre 0 y 10) a letras (SB, NOT, B, S, IN)
public class GestorNotas {
    public static void main(String[] args) {
        System.out.println("*** Sistema Gestor de Notas ***");
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la nota redondeada sin decimales: ");
        int nota = entrada.nextInt();

        switch (nota){
            case 0,1,2,3,4 -> System.out.println("IN");
            case 5 -> System.out.println("S");
            case 6 -> System.out.println("B");
            case 7,8 -> System.out.println("NOT");
            case 9,10 -> System.out.println("SB");
            default -> System.out.println("Nota no válida");
        }
    }
}
