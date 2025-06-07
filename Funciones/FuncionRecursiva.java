public class FuncionRecursiva {
    // Imprimir los valores del 1 al 5 usando una función recursiva
    // Funcion recirsiva
    static void funcionRecurisva(int num){
        // Caso Base
        if (num == 1){
            System.out.print(num + " ");
        }else {
            // Caso recursivo
            funcionRecurisva(num - 1);
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("*** Función recursiva ***");
        funcionRecurisva(5);
    }
}
