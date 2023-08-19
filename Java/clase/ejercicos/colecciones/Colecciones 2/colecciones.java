package clase.ejercicios.colecciones.ColeccionesII;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.Scanner;

public class colecciones {

    /*
     * Ejercicio 1 Método llamado eliminarLasDeLongitudPar que acepte un conjunto de
     * cadenas y elimine del mismo todas aquellas cadenas de una longitud par. No se
     * permite el uso de ninguna otra estructura de datos auxiliar.
     */

    // ESTO DE NORMAL
    /*
     * public static void eliminarLasDeLongitudPar(Set<String> conSet) {
     * // Recorre el conjunto de cadenas
     * Iterator<String> iterator = conSet.iterator();
     * // Verifica la longitud es par
     * while (iterator.hasNext()) {
     * String cadena = iterator.next();
     * if (cadena.length() % 2 == 0) {
     * iterator.remove();
     * }
     * }
     * }
     * 
     */

    // ESTO PARA USAR EL SCANNER
    public static void eliminarLasDeLongitudPar(Set<String> conSet) {
        // recorre el conjunto de cadenas
        Iterator<String> iterator = conSet.iterator();

        // Crea un conjunto auxiliar para almacenar cadenas a eliminar
        Set<String> cadenasAEliminar = new HashSet<>();

        // Verifica la longitud es par y agrega a conjunto auxiliar
        while (iterator.hasNext()) {
            String cadena = iterator.next();
            if (cadena.length() % 2 == 0) {
                cadenasAEliminar.add(cadena);
            }
        }
        // Elimina las cadenas del conjunto original
        conSet.removeAll(cadenasAEliminar);
    }

    public static void main(String[] args) {

        // EJERCICIO 1 (COMO MANDA EL ENUNCIADO)
        /*
         * Set<String> conjuntoOSet = new HashSet<>();
         * conjuntoOSet.add("Leo");
         * conjuntoOSet.add("Kilari");
         * conjuntoOSet.add("Farkas");
         * 
         * eleminarLasDeLongitudPar(conjuntoOSet);
         * System.out.println("Conjunto después de eliminar cadenas de longitud par: " +
         * conjuntoOSet);
         */

        // EL MISMO EJERCICO PERO CON SCANNER
        Set<String> conjuntoOSet = new HashSet<>();
        Scanner s = new Scanner(System.in);

        System.out.println("Escribe la cantidad de cadenas, es decir, un numero: ");
        int cantidad = Integer.parseInt(s.nextLine());

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Cadena " + (i + 1) + ": ");
            String cadena = s.nextLine();
            conjuntoOSet.add(cadena);
        }

        eliminarLasDeLongitudPar(conjuntoOSet);

        System.out.println("Conjunto después de eliminar cadenas de longitud par: ");
        for (String cadena : conjuntoOSet) {
            System.out.println(cadena);
        }

    }
}
