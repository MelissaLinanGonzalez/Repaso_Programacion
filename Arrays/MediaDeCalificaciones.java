import java.util.Scanner;

public class MediaDeCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Nota media de Calificaciones ***");
        Scanner entrada = new Scanner(System.in);
        System.out.print("Cuántas notas deseas añadir?: ");
        int longitud = entrada.nextInt();
        double[]notas = new double[longitud];

        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota[" + i + "]: ");
            double nota = entrada.nextDouble();
            notas[i] = nota;
            suma += nota;
        }

        double media = suma / longitud;

        System.out.println("Nota media de las calificaciones: " + media);
    }
}
