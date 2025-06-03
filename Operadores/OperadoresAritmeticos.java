public class OperadoresAritmeticos {
    public static void main(String[] args) {
        System.out.println("*** Operadores Aritméticos ***");
        int a = 5, b = 3, resultado; // Declaración compuesta de variables, ya que todas son del mismo tipo

        // Suma +
        resultado = a + b;
        System.out.println("Resultado de la suma: " + resultado);

        // Resta -
        resultado = a - b;
        System.out.println("Resultado de la resta: " + resultado);

        // Multiplicación *
        resultado = a * b;
        System.out.println("Resultado de la multiplicación: " + resultado);

        // División /
        resultado = a / b; // Se obtiene la parte entera de la división
        System.out.println("Resultado de la división: " + resultado);

        // Módulo (Resto de la división) %
        resultado = a % b;
        System.out.println("Resto de la división: " + resultado);
    }
}
