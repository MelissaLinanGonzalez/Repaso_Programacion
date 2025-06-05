public class CicloWhile {
    public static void main(String[] args) {
        System.out.println("*** Ciclo While ***");

        int contador = 1;
        while (contador <= 5){
            System.out.println(contador++); // La mostramos y cuando se vaya a volver a usar la variable, aumenta
        }
    }
}
