package Anaya;

public class ej4_2 {
    public static void main(String[] args) {
        /*
         * Ejercicio 4.2 - Lista todos los argumentos que recibas, pero mostrando su
         * posición:
         *
         * java Ejercicio04_02 hola como estás
         * 0) hola
         * 1) como
         * 2) estás
         */

        // de esta manera no fundiona
        /*
         * 
         * String[] posiciones = {"hola", "como", "estas"};
         * // es debido a el > esta al reves y que el print le faltan cosas, pero faltaba
         * for (int i = 0; i > posiciones.length; i++)
         * System.out.println(posiciones);
         */

        String[] posicion = { "hola", "como", "estas" };

        for (int i = 0; i < posicion.length; i++)
            System.out.println(i + ")" + posicion[i]);
    }
}
