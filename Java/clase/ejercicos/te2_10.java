import java.util.Scanner;

public class te2_10 {
    /*
     * Escribir y ejecutar un programa
     * que resuelva una ecuación de 2o
     * grado introduciendo por teclado
     * las constantes a, b y c.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(
                "Vamos a calcular una ecuacion de segundo grando, para eso, necesito que nos des tres numeros. Para empezar; cual es el valor de 'a': ");
        double a = sc.nextDouble();

        System.out.println("Cual es el valor de 'b': ");
        double b = sc.nextDouble();

        System.out.println("Y para acabar cual es el valor de 'c': ");
        double c = sc.nextDouble();

        double ecuacion = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("La ecuacion no es de segundo grando. (A = 0)");
        } else if (ecuacion > 0) /* Varias soluciones */ {
            double x1 = (-b + Math.sqrt(ecuacion)) / (2 * a);
            double x2 = (-b - Math.sqrt(ecuacion)) / (2 * a);
            System.out.println("Esta ecuacion tiene varias soluciones");
            System.out.println("resultado x1: " + x1);
            System.out.println("resultado x2: " + x2);
        } else if (ecuacion == 0) /* Unica solucion */ {
            double x = -b / (2 * a);
            System.out.println("Solo tiene un resultado posible: ");
            System.out.println("Resultado de X: " + x);
        } else {
            System.out.println("La ecuacion no tiene soluciones reales (resultado negativo).");
        }

    }
}
