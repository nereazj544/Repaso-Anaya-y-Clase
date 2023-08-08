import java.util.Scanner;

public class te2_17 {
    /*
     * Escribe un programa que lea el
     * nombre del usuario y a
     * continuación muestre muestre los
     * segundos y milisegundos que ha
     * tardado en contestar, con un
     * formato de salida que emplee
     * exactamente 3 dígitos en la parte
     * decimal.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");

        // Calculos de la tardanca

        long tInicidad = System.currentTimeMillis();
        String nombre = sc.nextLine();
        long tFin = System.currentTimeMillis();

        /*
         * Se resta para tener los milisegundos, tal y como esta puesto ahora:
         * long tResultadoM = tInicidad - tFin;
         * Daria un resultado negativo.
         */
        long tResultadoM = tFin - tInicidad;

        // Los milisegundos se dividen
        double tResultadoS = tResultadoM / 100.0;

        System.out.printf(nombre + " Has tardado %.3f en introducir tu nombre: %n ", tResultadoS);
    }
}
