public class NumerosParesConFor {
    public static void main(String[] args) {
        System.out.println("*** Números pares del 0 al 20 con for ***");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
