public class Matrices {
    public static void main(String[] args) {
        // Definimos la matriz
        int[][] matriz = new int[2][3];
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;

        // Accedemos a los valores
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("[" + i + "]" + "[" + j + "]" + ": " + matriz[i][j]);
            }
        }
    }
}
