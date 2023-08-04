
import java.text.DecimalFormat;

public class te2_2 {

    /*
     * Escribe un programa que muestre
     * en la consola la división de 1234
     * entre 532, siendo ambos números reales.
     * El resultado se mostrará con un máximo de 3 dígitos, de
     * los cuales dos se utilizarán para la parte decimal.
     */

    public static void main(String[] args) {
        double num1 = 532.0;
        double num2 = 1234.0;

        double resultado = num2 / num1;

        DecimalFormat forma = new DecimalFormat("0.00");
        String resultadoFormateado = forma.format(resultado);

        System.out.println(resultadoFormateado);
    }
}