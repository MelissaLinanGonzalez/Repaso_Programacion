import java.util.Scanner;

public class EsPar {
    static boolean detectarPar(int a){
//        if (a % 2 == 0){
//            return true;
//        } else {
//            return false;
//        }
        return a % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un valor numérico entero para saber si es par: ");
        int a = entrada.nextInt();

        boolean par = detectarPar(a);
        System.out.println(par);

    }
}
